package com.in28minutes.springboot.leardspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				
				new Course(1, "Learn AWS", "in28minnutes"),
				new Course(2, "Leard DevOps", "in28minutes")
				
				);
	}

}
