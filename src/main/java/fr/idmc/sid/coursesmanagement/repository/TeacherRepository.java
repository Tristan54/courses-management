package fr.idmc.sid.coursesmanagement.repository;

import fr.idmc.sid.coursesmanagement.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String> {

    Teacher findByEmailLike(String email);

}