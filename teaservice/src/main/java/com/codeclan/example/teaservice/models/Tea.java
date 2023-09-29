package com.codeclan.example.teaservice.models;

import javax.persistence.*;

@Entity
@Table(name="teas")
public class Tea {
    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getName() {
        return name;
    }

    public void setTea(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Tea(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Tea(){
    }

}
