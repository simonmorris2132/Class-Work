package com.example.NewServerForTesting.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    public List<Student> getStudents() {
		return List.of(new Student(1L, "Mariam", 30, LocalDate.of(2000, Month.FEBRUARY, 5), "mariam.jamal@gmail.com"));
	}

}
