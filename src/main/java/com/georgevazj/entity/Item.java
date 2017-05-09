package com.georgevazj.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jorge on 09/05/2017.
 */

@Document
public class Item {

    @Id
    private String id;
    private String name;
    @Indexed
    private String provider;
    private String serial;
    private String description;
    private double price;

    @DBRef
    private List<Catalog> catalogList = new ArrayList<Catalog>();

    public Item() {
    }

    @PersistenceConstructor
    public Item(String name, String provider, String serial, String description, double price, List<Catalog> catalogList) {
        this.name = name;
        this.provider = provider;
        this.serial = serial;
        this.description = description;
        this.price = price;
        this.catalogList = catalogList;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Catalog> getCatalogList() {
        return catalogList;
    }

    public void setCatalogList(List<Catalog> catalogList) {
        this.catalogList = catalogList;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", provider='" + provider + '\'' +
                ", serial='" + serial + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", catalogList=" + catalogList +
                '}';
    }
}
