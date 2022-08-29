package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.City;

public interface CityRepository extends JpaRepository<City, Integer> {
}
