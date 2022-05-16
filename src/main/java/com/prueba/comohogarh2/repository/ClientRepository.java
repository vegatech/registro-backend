package com.prueba.comohogarh2.repository;

import com.prueba.comohogarh2.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {


}
