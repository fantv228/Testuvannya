package ua.com.battle.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Entity
@Table(name = "theme")

public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "predmet")
    private Predmet predmets;

    @OneToOne(mappedBy = "themes")
    private Theme themes;
}
