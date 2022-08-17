package com.Springrest.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Springrest.entity.Course;
import com.Springrest.services.CourseService;




@RestController

public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
		public String home() {
			return "Welcome to home";
		}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getcourse(Long.parseLong(courseId));
	}
}
