/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.facades;

import com.edu.clinired.modelo.entities.HistoriaClinicaMedicamentos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Surface
 */
@Stateless
public class HistoriaClinicaMedicamentosFacade extends AbstractFacade<HistoriaClinicaMedicamentos> implements HistoriaClinicaMedicamentosFacadeLocal {

    public HistoriaClinicaMedicamentosFacade() {
        super(HistoriaClinicaMedicamentos.class);
    }
    
}
