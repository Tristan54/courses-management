package fr.idmc.sid.coursesmanagement.controller;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import fr.idmc.sid.coursesmanagement.entity.*;
import fr.idmc.sid.coursesmanagement.repository.CoursesRepository;
import fr.idmc.sid.coursesmanagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDate;
import java.util.*;


@RestController
@RequestMapping("/courses")
public class Controller {

    @Autowired
    private CoursesRepository coursRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/{id}")
    ResponseEntity<?> addCourses(@PathVariable int id) {
        Courses courses = coursRepository.findByIdEquals(id);

        if(courses != null){
            return ResponseEntity.ok(courses);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/add")
    ResponseEntity<?> addCourses(@RequestBody TeacherSign teacherSign) {

        Faker faker = new Faker();
        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());

        Teacher teacher = teacherRepository.findByEmailLike(teacherSign.getEmail());

        Classroom classroom = new Classroom(1, 1, 1);

        List<Student> students = new ArrayList<>();
        students.add(new Student(new Random().nextInt(), faker.name().toString(), LocalDate.now(), fakeValuesService.bothify("????##@gmail.com"), "password"));
        students.add(new Student(new Random().nextInt(), faker.name().toString(), LocalDate.now(), fakeValuesService.bothify("????##@gmail.com"), "password"));

        Courses courses = new Courses(1, "Cours", 20, classroom, teacher, students);

        coursRepository.save(courses);

        return ResponseEntity.created(URI.create("/courses/"+courses.getId())).build();
    }

}
