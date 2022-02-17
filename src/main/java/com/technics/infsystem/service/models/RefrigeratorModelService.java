package com.technics.infsystem.service.models;

import com.technics.infsystem.entities.equipments.RefrigeratorEquipment;
import com.technics.infsystem.entities.equipments.SmartphoneEquipment;
import com.technics.infsystem.entities.models.RefrigeratorModel;
import com.technics.infsystem.entities.models.SmartphoneModel;
import com.technics.infsystem.repository.equipments.RefrigeratorEquipmentRepository;
import com.technics.infsystem.repository.equipments.SmartphoneEquipmentRepository;
import com.technics.infsystem.repository.models.RefrigeratorModelRepository;
import com.technics.infsystem.service.abstraction.AbstractModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefrigeratorModelService extends AbstractModelService<RefrigeratorModel, RefrigeratorModelRepository> {

    @Autowired
    private RefrigeratorEquipmentRepository refrigeratorEquipmentRepository;

    public RefrigeratorModelService(RefrigeratorModelRepository repository) {
        super(repository);
    }

    @Override
    public void createModel(RefrigeratorModel model) {
        Long id = model.getRefrigeratorEquipment().getId();
        RefrigeratorEquipment refrigeratorEquipment = refrigeratorEquipmentRepository.findById(id).get();
        model.setRefrigeratorEquipment(refrigeratorEquipment);
        refrigeratorEquipment.addRefrigeratorModel(model);
        repository.save(model);
    }

    @Override
    public void updateModel(Long id, RefrigeratorModel model) {
        List<RefrigeratorModel> refrigeratorModelList;
        refrigeratorModelList = repository.findAll();

        RefrigeratorModel newRefrigeratorModel;

        for (RefrigeratorModel refrigeratorModel : refrigeratorModelList) {
            if (refrigeratorModel.getId() == id) {
                newRefrigeratorModel = refrigeratorModel;
                newRefrigeratorModel.setModelName(model.getModelName());
                newRefrigeratorModel.setModelSize(model.getModelSize());
                newRefrigeratorModel.setCompressorType(model.getCompressorType());
                newRefrigeratorModel.setNumberOfDoors(model.getNumberOfDoors());
                newRefrigeratorModel.setColor(model.getColor());
                newRefrigeratorModel.setSerialNumber(model.getSerialNumber());
                newRefrigeratorModel.setPrice(model.getPrice());
                newRefrigeratorModel.setAvailable(model.isAvailable());
                repository.save(newRefrigeratorModel);
            }

        }
    }
}
