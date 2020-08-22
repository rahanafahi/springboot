package com.student.rahana.dal.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.rahana.dal.entities.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student,Long>{

	void save(Optional<Student> s);

}
