/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Surface
 */
@Entity
@Table(name = "tbl_medicamentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicamento.findAll", query = "SELECT m FROM Medicamento m")
    , @NamedQuery(name = "Medicamento.findByIdMedicamentos", query = "SELECT m FROM Medicamento m WHERE m.idMedicamentos = :idMedicamentos")
    , @NamedQuery(name = "Medicamento.findByMedicamento", query = "SELECT m FROM Medicamento m WHERE m.medicamento = :medicamento")
    , @NamedQuery(name = "Medicamento.findByFechaCreacion", query = "SELECT m FROM Medicamento m WHERE m.fechaCreacion = :fechaCreacion")})
public class Medicamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medicamentos")
    private Integer idMedicamentos;
    @Basic(optional = false)
    @Column(name = "medicamento")
    private String medicamento;
    @Basic(optional = false)
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicamento")
    private List<HistoriaClinicaMedicamentos> historiaClinicaMedicamentosList;

    public Medicamento() {
    }

    public Medicamento(Integer idMedicamentos) {
        this.idMedicamentos = idMedicamentos;
    }

    public Medicamento(Integer idMedicamentos, String medicamento, Date fechaCreacion) {
        this.idMedicamentos = idMedicamentos;
        this.medicamento = medicamento;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdMedicamentos() {
        return idMedicamentos;
    }

    public void setIdMedicamentos(Integer idMedicamentos) {
        this.idMedicamentos = idMedicamentos;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @XmlTransient
    public List<HistoriaClinicaMedicamentos> getHistoriaClinicaMedicamentosList() {
        return historiaClinicaMedicamentosList;
    }

    public void setHistoriaClinicaMedicamentosList(List<HistoriaClinicaMedicamentos> historiaClinicaMedicamentosList) {
        this.historiaClinicaMedicamentosList = historiaClinicaMedicamentosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedicamentos != null ? idMedicamentos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicamento)) {
            return false;
        }
        Medicamento other = (Medicamento) object;
        if ((this.idMedicamentos == null && other.idMedicamentos != null) || (this.idMedicamentos != null && !this.idMedicamentos.equals(other.idMedicamentos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edu.clinired.modelo.entities.Medicamento[ idMedicamentos=" + idMedicamentos + " ]";
    }
    
}
