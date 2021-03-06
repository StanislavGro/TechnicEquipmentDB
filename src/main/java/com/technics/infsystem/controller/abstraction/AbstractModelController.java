package com.technics.infsystem.controller.abstraction;

import com.technics.infsystem.controller.interfaces.CommonModelController;
import com.technics.infsystem.entities.abstraction.AbstractModel;
import com.technics.infsystem.service.interfaces.CommonModelService;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public abstract class AbstractModelController<M extends AbstractModel, S extends CommonModelService<M>>
        implements CommonModelController<M> {

    private final S modelService;

    protected AbstractModelController(S modelService) {
        this.modelService = modelService;
    }

    @Override
    public void createModel(@RequestBody M model) {
        modelService.createModel(model);
    }

    @Override
    public List<M> getAllModels() {
        return modelService.getAllModels();
    }

    @Override
    public Optional<M> getModelById(Long id) {
        return modelService.getModelById(id);
    }

    @Override
    public void updateModel(Long id, M model) {
        modelService.updateModel(id, model);
    }

    @Override
    public void deleteModel(Long id) {
        modelService.deleteModel(id);
    }

    @Override
    public List<M> findByModelName(String modelName) {
        return modelService.findByModelName(modelName);
    }

    @Override
    public List<M> findByColor(String color) {
        return modelService.findByColor(color);
    }

    @Override
    public List<M> findByPrice(int priceFrom, int priceTo) {
        return modelService.findByPrice(priceFrom, priceTo);
    }

    @Override
    public List<M> incrSortByPriceAndColor() {
        return modelService.incrSortByPriceAndColor();
    }

    @Override
    public List<M> decrSortByPriceAndColor() {
        return modelService.decrSortByPriceAndColor();
    }
}
