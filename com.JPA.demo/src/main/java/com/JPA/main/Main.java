package com.JPA.main;

import com.JPA.pojo.Student;
import com.JPA.service.StudentDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao studentDao = new StudentDao();
		
		Student student = new Student();
//		student.setId(1);
		student.setName("Jason Wang");
		student.setAddress("America");
		
		studentDao.add(student);
	}

}
