package com.technics.infsystem.entities.models;

import com.technics.infsystem.entities.abstraction.AbstractModel;
import com.technics.infsystem.entities.equipments.SmartphoneEquipment;

import javax.persistence.*;

@Entity
@Table(name = "Smartphone_models")
public class SmartphoneModel extends AbstractModel {

    @Column(name = "memory_gb")
    private int memoryGB; //память в гигабайтах

    @Column(name = "count_of_camera")
    private int countOfCamera; //количесвто камер

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "smartphone_equipment_id")
    private SmartphoneEquipment smartphoneEquipment;

    public int getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(int memoryGB) {
        this.memoryGB = memoryGB;
    }

    public int getCountOfCamera() {
        return countOfCamera;
    }

    public void setCountOfCamera(int countOfCamera) {
        this.countOfCamera = countOfCamera;
    }

    public SmartphoneEquipment getSmartphoneEquipment() {
        return smartphoneEquipment;
    }

    public void setSmartphoneEquipment(SmartphoneEquipment smartphoneEquipment) {
        this.smartphoneEquipment = smartphoneEquipment;
    }

}
