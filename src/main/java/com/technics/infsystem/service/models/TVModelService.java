package com.technics.infsystem.service.models;

import com.technics.infsystem.entities.equipments.TVEquipment;
import com.technics.infsystem.entities.models.TVModel;
import com.technics.infsystem.repository.equipments.TVEquipmentRepository;
import com.technics.infsystem.repository.models.TVModelRepository;
import com.technics.infsystem.service.abstraction.AbstractModelService;
import com.technics.infsystem.service.equipments.TVEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TVModelService extends AbstractModelService<TVModel, TVModelRepository> {

    @Autowired
    private TVEquipmentRepository tvEquipmentRepository;

    public TVModelService(TVModelRepository repository) {
        super(repository);
    }

    @Override
    public void createModel(TVModel model) {
        Long id = model.getTVEquipment().getId();
        TVEquipment tvEquipment = tvEquipmentRepository.findById(id).get();
        model.setTVEquipment(tvEquipment);
        tvEquipment.addTVModel(model);
        repository.save(model);
    }


    @Override
    public void updateModel(Long id, TVModel model) {
        List<TVModel> tvModelList;
        tvModelList = repository.findAll();

        TVModel newTVModel;

        for (TVModel tvModel : tvModelList) {
            if (tvModel.getId() == id) {
                newTVModel = tvModel;
                newTVModel.setModelName(model.getModelName());
                newTVModel.setModelSize(model.getModelSize());
                newTVModel.setCategory(model.getCategory());
                newTVModel.setTechnology(model.getTechnology());
                newTVModel.setColor(model.getColor());
                newTVModel.setSerialNumber(model.getSerialNumber());
                newTVModel.setPrice(model.getPrice());
                newTVModel.setAvailable(model.isAvailable());
                repository.save(newTVModel);
            }

        }
    }

}
