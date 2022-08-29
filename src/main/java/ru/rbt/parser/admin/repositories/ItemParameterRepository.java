package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.ItemParameter;

public interface ItemParameterRepository extends JpaRepository<ItemParameter, Integer> {
}
