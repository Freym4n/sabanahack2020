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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Surface
 */
@Entity
@Table(name = "tbl_personal_medico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonalMedico.findAll", query = "SELECT p FROM PersonalMedico p")
    , @NamedQuery(name = "PersonalMedico.findByIdPersonalMedico", query = "SELECT p FROM PersonalMedico p WHERE p.idPersonalMedico = :idPersonalMedico")})
public class PersonalMedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_personal_medico")
    private Long idPersonalMedico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersonalMedico")
    private List<HistoriaClinicaDetalle> historiaClinicaDetalleList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personalMedico")
    private Usuario usuario;
    @JoinColumn(name = "cargo", referencedColumnName = "id_cargos")
    @ManyToOne(optional = false)
    private Cargo cargo;

    public PersonalMedico() {
    }

    public PersonalMedico(Long idPersonalMedico) {
        this.idPersonalMedico = idPersonalMedico;
    }

    public Long getIdPersonalMedico() {
        return idPersonalMedico;
    }

    public void setIdPersonalMedico(Long idPersonalMedico) {
        this.idPersonalMedico = idPersonalMedico;
    }

    @XmlTransient
    public List<HistoriaClinicaDetalle> getHistoriaClinicaDetalleList() {
        return historiaClinicaDetalleList;
    }

    public void setHistoriaClinicaDetalleList(List<HistoriaClinicaDetalle> historiaClinicaDetalleList) {
        this.historiaClinicaDetalleList = historiaClinicaDetalleList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonalMedico != null ? idPersonalMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonalMedico)) {
            return false;
        }
        PersonalMedico other = (PersonalMedico) object;
        if ((this.idPersonalMedico == null && other.idPersonalMedico != null) || (this.idPersonalMedico != null && !this.idPersonalMedico.equals(other.idPersonalMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edu.clinired.modelo.entities.PersonalMedico[ idPersonalMedico=" + idPersonalMedico + " ]";
    }
    
}
