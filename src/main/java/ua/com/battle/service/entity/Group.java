package ua.com.battle.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Entity
@Table(name = "group")

public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String curs;

    @ManyToOne
    @JoinColumn(name = "teacher")
    private Teacher teachers;

    @ManyToOne
    @JoinColumn(name = "spec")
    private Spec specs;

    @OneToOne(mappedBy = "groups")
    private Group groups;
}
