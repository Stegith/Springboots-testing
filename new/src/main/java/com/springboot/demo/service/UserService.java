package com.springboot.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.entity.Detail;
import com.springboot.demo.entity.User;
import com.springboot.demo.repositrory.DetailRepository;
import com.springboot.demo.repositrory.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private DetailRepository detailRepository;
	
	public User changeEmail(String mail, Integer id) {
		Optional<User> savedUser = userRepository.findById(id);
		System.out.println(id);//Getting the saved user from DB using id (Primary field)
		if(savedUser.isEmpty()) {
			System.err.println("Not found for ID: "+id);
			return null;
		}else {
			savedUser.get().setEmail(mail); // setting the incoming new email
			return userRepository.save(savedUser.get()); // saving the updated data in DB
		}
	}
	public Iterable<User> fetchAllRecords() {
		return userRepository.findAll();
	}
	public List<User> findSimilarRecords(String name){
		return userRepository.findByName(name);
	}
	public User add(User userss) {
		return userRepository.save(userss);
		}
	public List<User> getdetail()
	{
		return userRepository.findAll();
	}
	public List<Detail> insertaddr(List<Detail> detail, Integer detailid) {
		detailRepository.saveAll(detail);
	     return detailRepository.findByDetailid(detailid);
	}

}

