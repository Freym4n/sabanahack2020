/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.facades;

import com.edu.clinired.modelo.entities.Solicitud;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Surface
 */
@Stateless
public class SolicitudFacade extends AbstractFacade<Solicitud> implements SolicitudFacadeLocal {

    public SolicitudFacade() {
        super(Solicitud.class);
    }
    
}
