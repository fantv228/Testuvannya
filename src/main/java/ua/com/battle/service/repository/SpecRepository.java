package ua.com.battle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.battle.service.entity.Spec;

public interface SpecRepository extends JpaRepository<Spec, Long> {};
