package com.springboot.demo.controller;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.Detail;
import com.springboot.demo.entity.User;
import com.springboot.demo.service.UserService;

@RequestMapping("/userss")
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/beat")
	public String model()
	{
		return LocalDate.now().toString();
	}

	@PostMapping("/change-email/{id}")
	public User requestChangeEmail(@RequestBody String mail, @PathVariable Integer id) {
		return userService.changeEmail(mail, id); 
	}
	/*@GetMapping("/get")
	public Iterable<User> fetchAll() {
		return userService.fetchAllRecords();
	}*/
	@GetMapping("/similar-records/{name}")
	public List<User> fetchSimlarRecordsByName(@PathVariable String name){
		return userService.findSimilarRecords(name);
	}
	@PostMapping("/add")
	public User fetchAll(@RequestBody User userss) {
		return userService.add(userss);
	}
	//getting details of one to many from detail
	@GetMapping("/query")
	public List<User> getAll()
	{
		return userService.getdetail();
	}
	//insert value to one to many
	@PostMapping("/address/{detailid}")
	public List<Detail> inserts(@RequestBody List<Detail> detail,@PathVariable Integer detailid) {
		return userService.insertaddr(detail, detailid);
	}
	//getting details of one to one from table
	@GetMapping("detail")
	public Iterable<Detail> findAll() {
		return userService.getAll();
	}
	//insert value to one to one
	@PostMapping("inserting/{detailid}")
	public User insert(@RequestBody User userss,@PathVariable Integer detailid){
        return userService.insertId(userss, detailid);
	}
}

