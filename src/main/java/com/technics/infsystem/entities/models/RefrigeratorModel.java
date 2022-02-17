package com.technics.infsystem.entities.models;

import com.technics.infsystem.entities.abstraction.AbstractModel;
import com.technics.infsystem.entities.equipments.PCEquipment;
import com.technics.infsystem.entities.equipments.RefrigeratorEquipment;

import javax.persistence.*;

@Entity
@Table(name = "Refrigerator_models")
public class RefrigeratorModel extends AbstractModel {

    @Column(name = "number_of_doors")
    private int numberOfDoors; //количество дверей

    @Column(name = "compressor_type")
    private String compressorType; //тип компрессора

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "refrigerator_equipment_id")
    private RefrigeratorEquipment refrigeratorEquipment;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getCompressorType() {
        return compressorType;
    }

    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }

    public RefrigeratorEquipment getRefrigeratorEquipment() {
        return refrigeratorEquipment;
    }

    public void setRefrigeratorEquipment(RefrigeratorEquipment refrigeratorEquipment) {
        this.refrigeratorEquipment = refrigeratorEquipment;
    }
}
