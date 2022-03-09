package fr.idmc.sid.coursesmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class User {

    @Id
    private int id;
    private String name;
    private LocalDate dateBirth;
    private String email;
    private String password;
}
