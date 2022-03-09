package fr.idmc.sid.coursesmanagement.repository;

import fr.idmc.sid.coursesmanagement.entity.Classroom;
import fr.idmc.sid.coursesmanagement.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, String> {
}