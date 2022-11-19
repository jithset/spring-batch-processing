package com.github.jithset.batchprocessing.repository;

import com.github.jithset.batchprocessing.entity.Customer;
import com.github.jithset.batchprocessing.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
