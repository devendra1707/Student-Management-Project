package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.entity.Student;

public interface Student_Repository extends JpaRepository<Student, Long> {

	
}
