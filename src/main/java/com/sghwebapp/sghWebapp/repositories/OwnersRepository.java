package com.sghwebapp.sghWebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sghwebapp.sghWebapp.model.Owners;

@Repository
public interface OwnersRepository extends CrudRepository<Owners, Long>{

}
