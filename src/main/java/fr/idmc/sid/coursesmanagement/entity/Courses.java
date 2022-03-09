package fr.idmc.sid.coursesmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Courses {

    @Id
    private int id;
    private String name;
    private int duration;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "courses_students",
            joinColumns = @JoinColumn(name = "courses_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;
}
