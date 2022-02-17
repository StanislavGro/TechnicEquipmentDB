package com.technics.infsystem.entities.abstraction;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractModel implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;                //айдишник

    @Column(name = "name")
    private String modelName;       //название модели

    @Column(name = "serial_number")
    private int serialNumber;       //серийный номер

    @Column(name = "color")
    private String color;           //цвет

    @Column(name = "size")
    private int modelSize;          //размер

    @Column(name = "price")
    private int price;              //цена

    @Column(name = "is_available")
    private boolean isAvailable;    //доступена ли модель сейчас

    public AbstractModel() {
    }

    public AbstractModel(String modelName, int serialNumber, String color, int modelSize, int price, boolean isAvailable) {
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.color = color;
        this.modelSize = modelSize;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelSize() {
        return modelSize;
    }

    public void setModelSize(int modelSize) {
        this.modelSize = modelSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
