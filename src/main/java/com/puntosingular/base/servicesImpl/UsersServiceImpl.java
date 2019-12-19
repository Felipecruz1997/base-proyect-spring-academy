package com.puntosingular.base.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntosingular.base.models.Users;
import com.puntosingular.base.repository.UserRepository;
import com.puntosingular.base.services.UserService;
@Service
public class UsersServiceImpl implements UserService {
	@Autowired
	private  UserRepository userRepository;
	

	@Override
	public List<Users> getUsers() {
		return (List<Users>) userRepository.findAll();
	}

}
