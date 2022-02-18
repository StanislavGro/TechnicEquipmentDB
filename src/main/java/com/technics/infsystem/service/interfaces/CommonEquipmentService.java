package com.technics.infsystem.service.interfaces;

import com.technics.infsystem.entities.abstraction.AbstractEquipment;
import com.technics.infsystem.entities.abstraction.AbstractModel;

import java.util.List;
import java.util.Optional;

public interface CommonEquipmentService<E extends AbstractEquipment> {

    List<E> getAllEquipments();

    void createEquipment(E equipment);

    Optional<E> getEquipmentById(Long id);

    void deleteEquipment(Long id);

    void updateEquipment(Long id, E equipment);

    List<E> findByTypeName(String typeName);

}
