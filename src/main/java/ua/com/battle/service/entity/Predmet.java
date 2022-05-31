package ua.com.battle.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Entity
@Table(name = "predmet")

public class Predmet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "teacher")
    private Teacher teachers;

    @OneToOne(mappedBy = "predmets")
    private Predmet predmets;
}
