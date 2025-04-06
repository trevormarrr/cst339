package com.gcu.topic6_1.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gcu.topic6_1.data.entity.UserEntity;

public interface UsersRepository extends MongoRepository<UserEntity, String> {

	UserEntity findByUsername(String username);
}
