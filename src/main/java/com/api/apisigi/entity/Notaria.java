package com.api.apisigi.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Objects;
//TODO PROCEDIMIENTO ALMACENADO NOTARIA
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.StringIdGenerator.class, property = "UUID")
public class Notaria {
    private String idNotaria;
    private String descripcion;
    private DocNotaria docNotaria;

    @Id
    @Column(name = "ID_NOTARIA")
    public String getIdNotaria() {
        return idNotaria;
    }

    public void setIdNotaria(String idNotaria) {
        this.idNotaria = idNotaria;
    }

    @Basic
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notaria notaria = (Notaria) o;
        return Objects.equals(idNotaria, notaria.idNotaria) &&
                Objects.equals(descripcion, notaria.descripcion);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idNotaria, descripcion);
    }

    @ManyToOne
    @JoinColumn(name = "ID_DOC_NOTARIA", referencedColumnName = "ID_DOC_NOTARIA", nullable = false)
    public DocNotaria getDocNotaria() {
        return docNotaria;
    }

    public void setDocNotaria(DocNotaria docNotaria) {
        this.docNotaria = docNotaria;
    }
}
