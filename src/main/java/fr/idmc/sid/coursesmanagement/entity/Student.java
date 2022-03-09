package fr.idmc.sid.coursesmanagement.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Student extends User{

    public Student(int nextInt, String toString, LocalDate now, String bothify, String password) {
        super(nextInt,toString,now,bothify,password);
    }
}
