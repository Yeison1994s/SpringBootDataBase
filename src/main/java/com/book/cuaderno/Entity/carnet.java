package com.book.cuaderno.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class carnet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Column(unique = true)
    private String dni;
    //pose la clave primaria
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="socio_id", referencedColumnName = "id")
    private socio socio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public com.book.cuaderno.Entity.socio getSocio() {
        return socio;
    }

    public void setSocio(com.book.cuaderno.Entity.socio socio) {
        this.socio = socio;
    }
}
