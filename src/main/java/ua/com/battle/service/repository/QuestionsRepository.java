package ua.com.battle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.battle.service.entity.Questions;

public interface QuestionsRepository extends JpaRepository<Questions, Long> {};
