package com.example.crudd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudd.entity.Student;
import com.example.crudd.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
       
	@Autowired
	private StudentRepository studentRepository;

	@PostMapping("/save")
	public Student createStudent(@RequestBody Student stu) {
		return studentRepository.save(stu);
	}

	@GetMapping("/get")
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@GetMapping("/get-student/{id}")
	public Student getStudentById(@PathVariable(value = "id") Long id)

	{
		
		Student student = studentRepository.findById(id).get();

		return student;
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") Long id,
			@RequestBody Student studentdetails) {
		Student student = studentRepository.findById(id).get();
		student.setName(studentdetails.getName());
		student.setAddress(studentdetails.getAddress());
		Student save = studentRepository.save(student);
		return ResponseEntity.ok(save);
	}
	
	
	

	@DeleteMapping("/delete/{id}")
	public Map<String, Boolean> deleteStudent(@PathVariable(value = "id") Long id) {
		Student student = studentRepository.findById(id).get();

		studentRepository.delete(student);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

}
