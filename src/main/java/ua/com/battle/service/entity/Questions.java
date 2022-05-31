package ua.com.battle.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;

import javax.persistence.*;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Entity
@Table(name = "questions")


public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private TinyIntTypeDescriptor trueanswer;
    private String pic;
}
