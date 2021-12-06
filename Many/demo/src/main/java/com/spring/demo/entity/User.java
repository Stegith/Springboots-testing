package com.spring.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="userss")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name= "id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	
	@OneToMany(mappedBy = "detailid" ,cascade = CascadeType.ALL)
	private List<Detail> detail;
	
   @ManyToMany(targetEntity = UserDetail.class,cascade = CascadeType.ALL)
   @JsonManagedReference
   private List<UserDetail> roles;
   
   
	public List<UserDetail> getRoles() {
	return roles;
}

public void setRoles(List<UserDetail> roles) {
	this.roles = roles;
}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Detail> getDetail() {
		return detail;
	}

	public void setDetail(List<Detail> detail) {
		this.detail = detail;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, String email, List<Detail> detail) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.detail = detail;
	}

	public User(List<UserDetail> roles) {
		super();
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [roles=" + roles + "]";
	}
	
	
}