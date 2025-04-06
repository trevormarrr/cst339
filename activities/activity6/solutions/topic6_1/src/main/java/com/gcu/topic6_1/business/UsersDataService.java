package com.gcu.topic6_1.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.topic6_1.data.DataAccessInterface;
import com.gcu.topic6_1.data.entity.OrderEntity;
import com.gcu.topic6_1.data.entity.UserEntity;
import com.gcu.topic6_1.data.repository.UsersRepository;

public class UsersDataService implements UsersDataAccessInterface, DataAccessInterface {

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public UserEntity findByUsername(String username) {

		return usersRepository.findByUsername(username);
	}

	@Override
	public List<UserEntity> findAll() {
		return (List<UserEntity>) usersRepository.findAll();
	}

	@Override
	public UserEntity findById(String id) {
		return usersRepository.findById(id).orElse(null);
	}

	@Override
	public boolean create(OrderEntity order) {
		// Since this is a UserService, we should not handle OrderEntity
		return false;
	}

	@Override
	public boolean update(Object t) {
		if (t instanceof UserEntity) {
			usersRepository.save((UserEntity)t);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Object t) {
		if (t instanceof UserEntity) {
			usersRepository.delete((UserEntity)t);
			return true;
		}
		return false;
	}

}
