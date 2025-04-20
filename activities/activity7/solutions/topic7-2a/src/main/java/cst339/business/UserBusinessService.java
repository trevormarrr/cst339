package cst339.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst339.data.entity.UserEntity;
import cst339.data.repository.UsersRepository;
import cst339.model.UserModel;

@Service
public class UserBusinessService {

	@Autowired
	private UsersRepository usersRepository;

	/**
	 * Constructor Injection
	 */
	public UserBusinessService(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	/**
	 * Get all Users from the database
	 */
	public List<UserModel> getAllUsers() {
		// Get all the Entity Users
		List<UserEntity> usersEntity = usersRepository.findAll();
		// Iterate over the Entity Users and create a list of Domain Users
		List<UserModel> usersDomain = new ArrayList<UserModel>();
		for (UserEntity userEntity : usersEntity) {
			usersDomain.add(new UserModel(userEntity.getId(), userEntity.getUsername(), userEntity.getPassword()));
		}

		// Return list of Domain Users
		return usersDomain;
	}
}
