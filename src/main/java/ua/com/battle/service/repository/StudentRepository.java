package ua.com.battle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.battle.service.entity.Student;
import ua.com.battle.service.entity.Teacher;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByLogin(String login);
};
