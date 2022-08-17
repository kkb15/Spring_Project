package com.Springrest.services;
import java.util.List;

import com.Springrest.entity.Course;



public interface CourseService {
	public List <Course> getCourses();
	
	public Course getcourse(long courseId);

	

	

}
