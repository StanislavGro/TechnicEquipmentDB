package com.technics.infsystem.entities.abstraction;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractEquipment implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; //айдишник

    @Column(name = "type_name")
    private String typeName; //наименование вида техники

    @Column(name = "manufacturer_country")
    private String manufacturerCountry; //страна производитель

    @Column(name = "firm")
    private String firm; //фирма

    @Column(name = "has_online")
    private boolean hasOnline; //можно ли приобрести онлайн

    @Column(name = "has_installment_plan")
    private boolean hasInstallmentPlan; //есть ли возможность взять в рассрочку
//
//    @OneToMany(orphanRemoval = true)
//    @JoinColumn(name = "id")
//    private List<AbstractModel> model; //модель


    public AbstractEquipment() {
    }

    public AbstractEquipment(String typeName, String manufacturerCountry, String firm, boolean hasOnline, boolean hasInstallmentPlan) {
        this.typeName = typeName;
        this.manufacturerCountry = manufacturerCountry;
        this.firm = firm;
        this.hasOnline = hasOnline;
        this.hasInstallmentPlan = hasInstallmentPlan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public boolean isHasOnline() {
        return hasOnline;
    }

    public void setHasOnline(boolean hasOnline) {
        this.hasOnline = hasOnline;
    }

    public boolean isHasInstallmentPlan() {
        return hasInstallmentPlan;
    }

    public void setHasInstallmentPlan(boolean hasInstallmentPlan) {
        this.hasInstallmentPlan = hasInstallmentPlan;
    }

//    public List<AbstractModel> getModel() {
//        return model;
//    }
//
//    public void setModel(List<AbstractModel> model) {
//        this.model = model;
//    }
}
