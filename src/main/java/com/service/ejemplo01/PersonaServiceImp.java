/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.ejemplo01;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service



public class PersonaServiceImp implements PersonaService{
    
    @Autowired
    private PersonaRepositorio repositorio; 
    
    
    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Persona add(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Persona edit(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Persona delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}