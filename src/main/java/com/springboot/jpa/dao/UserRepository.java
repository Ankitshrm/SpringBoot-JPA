package com.springboot.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
