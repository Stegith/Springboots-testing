package com.spring.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="users_detail")
public class UserDetail {


	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="studentid")
	private Integer studentid;
	private String position;
	private String type;

	 @ManyToMany(targetEntity = User.class, mappedBy = "userdetail", cascade = CascadeType.ALL)
	    @JsonBackReference
	    private List<User> userss;
	 
	 public UserDetail() {
	 }

	public UserDetail(String position, String type) {
		super();
		this.position = position;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<User> getUserss() {
		return userss;
	}

	public void setUserss(List<User> userss) {
		this.userss = userss;
	}

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", studentid=" + studentid + ", position=" + position + ", type=" + type
				+ ", userss=" + userss + "]";
	}
	 
}
