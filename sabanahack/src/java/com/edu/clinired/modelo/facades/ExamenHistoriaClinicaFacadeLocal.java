/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.facades;

import com.edu.clinired.modelo.entities.ExamenHistoriaClinica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Surface
 */
@Local
public interface ExamenHistoriaClinicaFacadeLocal {

    void create(ExamenHistoriaClinica examenHistoriaClinica);

    void edit(ExamenHistoriaClinica examenHistoriaClinica);

    void remove(ExamenHistoriaClinica examenHistoriaClinica);

    ExamenHistoriaClinica find(Object id);

    List<ExamenHistoriaClinica> findAll();

    List<ExamenHistoriaClinica> findRange(int[] range);

    int count();
    
}
