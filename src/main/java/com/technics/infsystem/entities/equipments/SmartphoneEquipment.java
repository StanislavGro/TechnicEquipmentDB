package com.technics.infsystem.entities.equipments;

import com.technics.infsystem.entities.abstraction.AbstractEquipment;
import com.technics.infsystem.entities.models.SmartphoneModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Smartphone_equipments")
public class SmartphoneEquipment extends AbstractEquipment {

    @OneToMany(mappedBy = "smartphoneEquipment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SmartphoneModel> smartphoneModelList = new ArrayList<>();

    public SmartphoneEquipment() {
    }

    public SmartphoneEquipment(String typeName, String manufacturerCountry, String firm, boolean hasOnline, boolean hasInstallmentPlan, List<SmartphoneModel> smartphoneModelList) {
        super(typeName, manufacturerCountry, firm, hasOnline, hasInstallmentPlan);
        this.smartphoneModelList = smartphoneModelList;
    }

    public void addSmartphoneModel(SmartphoneModel smartphoneModel) {
        smartphoneModel.setSmartphoneEquipment(this);
        smartphoneModelList.add(smartphoneModel);
    }

    public void removeSmartphoneModel(SmartphoneModel smartphoneModel) {
        smartphoneModelList.remove(smartphoneModel);
//        tvModel.setTVEquipment(null);
    }

    @Override
    public String toString() {
        return "SmartphoneEquipment{" +
                "smartphoneModelList=" + smartphoneModelList +
                '}';
    }
}
