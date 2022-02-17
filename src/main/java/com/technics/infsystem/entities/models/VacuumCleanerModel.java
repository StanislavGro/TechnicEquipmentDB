package com.technics.infsystem.entities.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technics.infsystem.entities.abstraction.AbstractModel;
import com.technics.infsystem.entities.equipments.SmartphoneEquipment;
import com.technics.infsystem.entities.equipments.VacuumCleanerEquipment;

import javax.persistence.*;

@Entity
@Table(name = "Vacuum_cleaners_models")
public class VacuumCleanerModel extends AbstractModel {

    @Column(name = "volume")
    private int volume; //Объем пылесборника

    @Column(name = "number_of_modes")
    private int numberOfModes; //Количество режимов

//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "vacuum_cleaner_equipment_id")
    private VacuumCleanerEquipment vacuumCleanerEquipment;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumberOfModes() {
        return numberOfModes;
    }

    public void setNumberOfModes(int numberOfModes) {
        this.numberOfModes = numberOfModes;
    }

    public VacuumCleanerEquipment getVacuumCleanerEquipment() {
        return vacuumCleanerEquipment;
    }

    public void setVacuumCleanerEquipment(VacuumCleanerEquipment vacuumCleanerEquipment) {
        this.vacuumCleanerEquipment = vacuumCleanerEquipment;
    }
}
