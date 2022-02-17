package com.technics.infsystem.service.abstraction;

import com.technics.infsystem.entities.abstraction.AbstractEquipment;
import com.technics.infsystem.entities.equipments.TVEquipment;
import com.technics.infsystem.repository.common.CommonEquipmentRepository;
import com.technics.infsystem.service.interfaces.CommonEquipmentService;

import java.util.List;
import java.util.Optional;

public abstract class AbstractEquipmentService<E extends AbstractEquipment, R extends CommonEquipmentRepository<E>>
        implements CommonEquipmentService<E> {

    protected final R repository;

    public AbstractEquipmentService(R repository) {
        this.repository = repository;
    }

    @Override
    public List<E> getAllEquipments() {
        return repository.findAll();
    }

    @Override
    public Optional<E> getEquipmentById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void updateEquipment(Long id, E equipment) {

        List<E> equipmentList;
        equipmentList = repository.findAll();

        E newEquipment;

        for (E forEquipment : equipmentList) {
            if (forEquipment.getId() == id) {
                newEquipment = forEquipment;
                newEquipment.setFirm(equipment.getFirm());
                newEquipment.setHasInstallmentPlan(equipment.isHasInstallmentPlan());
                newEquipment.setHasOnline(equipment.isHasOnline());
                newEquipment.setTypeName(equipment.getTypeName());
                newEquipment.setManufacturerCountry(equipment.getManufacturerCountry());
                repository.save(newEquipment);
            }

        }

    }

    @Override
    public void deleteEquipment(Long id) {
        repository.deleteById(id);
    }

}
