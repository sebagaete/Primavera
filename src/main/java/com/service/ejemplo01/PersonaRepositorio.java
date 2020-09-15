package com.service.ejemplo01;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface PersonaRepositorio extends Repository<Persona, Integer>{
    
    //para listar todas las personas
    List<Persona>findAll();
    
    //para listar una persona
    Persona findByid(int id);// nota!!!!! el metodo findOne genera error grave es por eso que no se usa en su lugar usamos findByid
    
    //para guardar cambios nuevos o actualizar
    Persona save(Persona p);
    
    //para eliminar
    void delete(Persona p);
    
}