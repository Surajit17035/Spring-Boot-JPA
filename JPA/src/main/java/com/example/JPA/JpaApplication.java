package com.example.JPA;

import com.example.JPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Navin");
//		s1.setMarks(75);
//
//		s2.setRollNo(102);
//		s2.setName("Pravin");
//		s2.setMarks(60);
//
		s3.setRollNo(103);
		s3.setName("Mukesh");
		s3.setMarks(55);

//		repo.save(s2);
//		repo.save(s3);

		repo.delete(s3);

		//System.out.println(repo.findById(102).orElse(new Student()));
		//System.out.println(repo.findByName("Navin"));


	}

}
