package com.coder.sanam;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.coder.sanam.entities.bidirectional.Course;
import com.coder.sanam.entities.bidirectional.Student;
import com.coder.sanam.entities.unidirectional.Role;
import com.coder.sanam.entities.unidirectional.User;
import com.coder.sanam.repositories.CourseRepository;
import com.coder.sanam.repositories.StudentRepository;
import com.coder.sanam.repositories.UserRepository;

@SpringBootApplication
public class SpringDataJpa {
	
	private static final Logger log = LoggerFactory.getLogger(SpringDataJpa.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpa.class, args);

		//Bidirectional Many to Many Mapping
		StudentRepository studentRepository = ctx.getBean(StudentRepository.class);
		Course course = new Course();
		course.setCourseName("Python Programming");
		course.setFees(1000d);
		
		Course course1 = new Course();
		course1.setCourseName("Java Programming");
		course1.setFees(2000d);
		
		Course course2 = new Course();
		course2.setCourseName("Pharma Chemicals");
		course2.setFees(500d);
		
		Student student = new Student();
		student.setLevel("Intermediate");
		student.setName("Sanam");
		student.setCourses(Arrays.asList(course,course1));
		
		Student student1 = new Student();
		student1.setLevel("Advanced");
		student1.setName("Aditi");
		student1.setCourses(Arrays.asList(course2));
		
		studentRepository.save(student);
		studentRepository.save(student1);
		
		//Unidirectional One To One Mapping
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		
		Role role = new Role();
		role.setName("Admin");
		
		Role qaRole = new Role();
		qaRole.setName("QA");
		
		Role managerRole = new Role();
		managerRole.setName("Manager");
		
		Role devRole = new Role();
		devRole.setName("Developer");
		
		User user = new User();
		user.setName("Rohan");
		user.setRoles(Arrays.asList(role,devRole));
		
		User user2 = new User();
		user2.setName("Nithin");
		user2.setRoles(Arrays.asList(role,managerRole));
		
		User user3 = new User();
		user3.setName("Ayush");
		user3.setRoles(Arrays.asList(qaRole));
		
		userRepository.saveAll(Arrays.asList(user,user2,user3));
	}

}
