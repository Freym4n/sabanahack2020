/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.facades;

import com.edu.clinired.modelo.entities.HistoriaClinicaMedicamentos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Surface
 */
@Local
public interface HistoriaClinicaMedicamentosFacadeLocal {

    void create(HistoriaClinicaMedicamentos historiaClinicaMedicamentos);

    void edit(HistoriaClinicaMedicamentos historiaClinicaMedicamentos);

    void remove(HistoriaClinicaMedicamentos historiaClinicaMedicamentos);

    HistoriaClinicaMedicamentos find(Object id);

    List<HistoriaClinicaMedicamentos> findAll();

    List<HistoriaClinicaMedicamentos> findRange(int[] range);

    int count();
    
}
