package com.jorgeibarra.crudPersonas.interfaces;

import com.jorgeibarra.crudPersonas.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge Ibarra
 */
@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
    
}
