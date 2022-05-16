package com.prueba.comohogarh2.repository;

import com.prueba.comohogarh2.entity.Benefit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitRepository extends CrudRepository<Benefit, Integer> {

}
