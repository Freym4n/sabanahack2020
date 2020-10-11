/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.facades;

import com.edu.clinired.modelo.entities.ExamenHistoriaClinica;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Surface
 */
@Stateless
public class ExamenHistoriaClinicaFacade extends AbstractFacade<ExamenHistoriaClinica> implements ExamenHistoriaClinicaFacadeLocal {

    public ExamenHistoriaClinicaFacade() {
        super(ExamenHistoriaClinica.class);
    }
    
}
