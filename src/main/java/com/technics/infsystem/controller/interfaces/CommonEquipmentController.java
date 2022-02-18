package com.technics.infsystem.controller.interfaces;

import com.technics.infsystem.entities.abstraction.AbstractEquipment;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface CommonEquipmentController<E extends AbstractEquipment> {

    @PostMapping
    void createEquipment(@RequestBody E equipment);


    @GetMapping("all")
    List<E> getAllEquipments();


    @GetMapping
    Optional<E> getEquipmentById(Long id);


    @PutMapping("/{id}")
    void updateEquipment(@PathVariable Long id, @RequestBody E equipment);


    @DeleteMapping("/{id}")
    void deleteEquipment(@PathVariable Long id);

    @GetMapping("/{typeName}")
    List<E> findByTypeName(@PathVariable String typeName);

}
