package ua.com.battle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.battle.service.entity.Test;

public interface TestRepository extends JpaRepository<Test, Long> {};
