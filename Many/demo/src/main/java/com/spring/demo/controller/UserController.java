package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.entity.Detail;
import com.spring.demo.entity.User;
import com.spring.demo.repository.DetailRepository;
import com.spring.demo.repository.UserRepository;
import com.spring.demo.service.UserService;

@RequestMapping("userss")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private DetailRepository detailRepository;
	
	@GetMapping("/detail")
	public Iterable<User> getAll()
	{
		return userService.getdetail();
	}
	@PostMapping("/address/{detailid}")
	public List<Detail> inserts(@RequestBody List<Detail> detail,@PathVariable Integer detailid) {
		return userService.insertaddr(detail, detailid);
	}	
	@PostMapping("/add_detail")
	public User createUser(@RequestBody User userss) {
		return userRepository.save(userss);
	}
	@GetMapping("/find")
	public Iterable<Detail> fetchAll() {
		return detailRepository.findAll();
	}
}
