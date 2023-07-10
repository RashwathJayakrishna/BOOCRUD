package org.jsp.bootcrud.controller;

import java.util.List;
import java.util.Optional;

import org.jsp.bootcrud.dto.Student;
import org.jsp.bootcrud.helper.ResponseStructure;
import org.jsp.bootcrud.repository.StudentRepo;
import org.jsp.bootcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
//@Controller
public class StudentController {
@Autowired
	StudentService service;
//@Autowired
//StudentRepo repo;

@PostMapping("student")
public ResponseStructure<Student> save(@Valid @RequestBody Student student) {
	return service.save(student);
	
}

@PostMapping("student/All")
public ResponseStructure<List<Student>> save(@Valid @RequestBody List< Student> student) {
	return service.saveAll(student);
	
}

@GetMapping("student/fetchAll")
public ResponseStructure<List<Student>> fetchAll(){
	return service.fetchAll();
	
}
//@GetMapping("fetchById/{id}")//localhost:8080/fetchById/6
//public Student fetchById(@PathVariable("id") int id){
//	return service.fetchById(id);
//	
//}
@GetMapping("student/fetchById")//localhost:8080/fetchById?id=6
public ResponseStructure<Student> fetchById(@RequestParam int id){
	return service.fetchById(id);
	
}
@GetMapping("student/fetchByName/{name}")
public ResponseStructure<List<Student>> fetchByName(@PathVariable("name") String name){
//public List<Student> fetchByName(String name){
	return service.fetchByName(name);
}

@GetMapping("student")
public ResponseStructure<List<Student>> findByResult(@RequestParam String result){
	
	return service.findByResult(result);
	
}
@GetMapping("student/findByMobile")
public ResponseStructure<List<Student>> findByMobile( @RequestParam long mobile){
	return service.findByMobile(mobile);
	
}

@GetMapping("student/mathsGreterthen")
public ResponseStructure<List<Student>> mathsGreterthen(@RequestParam int maths){
	return service.mathsGreterthen( maths);
	
}

@DeleteMapping("student/deleteById")
public ResponseStructure<Student> deleteById(@RequestParam int id) {
	return service.deleteById(id);
	
}
@DeleteMapping("student/deleteAll")
public ResponseStructure<List<Student>> deleteAll() {
	return service.deleteAll();
	
//	repo.deleteAll();
//	return "all data deleted successfuly";
}

@GetMapping("student/greterandless")
public ResponseStructure<List<Student>> greterandless(@RequestParam int n1,int n2){
	
	
	return  service.greterandless(n1, n2);
	
}

@PutMapping("studentupdate/{id}")
public ResponseStructure<Student> update(@Valid @PathVariable("id") int id,@RequestBody Student student) {
	
	student.setId(id);
	return service.save(student);
	
}
}
