package com.rentamaquina.maquinaria.app.crudRepository;

import com.rentamaquina.maquinaria.app.entities.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author  -------------
 */
public interface MessageCrudRepository  extends CrudRepository<Message,Integer>{
    
}