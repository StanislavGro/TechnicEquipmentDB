package com.technics.infsystem.service.models;

import com.technics.infsystem.entities.equipments.PCEquipment;
import com.technics.infsystem.entities.models.PCModel;
import com.technics.infsystem.repository.equipments.PCEquipmentRepository;
import com.technics.infsystem.repository.models.PCModelRepository;
import com.technics.infsystem.service.abstraction.AbstractModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PCModelService extends AbstractModelService<PCModel, PCModelRepository> {

    @Autowired
    private PCEquipmentRepository pcEquipmentRepository;

    public PCModelService(PCModelRepository repository) {
        super(repository);
    }

    @Override
    public void createModel(PCModel model) {
        Long id = model.getPcEquipment().getId();
        PCEquipment pcEquipment = pcEquipmentRepository.findById(id).get();
        model.setPcEquipment(pcEquipment);
        pcEquipment.addPCModel(model);
        repository.save(model);
    }

    @Override
    public void updateModel(Long id, PCModel model) {
        List<PCModel> pcModelList;
        pcModelList = repository.findAll();

        PCModel newPCModel;

        for (PCModel pcModel : pcModelList) {
            if (pcModel.getId() == id) {
                newPCModel = pcModel;
                newPCModel.setModelName(model.getModelName());
                newPCModel.setModelSize(model.getModelSize());
                newPCModel.setProcessorType(model.getProcessorType());
                newPCModel.setCategory(model.getCategory());
                newPCModel.setColor(model.getColor());
                newPCModel.setSerialNumber(model.getSerialNumber());
                newPCModel.setPrice(model.getPrice());
                newPCModel.setAvailable(model.isAvailable());
                repository.save(newPCModel);
            }

        }
    }

    @Override
    public List<PCModel> findByModelName(String modelName) {
        return repository.findByModelName(modelName);
    }

    @Override
    public List<PCModel> findByColor(String color) {
        return repository.findByColor(color);
    }

    @Override
    public List<PCModel> findByPrice(int from, int to) {
        return repository.findByPrice(from, to);
    }

    @Override
    public List<PCModel> incrSortByPriceAndColor() {
        return repository.incrSortByPriceAndColor();
    }

    @Override
    public List<PCModel> decrSortByPriceAndColor() {
        return repository.decrSortByPriceAndColor();
    }
}
