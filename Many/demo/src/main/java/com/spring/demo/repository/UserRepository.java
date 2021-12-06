package com.spring.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.demo.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
