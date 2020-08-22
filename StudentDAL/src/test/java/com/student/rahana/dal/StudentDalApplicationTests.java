package com.student.rahana.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.student.rahana.dal.entities.Student;
import com.student.rahana.dal.repository.StudentRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
class StudentDalApplicationTests {
@Autowired
private StudentRepository studentRepo;
	@Test
	public void testCreateStudent()
	{
		Student s1=new Student();
		s1.setName("john");
		s1.setFees(45.00);
		s1.setCourse("java8");
		studentRepo.save(s1);
	}
	
	  @Test
	  public void testUpdateStudent() { 
		  Optional<Student>s=studentRepo.findById((long) 2); 
		
		  if(s.get().getId()==2)
		  {
			  s.get().setName("renuka");
		  }
		  studentRepo.save(s);
		  }
	  
	  @Test public void testReadStudent() {
	  System.out.println(studentRepo.findById(1L)); }
	  
	  @Test public void testDeleteStudent() {Optional<Student>
	  s=studentRepo.findById(1L); if(s.isPresent()) { studentRepo.deleteById(1L);
	  }
	  
	  }
	 
}
