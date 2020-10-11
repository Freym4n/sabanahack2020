/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.facades;

import com.edu.clinired.modelo.entities.HistoriaClinica;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Surface
 */
@Stateless
public class HistoriaClinicaFacade extends AbstractFacade<HistoriaClinica> implements HistoriaClinicaFacadeLocal {

    public HistoriaClinicaFacade() {
        super(HistoriaClinica.class);
    }
    
}
