package com.technics.infsystem.service.abstraction;

import com.technics.infsystem.entities.abstraction.AbstractModel;
import com.technics.infsystem.repository.common.CommonModelRepository;
import com.technics.infsystem.service.interfaces.CommonModelService;

import java.util.List;
import java.util.Optional;

public abstract class AbstractModelService<M extends AbstractModel, R extends CommonModelRepository<M>>
        implements CommonModelService<M> {

    protected final R repository;

    public AbstractModelService(R repository) {
        this.repository = repository;
    }

    @Override
    public List<M> getAllModels() {
        return repository.findAll();
    }

    @Override
    public Optional<M> getModelById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteModel(Long id) {
        repository.deleteById(id);
    }

}
