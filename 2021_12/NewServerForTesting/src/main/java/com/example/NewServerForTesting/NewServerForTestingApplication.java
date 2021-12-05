package com.example.NewServerForTesting;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.example.NewServerForTesting.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NewServerForTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewServerForTestingApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> rootRoute() {
		return List.of(new Student(1L, "Mariam", 30, LocalDate.of(2000, Month.FEBRUARY, 5), "mariam.jamal@gmail.com"));
	}

}
