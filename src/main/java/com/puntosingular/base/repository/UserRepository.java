package com.puntosingular.base.repository;

import org.springframework.data.repository.CrudRepository;

import com.puntosingular.base.models.Users;

public interface UserRepository  extends CrudRepository<Users, Long>{
	

}
