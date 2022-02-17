package com.technics.infsystem.controller.interfaces;

import com.technics.infsystem.entities.abstraction.AbstractModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface CommonModelController<M extends AbstractModel> {

    @PostMapping
    void createModel(@RequestBody M model);


    @GetMapping("all")
    List<M> getAllModels();


    @GetMapping
    Optional<M> getModelById(Long id);


    @PutMapping("/{id}")
    void updateModel(@PathVariable Long id, @RequestBody M model);


    @DeleteMapping("/{id}")
    void deleteModel(@PathVariable Long id);

}
