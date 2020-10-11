/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Surface
 */
@Entity
@Table(name = "tbl_examenes_historia_clinica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExamenHistoriaClinica.findAll", query = "SELECT e FROM ExamenHistoriaClinica e")
    , @NamedQuery(name = "ExamenHistoriaClinica.findByIdExamenesHistoriaClinica", query = "SELECT e FROM ExamenHistoriaClinica e WHERE e.idExamenesHistoriaClinica = :idExamenesHistoriaClinica")
    , @NamedQuery(name = "ExamenHistoriaClinica.findByFechaRegistro", query = "SELECT e FROM ExamenHistoriaClinica e WHERE e.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "ExamenHistoriaClinica.findByRealizado", query = "SELECT e FROM ExamenHistoriaClinica e WHERE e.realizado = :realizado")})
public class ExamenHistoriaClinica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_examenes_historia_clinica")
    private Integer idExamenesHistoriaClinica;
    @Basic(optional = false)
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "realizado")
    private Short realizado;
    @JoinColumn(name = "id_historia_clinica", referencedColumnName = "id_historia_clinica_detalle")
    @ManyToOne(optional = false)
    private HistoriaClinicaDetalle idHistoriaClinica;
    @JoinColumn(name = "id_examen", referencedColumnName = "id_examenes")
    @ManyToOne(optional = false)
    private Examen idExamen;

    public ExamenHistoriaClinica() {
    }

    public ExamenHistoriaClinica(Integer idExamenesHistoriaClinica) {
        this.idExamenesHistoriaClinica = idExamenesHistoriaClinica;
    }

    public ExamenHistoriaClinica(Integer idExamenesHistoriaClinica, Date fechaRegistro) {
        this.idExamenesHistoriaClinica = idExamenesHistoriaClinica;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdExamenesHistoriaClinica() {
        return idExamenesHistoriaClinica;
    }

    public void setIdExamenesHistoriaClinica(Integer idExamenesHistoriaClinica) {
        this.idExamenesHistoriaClinica = idExamenesHistoriaClinica;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Short getRealizado() {
        return realizado;
    }

    public void setRealizado(Short realizado) {
        this.realizado = realizado;
    }

    public HistoriaClinicaDetalle getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(HistoriaClinicaDetalle idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public Examen getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Examen idExamen) {
        this.idExamen = idExamen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExamenesHistoriaClinica != null ? idExamenesHistoriaClinica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenHistoriaClinica)) {
            return false;
        }
        ExamenHistoriaClinica other = (ExamenHistoriaClinica) object;
        if ((this.idExamenesHistoriaClinica == null && other.idExamenesHistoriaClinica != null) || (this.idExamenesHistoriaClinica != null && !this.idExamenesHistoriaClinica.equals(other.idExamenesHistoriaClinica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edu.clinired.modelo.entities.ExamenHistoriaClinica[ idExamenesHistoriaClinica=" + idExamenesHistoriaClinica + " ]";
    }
    
}
