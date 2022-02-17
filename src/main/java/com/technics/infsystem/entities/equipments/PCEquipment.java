package com.technics.infsystem.entities.equipments;

import com.technics.infsystem.entities.abstraction.AbstractEquipment;
import com.technics.infsystem.entities.models.PCModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PC_equipments")
public class PCEquipment extends AbstractEquipment {

    @OneToMany(mappedBy = "pcEquipment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PCModel> pcModelList = new ArrayList<>();

    public PCEquipment(){}

    public PCEquipment(String typeName, String manufacturerCountry, String firm, boolean hasOnline, boolean hasInstallmentPlan, List<PCModel> pcModelList) {
        super(typeName, manufacturerCountry, firm, hasOnline, hasInstallmentPlan);
        this.pcModelList = pcModelList;
    }

    public void addPCModel(PCModel pcModel) {
        pcModel.setPcEquipment(this);
        pcModelList.add(pcModel);
    }

    public void removePCModel(PCModel pcModel) {
        pcModelList.remove(pcModel);
//        tvModel.setTVEquipment(null);
    }

    @Override
    public String toString() {
        return "PCEquipment{" +
                "pcModelList=" + pcModelList +
                '}';
    }
}
