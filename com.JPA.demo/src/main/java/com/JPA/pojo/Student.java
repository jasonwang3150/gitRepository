package com.JPA.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentList")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	private String name;
	private String address;
	
	public Student(Integer id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
		super();
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
	   return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
