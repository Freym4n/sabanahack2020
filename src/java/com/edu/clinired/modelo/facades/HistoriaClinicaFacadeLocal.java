/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.facades;

import com.edu.clinired.modelo.entities.HistoriaClinica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Surface
 */
@Local
public interface HistoriaClinicaFacadeLocal {

    void create(HistoriaClinica historiaClinica);

    void edit(HistoriaClinica historiaClinica);

    void remove(HistoriaClinica historiaClinica);

    HistoriaClinica find(Object id);

    List<HistoriaClinica> findAll();

    List<HistoriaClinica> findRange(int[] range);

    int count();
    
}
