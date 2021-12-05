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
public class NewServerForTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewServerForTestingApplication.class, args);
	}

}
