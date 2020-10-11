/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.clinired.modelo.facades;

import com.edu.clinired.modelo.entities.Pariente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Surface
 */
@Local
public interface ParienteFacadeLocal {

    void create(Pariente pariente);

    void edit(Pariente pariente);

    void remove(Pariente pariente);

    Pariente find(Object id);

    List<Pariente> findAll();

    List<Pariente> findRange(int[] range);

    int count();
    
}
