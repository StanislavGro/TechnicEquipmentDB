package com.technics.infsystem.entities.models;

import com.technics.infsystem.entities.abstraction.AbstractModel;
import com.technics.infsystem.entities.equipments.PCEquipment;

import javax.persistence.*;

@Entity
@Table(name = "Computer_models")
public class PCModel extends AbstractModel {

    @Column(name = "category")
    private String category; //категория

    @Column(name = "processor_type")
    private String processorType; //тип процессора

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "pc_equipment_id")
    private PCEquipment pcEquipment;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public PCEquipment getPcEquipment() {
        return pcEquipment;
    }

    public void setPcEquipment(PCEquipment pcEquipment) {
        this.pcEquipment = pcEquipment;
    }
}
