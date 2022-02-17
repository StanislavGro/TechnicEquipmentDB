package com.technics.infsystem.entities.equipments;

import com.technics.infsystem.entities.abstraction.AbstractEquipment;
import com.technics.infsystem.entities.models.PCModel;
import com.technics.infsystem.entities.models.RefrigeratorModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Refrigerator_equipments")
public class RefrigeratorEquipment extends AbstractEquipment {

    @OneToMany(mappedBy = "refrigeratorEquipment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RefrigeratorModel> refrigeratorModelList = new ArrayList<>();

    public RefrigeratorEquipment(){}

    public RefrigeratorEquipment(String typeName, String manufacturerCountry, String firm, boolean hasOnline, boolean hasInstallmentPlan, List<RefrigeratorModel> refrigeratorModelList) {
        super(typeName, manufacturerCountry, firm, hasOnline, hasInstallmentPlan);
        this.refrigeratorModelList = refrigeratorModelList;
    }

    public void addRefrigeratorModel(RefrigeratorModel refrigeratorModel) {
        refrigeratorModel.setRefrigeratorEquipment(this);
        refrigeratorModelList.add(refrigeratorModel);
    }

    public void removeRefrigeratorModel(RefrigeratorModel refrigeratorModel) {
        refrigeratorModelList.remove(refrigeratorModel);
//        tvModel.setTVEquipment(null);
    }

    @Override
    public String toString() {
        return "RefrigeratorEquipment{" +
                "refrigeratorModelList=" + refrigeratorModelList +
                '}';
    }
}
