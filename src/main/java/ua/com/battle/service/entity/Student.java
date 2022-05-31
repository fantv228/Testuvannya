package ua.com.battle.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Entity
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String login;
    private String password;
    private String name;
    private String SurName;
    private String LastName;

    @ManyToOne
    @JoinColumn(name = "group")
    private Group groups;
}
