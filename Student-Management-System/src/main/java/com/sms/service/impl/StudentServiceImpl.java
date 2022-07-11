package com.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.Student_Repository;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private Student_Repository studentRepository;

	public StudentServiceImpl(Student_Repository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {

		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);

	}

}
