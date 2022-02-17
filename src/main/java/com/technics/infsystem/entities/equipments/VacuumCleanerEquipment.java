package com.technics.infsystem.entities.equipments;

import com.technics.infsystem.entities.abstraction.AbstractEquipment;
import com.technics.infsystem.entities.models.SmartphoneModel;
import com.technics.infsystem.entities.models.VacuumCleanerModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Vacuum_cleaner_equipments")
public class VacuumCleanerEquipment extends AbstractEquipment {

    @OneToMany(mappedBy = "vacuumCleanerEquipment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VacuumCleanerModel> vacuumCleanerModelList = new ArrayList<>();

    public VacuumCleanerEquipment() {
    }

    public VacuumCleanerEquipment(String typeName, String manufacturerCountry, String firm, boolean hasOnline, boolean hasInstallmentPlan) {
        super(typeName, manufacturerCountry, firm, hasOnline, hasInstallmentPlan);
    }

    public void addVacuumCleanerModel(VacuumCleanerModel vacuumCleanerModel) {
        vacuumCleanerModel.setVacuumCleanerEquipment(this);
        vacuumCleanerModelList.add(vacuumCleanerModel);
    }

    public void removeVacuumCleanerModel(SmartphoneModel smartphoneModel) {
        vacuumCleanerModelList.remove(smartphoneModel);
//        tvModel.setTVEquipment(null);
    }

    @Override
    public String toString() {
        return "VacuumCleanerEquipment{" +
                "vacuumCleanerModelList=" + vacuumCleanerModelList +
                '}';
    }
}
