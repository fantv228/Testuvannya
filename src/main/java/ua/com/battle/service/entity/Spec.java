package ua.com.battle.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "spec")

public class Spec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToOne(mappedBy = "specs")
    private Spec specs;
}
