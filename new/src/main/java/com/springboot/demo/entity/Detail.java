package com.springboot.demo.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="detail")
public class Detail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="studentid")
	private Integer studentid;
	@Column(name="cityname")
	private String cityname;
	@Column(name="state")
	private String state;
	@Column(name="pincode")
	private Integer pincode;
	@Column(name="detailid")
	private Integer detailid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="detailid",nullable=false, updatable = false, insertable = false)
	public User userss;

	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Integer getDetailid() {
		return detailid;
	}
	public void setDetailid(Integer detailid) {
		this.detailid = detailid;
	}
<<<<<<< HEAD:new/src/main/java/com/springboot/demo/entity/Detail.java
	@Override
	public String toString() {
		return "Detail [studentid=" + studentid + ", cityname=" + cityname + ", state=" + state + ", pincode=" + pincode
				+ ", detailid=" + detailid + ", getStudentid()=" + getStudentid() + ", getCityname()=" + getCityname()
				+ ", getState()=" + getState() + ", getPincode()=" + getPincode() + ", getDetailid()=" + getDetailid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Detail(Integer studentid, String cityname, String state, Integer pincode, Integer detailid) {
		super();
		this.studentid = studentid;
		this.cityname = cityname;
		this.state = state;
		this.pincode = pincode;
		this.detailid = detailid;
	}
	public Detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
=======
	public User getUserss() {
		return userss;	}
	public void setUserss(User userss) {
		this.userss = userss;	
	}}
>>>>>>> 98f15a61dc4f52eacc9227560cf2ed0c191e989d:demo/demo/src/main/java/com/springboot/demo/entity/Detail.java
