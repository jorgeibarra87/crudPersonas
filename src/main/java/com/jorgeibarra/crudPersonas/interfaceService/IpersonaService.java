package com.jorgeibarra.crudPersonas.interfaceService;

import com.jorgeibarra.crudPersonas.modelo.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jorge Ibarra
 */
public interface IpersonaService {
    
    public List<Persona>listar();
    public Optional<Persona>listarId(int id);
    public int save(Persona p);
    public void delete(int id);
}
