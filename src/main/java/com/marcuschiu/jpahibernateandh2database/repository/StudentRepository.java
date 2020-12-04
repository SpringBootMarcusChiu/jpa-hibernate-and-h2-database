package com.marcuschiu.jpahibernateandh2database.repository;

import com.marcuschiu.jpahibernateandh2database.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JpaRepository<Student, Long>
 * - Student is the entity that is being managed
 * - Long is the primary key of Student
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
