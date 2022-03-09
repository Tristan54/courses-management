package fr.idmc.sid.coursesmanagement.repository;

import fr.idmc.sid.coursesmanagement.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, String> {

    Courses findByIdEquals(int id);

}