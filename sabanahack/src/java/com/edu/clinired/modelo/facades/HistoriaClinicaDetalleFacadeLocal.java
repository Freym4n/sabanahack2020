/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.facades;

import com.edu.clinired.modelo.entities.HistoriaClinicaDetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Surface
 */
@Local
public interface HistoriaClinicaDetalleFacadeLocal {

    void create(HistoriaClinicaDetalle historiaClinicaDetalle);

    void edit(HistoriaClinicaDetalle historiaClinicaDetalle);

    void remove(HistoriaClinicaDetalle historiaClinicaDetalle);

    HistoriaClinicaDetalle find(Object id);

    List<HistoriaClinicaDetalle> findAll();

    List<HistoriaClinicaDetalle> findRange(int[] range);

    int count();
    
}
