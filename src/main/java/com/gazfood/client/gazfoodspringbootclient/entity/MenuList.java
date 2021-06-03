package com.gazfood.client.gazfoodspringbootclient.entity;

import javax.persistence.*;

@Entity
@Table(name = "menu_list")
public class MenuList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "priceCategory_id")
    private PriceCategory priceCategory;

    public MenuList() {
    }

    public MenuList(String name, String description, PriceCategory priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PriceCategory getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(PriceCategory priceCategory) {
        this.priceCategory = priceCategory;
    }
}
