package com.springboot.demo.repositrory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.entity.Detail;
import com.springboot.demo.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
//Auto query
  List<User> findByEmail(String email);
  List<User> findByName(String name);
  List<User> findAll();
User save(Detail detail);
User findById(User userss);
  
}