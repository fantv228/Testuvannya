package ua.com.battle.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.battle.service.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {};

