package com.technics.infsystem.controller.abstraction;

import com.technics.infsystem.controller.interfaces.CommonEquipmentController;
import com.technics.infsystem.entities.abstraction.AbstractEquipment;
import com.technics.infsystem.service.interfaces.CommonEquipmentService;

import java.util.List;
import java.util.Optional;

public abstract class AbstractEquipmentController<E extends AbstractEquipment, S extends CommonEquipmentService<E>>
        implements CommonEquipmentController<E> {

    private final S equipmentService;

    protected AbstractEquipmentController(S equipmentService) {
        this.equipmentService = equipmentService;
    }

    @Override
    public void createEquipment(E equipment) {
        equipmentService.createEquipment(equipment);
    }

    @Override
    public void deleteEquipment(Long id) {
        equipmentService.deleteEquipment(id);
    }

    @Override
    public Optional<E> getEquipmentById(Long id) {
        return equipmentService.getEquipmentById(id);
    }

    @Override
    public List<E> getAllEquipments() {
        return equipmentService.getAllEquipments();
    }

    @Override
    public void updateEquipment(Long id, E equipment) {
        equipmentService.updateEquipment(id, equipment);
    }

    @Override
    public List<E> findByTypeName(String typeName) {
        return equipmentService.findByTypeName(typeName);
    }
}
