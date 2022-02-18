package com.technics.infsystem.service.models;

import com.technics.infsystem.entities.equipments.SmartphoneEquipment;
import com.technics.infsystem.entities.models.SmartphoneModel;
import com.technics.infsystem.repository.equipments.SmartphoneEquipmentRepository;
import com.technics.infsystem.repository.models.SmartphoneModelRepository;
import com.technics.infsystem.service.abstraction.AbstractModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneModelService extends AbstractModelService<SmartphoneModel, SmartphoneModelRepository> {

    @Autowired
    private SmartphoneEquipmentRepository smartphoneEquipmentRepository;

    public SmartphoneModelService(SmartphoneModelRepository repository) {
        super(repository);
    }

    @Override
    public void createModel(SmartphoneModel model) {
        Long id = model.getSmartphoneEquipment().getId();
        SmartphoneEquipment smartphoneEquipment = smartphoneEquipmentRepository.findById(id).get();
        model.setSmartphoneEquipment(smartphoneEquipment);
        smartphoneEquipment.addSmartphoneModel(model);
        repository.save(model);
    }

    @Override
    public void updateModel(Long id, SmartphoneModel model) {
        List<SmartphoneModel> smartphoneModelList;
        smartphoneModelList = repository.findAll();

        SmartphoneModel newSmartphoneModel;

        for (SmartphoneModel smartphoneModel : smartphoneModelList) {
            if (smartphoneModel.getId() == id) {
                newSmartphoneModel = smartphoneModel;
                newSmartphoneModel.setModelName(model.getModelName());
                newSmartphoneModel.setModelSize(model.getModelSize());
                newSmartphoneModel.setMemoryGB(model.getMemoryGB());
                newSmartphoneModel.setCountOfCamera(model.getCountOfCamera());
                newSmartphoneModel.setColor(model.getColor());
                newSmartphoneModel.setSerialNumber(model.getSerialNumber());
                newSmartphoneModel.setPrice(model.getPrice());
                newSmartphoneModel.setAvailable(model.isAvailable());
                repository.save(newSmartphoneModel);
            }

        }
    }

    @Override
    public List<SmartphoneModel> findByModelName(String modelName) {
        return repository.findByModelName(modelName);
    }

    @Override
    public List<SmartphoneModel> findByColor(String color) {
        return repository.findByColor(color);
    }

    @Override
    public List<SmartphoneModel> findByPrice(int from, int to) {
        return repository.findByPrice(from, to);
    }
}
