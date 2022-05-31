package ua.com.battle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.battle.service.entity.TestHistory;

public interface TestHistoryRepository extends JpaRepository<TestHistory, Long> {};
