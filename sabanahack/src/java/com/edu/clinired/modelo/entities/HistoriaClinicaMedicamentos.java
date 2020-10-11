/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Surface
 */
@Entity
@Table(name = "tbl_historia_clinica_medicamentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoriaClinicaMedicamentos.findAll", query = "SELECT h FROM HistoriaClinicaMedicamentos h")
    , @NamedQuery(name = "HistoriaClinicaMedicamentos.findByIdHistoriaClinicaMedicamentos", query = "SELECT h FROM HistoriaClinicaMedicamentos h WHERE h.idHistoriaClinicaMedicamentos = :idHistoriaClinicaMedicamentos")
    , @NamedQuery(name = "HistoriaClinicaMedicamentos.findByHorario", query = "SELECT h FROM HistoriaClinicaMedicamentos h WHERE h.horario = :horario")})
public class HistoriaClinicaMedicamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_historia_clinica_medicamentos")
    private Integer idHistoriaClinicaMedicamentos;
    @Basic(optional = false)
    @Column(name = "horario")
    private String horario;
    @JoinColumn(name = "id_historia_clinica", referencedColumnName = "id_historia_clinica_detalle")
    @ManyToOne(optional = false)
    private HistoriaClinicaDetalle idHistoriaClinica;
    @JoinColumn(name = "medicamento", referencedColumnName = "id_medicamentos")
    @ManyToOne(optional = false)
    private Medicamento medicamento;

    public HistoriaClinicaMedicamentos() {
    }

    public HistoriaClinicaMedicamentos(Integer idHistoriaClinicaMedicamentos) {
        this.idHistoriaClinicaMedicamentos = idHistoriaClinicaMedicamentos;
    }

    public HistoriaClinicaMedicamentos(Integer idHistoriaClinicaMedicamentos, String horario) {
        this.idHistoriaClinicaMedicamentos = idHistoriaClinicaMedicamentos;
        this.horario = horario;
    }

    public Integer getIdHistoriaClinicaMedicamentos() {
        return idHistoriaClinicaMedicamentos;
    }

    public void setIdHistoriaClinicaMedicamentos(Integer idHistoriaClinicaMedicamentos) {
        this.idHistoriaClinicaMedicamentos = idHistoriaClinicaMedicamentos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public HistoriaClinicaDetalle getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(HistoriaClinicaDetalle idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistoriaClinicaMedicamentos != null ? idHistoriaClinicaMedicamentos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriaClinicaMedicamentos)) {
            return false;
        }
        HistoriaClinicaMedicamentos other = (HistoriaClinicaMedicamentos) object;
        if ((this.idHistoriaClinicaMedicamentos == null && other.idHistoriaClinicaMedicamentos != null) || (this.idHistoriaClinicaMedicamentos != null && !this.idHistoriaClinicaMedicamentos.equals(other.idHistoriaClinicaMedicamentos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edu.clinired.modelo.entities.HistoriaClinicaMedicamentos[ idHistoriaClinicaMedicamentos=" + idHistoriaClinicaMedicamentos + " ]";
    }
    
}
