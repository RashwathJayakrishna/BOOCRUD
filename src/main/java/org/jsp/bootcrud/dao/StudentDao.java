package org.jsp.bootcrud.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.bootcrud.ExcepionHandling.CloudVenderNotFoundException;
import org.jsp.bootcrud.dto.Student;
import org.jsp.bootcrud.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Repository
public class StudentDao {
@Autowired
private StudentRepo repo;
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return repo.save(s);
	}
	public List<Student> saveAll(List<Student> stu) {
		// TODO Auto-generated method stub
		return repo.saveAll(stu);
	}
	public List<Student> fetchAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	
	}
//	public Optional<Student> fetchById(int id) {
////		 TODO Auto-generated method stub
//		 Student s=this.repo.findById(id).orElseThrow()->new MethodArgumentNotValidException("fghjk");
//		 return Optional.of(s);
//	}
		public Student fetchById(int id) {
		// TODO Auto-generated method stub
			Optional<Student>op=repo.findById(id);
			if (op.isPresent()) {
				return op.get();
			} else {
// throw new CloudVenderNotFoundException("Requested does not exist");
				return null;
			}
		}
		public List<Student> fetchByName(String n) {
			// TODO Auto-generated method stub
			List<Student>op=repo.findByName(n);
			if (op.isEmpty()) {
				return null;
			} else {
                 return op;
			}
			
		}
		public List<Student> findByResult(String result) {
			// TODO Auto-generated method stub
			List<Student>l=repo.findByResult(result);
			if (l.isEmpty()) {
				return null;
			} else {
				return l;
			}
			
			
		}
		public List<Student> findByMobile(long mobile) {
			// TODO Auto-generated method stub
			List<Student>l=repo.findByMobile(mobile);
			if (l.isEmpty()) {
				return null;
			} else {
				return l;
			}
			
		}
		public List<Student> mathsGreterthen(int maths) {
			// TODO Auto-generated method stub
			List<Student>l=repo.findByMathsGreaterThan(maths);
			if (l.isEmpty()) {
				return null;
			} else {
				return l;
			}
		}
		public String deleteById(int id) {
			// TODO Auto-generated method stub
			Optional<Student>op=repo.findById(id);
			if (op.isPresent()) {
				repo.deleteById(id);
				return id+"  deleted successfuly";
			} else {
				return id+"  not found in database";
			}
		
		}
		public String deleteAll() {
			// TODO Auto-generated method stub
			List<Student>l=repo.findAll();
			if (l.isEmpty()) {
				return "database is emty ";
			} else {
				repo.deleteAll();
				return "all data deleted successfuly";
			}
			
		}
		public List<Student> greterandless(int n1, int n2) {
			List<Student>l=repo.findByMathsGreaterThanAndMathsLessThan(n1, n2);
			if (l.isEmpty()) {
				return null;
			} else {
				
				return l;
			}
			
		}
//		public Student update(Student student) {
//			// TODO Auto-generated method stub
//			return repo.save(student);
//		}

}
