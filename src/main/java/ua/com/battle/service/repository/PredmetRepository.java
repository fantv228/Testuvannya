package ua.com.battle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.battle.service.entity.Predmet;

public interface PredmetRepository extends JpaRepository<Predmet, Long> {};
