package com.book.cuaderno.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class socio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;
    @OneToOne(mappedBy = "socio")
    private carnet carnet;

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

    public com.book.cuaderno.Entity.carnet getCarnet() {
        return carnet;
    }

    public void setCarnet(com.book.cuaderno.Entity.carnet carnet) {
        this.carnet = carnet;
    }
}
