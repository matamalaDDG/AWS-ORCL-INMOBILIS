package com.api.apisigi.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Servicios {
    private String idServicio;
    private String servicio;
    private long valorServicio;

    @Id
    @Column(name = "ID_SERVICIO")
    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    @Basic
    @Column(name = "SERVICIO")
    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Basic
    @Column(name = "VALOR_SERVICIO")
    public long getValorServicio() {
        return valorServicio;
    }

    public void setValorServicio(long valorServicio) {
        this.valorServicio = valorServicio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicios servicios = (Servicios) o;
        return valorServicio == servicios.valorServicio &&
                Objects.equals(idServicio, servicios.idServicio) &&
                Objects.equals(servicio, servicios.servicio);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idServicio, servicio, valorServicio);
    }
}