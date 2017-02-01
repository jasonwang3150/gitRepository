package com.JPA.main;

import com.JPA.pojo.Student;
import com.JPA.pojo.Student.Gender;
import com.JPA.service.StudentDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao studentDao = new StudentDao();
		
		Student student = new Student();
//		student.setId(4);
		student.setName("Jason Miao Miao");
		student.setAddress("China");
		student.setGender(Gender.Female);
		
		studentDao.add(student);
		studentDao.modify(student);
		
	}

}
