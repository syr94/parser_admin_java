package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.ItemParameterValue;

public interface ItemParameterValueRepository extends JpaRepository<ItemParameterValue, Integer> {
}
