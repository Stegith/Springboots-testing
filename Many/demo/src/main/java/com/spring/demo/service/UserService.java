package com.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.entity.Detail;
import com.spring.demo.entity.User;
import com.spring.demo.repository.DetailRepository;
import com.spring.demo.repository.UserRepository;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;
@Autowired
private DetailRepository detailRepository;

public Iterable<User> getdetail(){
	return userRepository.findAll();
}
public List<Detail> insertaddr(List<Detail> detail, Integer detailid) {
	detailRepository.saveAll(detail);
     return detailRepository.findByDetailid(detailid);
}

}
