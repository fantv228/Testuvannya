package ua.com.battle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.battle.service.entity.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Long> {};
