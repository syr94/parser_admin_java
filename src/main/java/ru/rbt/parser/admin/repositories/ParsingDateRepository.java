package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.ParsingDate;

public interface ParsingDateRepository extends JpaRepository<ParsingDate, Integer> {
}
