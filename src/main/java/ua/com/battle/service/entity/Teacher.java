package ua.com.battle.service.entity;

import lombok.*;
import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor @Entity
@Table(name = "teacher")


public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String login;
    private String pass;
    private String name;
    private String sname;
    private String lname;

    @OneToOne(mappedBy = "teachers")
    private Teacher teachers;

}

