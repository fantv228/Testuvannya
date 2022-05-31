package ua.com.battle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.battle.service.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
 static Teacher findByLogin(String login) {
  return null;
 }
}
