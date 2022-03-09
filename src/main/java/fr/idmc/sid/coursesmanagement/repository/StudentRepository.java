package fr.idmc.sid.coursesmanagement.repository;

import fr.idmc.sid.coursesmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}