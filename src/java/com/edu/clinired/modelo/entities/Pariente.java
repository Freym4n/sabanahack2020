/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "tbl_pariente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pariente.findAll", query = "SELECT p FROM Pariente p")
    , @NamedQuery(name = "Pariente.findByIdPariente", query = "SELECT p FROM Pariente p WHERE p.idPariente = :idPariente")
    , @NamedQuery(name = "Pariente.findByCorreo", query = "SELECT p FROM Pariente p WHERE p.correo = :correo")
    , @NamedQuery(name = "Pariente.findByTelefono", query = "SELECT p FROM Pariente p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Pariente.findByUbicacionResidencia", query = "SELECT p FROM Pariente p WHERE p.ubicacionResidencia = :ubicacionResidencia")})
public class Pariente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pariente")
    private Long idPariente;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private BigInteger telefono;
    @Basic(optional = false)
    @Column(name = "ubicacion_residencia")
    private String ubicacionResidencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPariente")
    private List<Paciente> pacienteList;
    @JoinColumn(name = "id_pariente", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public Pariente() {
    }

    public Pariente(Long idPariente) {
        this.idPariente = idPariente;
    }

    public Pariente(Long idPariente, String ubicacionResidencia) {
        this.idPariente = idPariente;
        this.ubicacionResidencia = ubicacionResidencia;
    }

    public Long getIdPariente() {
        return idPariente;
    }

    public void setIdPariente(Long idPariente) {
        this.idPariente = idPariente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public String getUbicacionResidencia() {
        return ubicacionResidencia;
    }

    public void setUbicacionResidencia(String ubicacionResidencia) {
        this.ubicacionResidencia = ubicacionResidencia;
    }

    @XmlTransient
    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPariente != null ? idPariente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pariente)) {
            return false;
        }
        Pariente other = (Pariente) object;
        if ((this.idPariente == null && other.idPariente != null) || (this.idPariente != null && !this.idPariente.equals(other.idPariente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edu.clinired.modelo.entities.Pariente[ idPariente=" + idPariente + " ]";
    }
    
}
