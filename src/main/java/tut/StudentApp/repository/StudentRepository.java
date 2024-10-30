package tut.StudentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tut.StudentApp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}
