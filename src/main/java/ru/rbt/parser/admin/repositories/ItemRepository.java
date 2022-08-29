package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
