package com.technics.infsystem.service.interfaces;

import com.technics.infsystem.entities.abstraction.AbstractModel;

import java.util.List;
import java.util.Optional;

public interface CommonModelService<M extends AbstractModel> {

    List<M> getAllModels();

    void createModel(M someModel);

    Optional<M> getModelById(Long id);

    void updateModel(Long id, M model);

    void deleteModel(Long id);

}
