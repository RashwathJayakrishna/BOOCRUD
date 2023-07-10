package org.jsp.bootcrud.repository;

import java.util.List;
import java.util.Optional;

import org.jsp.bootcrud.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {


	
	List<Student> findByName(String name);
List<Student> findByResult(String result);
List<Student> findByMobile(long mobile);
List<Student> findByMathsGreaterThan(int maths);
List<Student> findByMathsLessThan(int maths);
List<Student> findByMathsGreaterThanAndMathsLessThan(int maths1,int maths2);
Optional<Student> findById(int id);
}