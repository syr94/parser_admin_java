package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.ItemPrice;

public interface ItemPriceRepository extends JpaRepository<ItemPrice, Integer> {
}
