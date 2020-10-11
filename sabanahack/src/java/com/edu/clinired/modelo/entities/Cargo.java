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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tbl_cargos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cargo.findAll", query = "SELECT c FROM Cargo c")
    , @NamedQuery(name = "Cargo.findByIdCargos", query = "SELECT c FROM Cargo c WHERE c.idCargos = :idCargos")
    , @NamedQuery(name = "Cargo.findByCargoDesc", query = "SELECT c FROM Cargo c WHERE c.cargoDesc = :cargoDesc")})
public class Cargo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cargos")
    private Integer idCargos;
    @Basic(optional = false)
    @Column(name = "cargo_desc")
    private String cargoDesc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cargo")
    private List<PersonalMedico> personalMedicoList;

    public Cargo() {
    }

    public Cargo(Integer idCargos) {
        this.idCargos = idCargos;
    }

    public Cargo(Integer idCargos, String cargoDesc) {
        this.idCargos = idCargos;
        this.cargoDesc = cargoDesc;
    }

    public Integer getIdCargos() {
        return idCargos;
    }

    public void setIdCargos(Integer idCargos) {
        this.idCargos = idCargos;
    }

    public String getCargoDesc() {
        return cargoDesc;
    }

    public void setCargoDesc(String cargoDesc) {
        this.cargoDesc = cargoDesc;
    }

    @XmlTransient
    public List<PersonalMedico> getPersonalMedicoList() {
        return personalMedicoList;
    }

    public void setPersonalMedicoList(List<PersonalMedico> personalMedicoList) {
        this.personalMedicoList = personalMedicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargos != null ? idCargos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargo)) {
            return false;
        }
        Cargo other = (Cargo) object;
        if ((this.idCargos == null && other.idCargos != null) || (this.idCargos != null && !this.idCargos.equals(other.idCargos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edu.clinired.modelo.entities.Cargo[ idCargos=" + idCargos + " ]";
    }
    
}
