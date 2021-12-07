package com.spring.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
	private List<Detail> details;
	
	 @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	    @JoinTable(name ="users_detail", joinColumns = { @JoinColumn(name = "id") }, inverseJoinColumns = {
	    	    @JoinColumn(name = "studentid") })
private List<UserDetail> userdetail;
	 
	 public User() { 
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

	public List<Detail> getDetails() {
		return details;
	}

	public void setDetails(List<Detail> details) {
		this.details = details;
	}

	public List<UserDetail> getUserdetail() {
		return userdetail;
	}

	public void setUserdetail(List<UserDetail> userdetail) {
		this.userdetail = userdetail;
	}

	public User(Integer id, String name, String email, List<Detail> details, List<UserDetail> userdetail) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.details = details;
		this.userdetail = userdetail;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", details=" + details + ", userdetail="
				+ userdetail + "]";
	}

	
}