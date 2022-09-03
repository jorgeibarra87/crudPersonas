package com.jorgeibarra.crudPersonas.service;

import com.jorgeibarra.crudPersonas.interfaceService.IpersonaService;
import com.jorgeibarra.crudPersonas.interfaces.IPersona;
import com.jorgeibarra.crudPersonas.modelo.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jorge Ibarra
 */
public class PersonaService implements IpersonaService {

    @Autowired
    private IPersona data;
    
    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int save(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
