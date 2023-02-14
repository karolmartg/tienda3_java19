package com.tienda_k.dao;

// Capa de negocio, logica y complejidad

import com.tienda_k.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
