package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.entity.Student;
import com.sms.repository.Student_Repository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private Student_Repository studentRepository; 
	@Override
	public void run(String... args) throws Exception {
		
		  Student student1 = new Student(null, "Ramesh","Fadatare","amesh121@gmail.com");
		  studentRepository.save(student1);
		  
		  Student student2 = new Student(null, "Atul","Gupta","atul12@gmail.com");
		  studentRepository.save(student2);
		 
	}

}
