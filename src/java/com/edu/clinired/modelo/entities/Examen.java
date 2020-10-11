/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Surface
 */
@Entity
@Table(name = "tbl_examenes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Examen.findAll", query = "SELECT e FROM Examen e")
    , @NamedQuery(name = "Examen.findByIdExamenes", query = "SELECT e FROM Examen e WHERE e.idExamenes = :idExamenes")
    , @NamedQuery(name = "Examen.findByExamen", query = "SELECT e FROM Examen e WHERE e.examen = :examen")})
public class Examen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_examenes")
    private Integer idExamenes;
    @Basic(optional = false)
    @Column(name = "examen")
    private String examen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idExamen")
    private List<ExamenHistoriaClinica> examenHistoriaClinicaList;

    public Examen() {
    }

    public Examen(Integer idExamenes) {
        this.idExamenes = idExamenes;
    }

    public Examen(Integer idExamenes, String examen) {
        this.idExamenes = idExamenes;
        this.examen = examen;
    }

    public Integer getIdExamenes() {
        return idExamenes;
    }

    public void setIdExamenes(Integer idExamenes) {
        this.idExamenes = idExamenes;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    @XmlTransient
    public List<ExamenHistoriaClinica> getExamenHistoriaClinicaList() {
        return examenHistoriaClinicaList;
    }

    public void setExamenHistoriaClinicaList(List<ExamenHistoriaClinica> examenHistoriaClinicaList) {
        this.examenHistoriaClinicaList = examenHistoriaClinicaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExamenes != null ? idExamenes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Examen)) {
            return false;
        }
        Examen other = (Examen) object;
        if ((this.idExamenes == null && other.idExamenes != null) || (this.idExamenes != null && !this.idExamenes.equals(other.idExamenes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edu.clinired.modelo.entities.Examen[ idExamenes=" + idExamenes + " ]";
    }
    
}
