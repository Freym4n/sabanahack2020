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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tbl_historia_clinica_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoriaClinicaDetalle.findAll", query = "SELECT h FROM HistoriaClinicaDetalle h")
    , @NamedQuery(name = "HistoriaClinicaDetalle.findByIdHistoriaClinicaDetalle", query = "SELECT h FROM HistoriaClinicaDetalle h WHERE h.idHistoriaClinicaDetalle = :idHistoriaClinicaDetalle")
    , @NamedQuery(name = "HistoriaClinicaDetalle.findByFechaRegistro", query = "SELECT h FROM HistoriaClinicaDetalle h WHERE h.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "HistoriaClinicaDetalle.findByValoracion", query = "SELECT h FROM HistoriaClinicaDetalle h WHERE h.valoracion = :valoracion")
    , @NamedQuery(name = "HistoriaClinicaDetalle.findByDieta", query = "SELECT h FROM HistoriaClinicaDetalle h WHERE h.dieta = :dieta")
    , @NamedQuery(name = "HistoriaClinicaDetalle.findByActividad", query = "SELECT h FROM HistoriaClinicaDetalle h WHERE h.actividad = :actividad")})
public class HistoriaClinicaDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_historia_clinica_detalle")
    private Integer idHistoriaClinicaDetalle;
    @Basic(optional = false)
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "valoracion")
    private String valoracion;
    @Column(name = "dieta")
    private String dieta;
    @Column(name = "actividad")
    private String actividad;
    @JoinColumn(name = "idl_historia_clinica", referencedColumnName = "id_historia_clinica")
    @ManyToOne(optional = false)
    private HistoriaClinica idlHistoriaClinica;
    @JoinColumn(name = "id_personal_medico", referencedColumnName = "id_personal_medico")
    @ManyToOne(optional = false)
    private PersonalMedico idPersonalMedico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idHistoriaClinica")
    private List<ExamenHistoriaClinica> examenHistoriaClinicaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idHistoriaClinica")
    private List<HistoriaClinicaMedicamentos> historiaClinicaMedicamentosList;

    public HistoriaClinicaDetalle() {
    }

    public HistoriaClinicaDetalle(Integer idHistoriaClinicaDetalle) {
        this.idHistoriaClinicaDetalle = idHistoriaClinicaDetalle;
    }

    public HistoriaClinicaDetalle(Integer idHistoriaClinicaDetalle, Date fechaRegistro) {
        this.idHistoriaClinicaDetalle = idHistoriaClinicaDetalle;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdHistoriaClinicaDetalle() {
        return idHistoriaClinicaDetalle;
    }

    public void setIdHistoriaClinicaDetalle(Integer idHistoriaClinicaDetalle) {
        this.idHistoriaClinicaDetalle = idHistoriaClinicaDetalle;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public HistoriaClinica getIdlHistoriaClinica() {
        return idlHistoriaClinica;
    }

    public void setIdlHistoriaClinica(HistoriaClinica idlHistoriaClinica) {
        this.idlHistoriaClinica = idlHistoriaClinica;
    }

    public PersonalMedico getIdPersonalMedico() {
        return idPersonalMedico;
    }

    public void setIdPersonalMedico(PersonalMedico idPersonalMedico) {
        this.idPersonalMedico = idPersonalMedico;
    }

    @XmlTransient
    public List<ExamenHistoriaClinica> getExamenHistoriaClinicaList() {
        return examenHistoriaClinicaList;
    }

    public void setExamenHistoriaClinicaList(List<ExamenHistoriaClinica> examenHistoriaClinicaList) {
        this.examenHistoriaClinicaList = examenHistoriaClinicaList;
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
        hash += (idHistoriaClinicaDetalle != null ? idHistoriaClinicaDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriaClinicaDetalle)) {
            return false;
        }
        HistoriaClinicaDetalle other = (HistoriaClinicaDetalle) object;
        if ((this.idHistoriaClinicaDetalle == null && other.idHistoriaClinicaDetalle != null) || (this.idHistoriaClinicaDetalle != null && !this.idHistoriaClinicaDetalle.equals(other.idHistoriaClinicaDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edu.clinired.modelo.entities.HistoriaClinicaDetalle[ idHistoriaClinicaDetalle=" + idHistoriaClinicaDetalle + " ]";
    }
    
}
