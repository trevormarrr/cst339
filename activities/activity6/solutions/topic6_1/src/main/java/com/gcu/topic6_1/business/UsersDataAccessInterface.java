package com.gcu.topic6_1.business;

public interface UsersDataAccessInterface <T> {

	public T findByUsername(String username);
}
