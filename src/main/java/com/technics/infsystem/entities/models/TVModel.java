package com.technics.infsystem.entities.models;

import com.technics.infsystem.entities.abstraction.AbstractModel;
import com.technics.infsystem.entities.equipments.TVEquipment;

import javax.persistence.*;

@Entity
@Table(name = "TV_models")
public class TVModel extends AbstractModel {

    @Column(name = "category")
    private String category;

    @Column(name = "technology")
    private String technology;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "tv_equipment_id")
    private TVEquipment tvEquipment;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setTVEquipment(TVEquipment tvEquipment) {
        this.tvEquipment = tvEquipment;
    }

    public TVEquipment getTVEquipment() {
        return tvEquipment;
    }

    @Override
    public String toString() {
        return "TVModel{" +
                "category='" + category + '\'' +
                ", technology='" + technology + '\'' +
                ", tvEquipment=" + tvEquipment +
                '}';
    }
}
