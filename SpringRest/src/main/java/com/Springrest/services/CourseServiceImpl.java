package com.Springrest.services;
import com.Springrest.entity.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
	List<Course> list;
	public CourseServiceImpl() {
		list =new ArrayList<>();
		list.add(new Course(12,"Java","course for java"));
		list.add(new Course(72,"C++","course for C++"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Course getcourse(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

}
