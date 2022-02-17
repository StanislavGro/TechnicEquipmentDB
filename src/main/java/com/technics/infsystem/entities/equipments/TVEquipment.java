package com.technics.infsystem.entities.equipments;

import com.technics.infsystem.entities.abstraction.AbstractEquipment;
import com.technics.infsystem.entities.models.TVModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TV_equipments")
public class TVEquipment extends AbstractEquipment {

    @OneToMany(mappedBy = "tvEquipment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TVModel> tvModelList = new ArrayList<>();

    public TVEquipment() {
    }

    public TVEquipment(String typeName, String manufacturerCountry, String firm, boolean hasOnline, boolean hasInstallmentPlan, List<TVModel> tvModelList) {
        super(typeName, manufacturerCountry, firm, hasOnline, hasInstallmentPlan);
        this.tvModelList = tvModelList;
    }

    public void addTVModel(TVModel tvModel) {
        tvModel.setTVEquipment(this);
        tvModelList.add(tvModel);
    }

    public void removeTVModel(TVModel tvModel) {
        tvModelList.remove(tvModel);
//        tvModel.setTVEquipment(null);
    }

    @Override
    public String toString() {
        return "TVEquipment{" +
                "tvModelList=" + tvModelList +
                '}';
    }
}
