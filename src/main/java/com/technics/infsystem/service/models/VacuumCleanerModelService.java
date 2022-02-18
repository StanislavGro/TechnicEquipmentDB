package com.technics.infsystem.service.models;

import com.technics.infsystem.entities.equipments.VacuumCleanerEquipment;
import com.technics.infsystem.entities.models.VacuumCleanerModel;
import com.technics.infsystem.repository.equipments.VacuumCleanerEquipmentRepository;
import com.technics.infsystem.repository.models.VacuumCleanerModelRepository;
import com.technics.infsystem.service.abstraction.AbstractModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacuumCleanerModelService extends AbstractModelService<VacuumCleanerModel, VacuumCleanerModelRepository> {

    @Autowired
    private VacuumCleanerEquipmentRepository vacuumCleanerEquipmentRepository;

    public VacuumCleanerModelService(VacuumCleanerModelRepository repository) {
        super(repository);
    }

    @Override
    public void createModel(VacuumCleanerModel model) {
        Long id = model.getVacuumCleanerEquipment().getId();
        VacuumCleanerEquipment vacuumCleanerEquipment = vacuumCleanerEquipmentRepository.findById(id).get();
        model.setVacuumCleanerEquipment(vacuumCleanerEquipment);
        vacuumCleanerEquipment.addVacuumCleanerModel(model);
        repository.save(model);
    }

    @Override
    public void updateModel(Long id, VacuumCleanerModel model) {
        List<VacuumCleanerModel> vacuumCleanerModelList;
        vacuumCleanerModelList = repository.findAll();

        VacuumCleanerModel newVacuumCleanerModel;

        for (VacuumCleanerModel vacuumCleanerModel : vacuumCleanerModelList) {
            if (vacuumCleanerModel.getId() == id) {
                newVacuumCleanerModel = vacuumCleanerModel;
                newVacuumCleanerModel.setModelName(model.getModelName());
                newVacuumCleanerModel.setModelSize(model.getModelSize());
                newVacuumCleanerModel.setNumberOfModes(model.getNumberOfModes());
                newVacuumCleanerModel.setVolume(model.getVolume());
                newVacuumCleanerModel.setColor(model.getColor());
                newVacuumCleanerModel.setSerialNumber(model.getSerialNumber());
                newVacuumCleanerModel.setPrice(model.getPrice());
                newVacuumCleanerModel.setAvailable(model.isAvailable());
                repository.save(newVacuumCleanerModel);
            }

        }
    }

    @Override
    public List<VacuumCleanerModel> findByModelName(String modelName) {
        return repository.findByModelName(modelName);
    }

    @Override
    public List<VacuumCleanerModel> findByColor(String color) {
        return repository.findByColor(color);
    }

    @Override
    public List<VacuumCleanerModel> findByPrice(int from, int to) {
        return repository.findByPrice(from, to);
    }

    @Override
    public List<VacuumCleanerModel> incrSortByPriceAndColor() {
        return repository.incrSortByPriceAndColor();
    }

    @Override
    public List<VacuumCleanerModel> decrSortByPriceAndColor() {
        return repository.decrSortByPriceAndColor();
    }
}
