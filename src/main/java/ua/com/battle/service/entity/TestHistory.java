package ua.com.battle.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;

import javax.persistence.*;
import java.time.DateTimeException;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Entity
@Table(name = "test_history")

public class TestHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String student;
    private String predmet;
    private String theme;
    private String test;
    private String ocinka;
    private DateTimeException start;
    private DateTimeException end;
    private String true_quest;
    private String false_quest;
}
