/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.facades;

import com.edu.clinired.modelo.entities.Medicamento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Surface
 */
@Local
public interface MedicamentoFacadeLocal {

    void create(Medicamento medicamento);

    void edit(Medicamento medicamento);

    void remove(Medicamento medicamento);

    Medicamento find(Object id);

    List<Medicamento> findAll();

    List<Medicamento> findRange(int[] range);

    int count();
    
}
