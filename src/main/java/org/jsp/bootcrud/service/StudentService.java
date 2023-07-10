package org.jsp.bootcrud.service;

import java.util.List;
import java.util.Optional;

import org.jsp.bootcrud.dao.StudentDao;
import org.jsp.bootcrud.dto.Student;
import org.jsp.bootcrud.helper.ResponseStructure;
import org.jsp.bootcrud.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
@Autowired
StudentDao dao;

//StudentRepo repo;
	public  ResponseStructure<Student> save(Student s) {
		// TODO Auto-generated method stub
		s.setTotal(s.getChemistry()+s.getMaths()+s.getPhysics());

		s.setPercentage(s.getTotal()/3.0);
//		s.setAge(0)
		
		if(s.getChemistry()<35||s.getMaths()<35||s.getPhysics()<35) {
			s.setResult("fail");
		}
		else if(s.getPercentage()>=85) {
			s.setResult("Distinction");
		}
		else if(s.getPercentage()>=60) {
			s.setResult("first class");
		}
		else  {
			s.setResult("second class");
		}
		ResponseStructure<Student> structure=new  ResponseStructure<>();
		structure.setMessage("data saved successfuly");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(dao.save(s));
//		return repo.save(s);
//		return dao.save(s);
		return structure;
	}
	public ResponseStructure<List<Student>> saveAll(List<Student> stu) {
		for (Student s : stu) {
			s.setTotal(s.getChemistry()+s.getMaths()+s.getPhysics());

			s.setPercentage(s.getTotal()/3.0);
			
			if(s.getChemistry()<35||s.getMaths()<35||s.getPhysics()<35) {
				s.setResult("fail");
			}
			else if(s.getPercentage()>=85) {
				s.setResult("Distinction");
			}
			else if(s.getPercentage()>=60) {
				s.setResult("first class");
			}
			else  {
				s.setResult("second class");
			}
		}
		ResponseStructure<List< Student> >structure=new  ResponseStructure<>();
		structure.setMessage("data saved successfuly");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(dao.saveAll(stu));
//		return  dao.saveAll(stu);
		return structure;
	}
	public ResponseStructure< List<Student> >fetchAll() {
		// TODO Auto-generated method stub
		
		List<Student>list=dao.fetchAll();
		ResponseStructure<List< Student> >structure=new  ResponseStructure<>();
		
		if (list.isEmpty()) {
			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			
		} else {
			structure.setMessage("data found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(list);
		}
		return structure;
//		return dao.fetchAll();
	}
	public ResponseStructure<Student> fetchById(int id) {
		// TODO Auto-generated method stub
		Student student=dao.fetchById(id);
		ResponseStructure< Student> structure=new  ResponseStructure<>();
		if (student==null) {
			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		} else {
			structure.setMessage("data found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(student);
		}
//		return dao.fetchById(id);
		return structure;
	}
	public ResponseStructure<List<Student>> fetchByName(String n) {
		List<Student>list=dao.fetchByName(n);
		ResponseStructure<List< Student> >structure=new  ResponseStructure<>();
		
		if (list.isEmpty()) {
			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			
		} else {
			structure.setMessage("data found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(list);
		}
		return structure;
//		return dao.fetchByName(n);
	}
	public ResponseStructure< List<Student> >findByResult(String result) {
		List<Student>list=dao.findByResult(result);
		ResponseStructure<List< Student> >structure=new  ResponseStructure<>();
		
		if (list.isEmpty()) {
			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			
		} else {
			structure.setMessage("data found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(list);
		}
		return structure;
//		return dao.findByResult(result);
	}
	public ResponseStructure<List<Student> >findByMobile(long mobile) {
		List<Student>list= dao.findByMobile(mobile);
		ResponseStructure<List< Student> >structure=new  ResponseStructure<>();
		
		if (list.isEmpty()) {
			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			
		} else {
			structure.setMessage("data found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(list);
		}
//		return dao.findByMobile(mobile);
		return structure;
	}
	public ResponseStructure<List<Student>> mathsGreterthen(int maths) {
		List<Student>list= dao.mathsGreterthen( maths);
		ResponseStructure<List< Student> >structure=new  ResponseStructure<>();
		
		if (list.isEmpty()) {
			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			
		} else {
			structure.setMessage("data found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(list);
		}
//		return dao.mathsGreterthen( maths);
		return structure;
	}
	public ResponseStructure<Student> deleteById(int id) {
		Student student=dao.fetchById(id);
		ResponseStructure< Student> structure=new  ResponseStructure<>();
		if (student==null) {
			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		} else {
			dao.deleteById( id);
			structure.setMessage("data deleted successfuly");
			structure.setStatus(HttpStatus.FOUND.value());
			
		}
//		return dao.deleteById( id);
		return structure;
	}
	public ResponseStructure<List< Student> > deleteAll() {
		List<Student>list=dao.fetchAll();
		ResponseStructure<List< Student> >structure=new  ResponseStructure<>();
		
		if (list.isEmpty()) {
			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			
		} else {
			dao.deleteAll();
			structure.setMessage("data deleted successfuly");
			structure.setStatus(HttpStatus.FOUND.value());
			
		}
		return structure;
//		return dao.deleteAll();
	}
	public ResponseStructure<List<Student>> greterandless(int n1, int n2) {
		List<Student>list= dao.greterandless( n1, n2);
		ResponseStructure<List< Student> >structure=new  ResponseStructure<>();
		
		if (list.isEmpty()) {
			structure.setMessage("data not found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			
		} else {
			structure.setMessage("data found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(list);
		}
//		return dao.greterandless( n1, n2);
		return structure;
	}
//	public Student update(Student student) {
//		// TODO Auto-generated method stub
//		return dao.update( student);
//	}
	

}
