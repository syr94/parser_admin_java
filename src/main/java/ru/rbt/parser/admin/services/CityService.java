package ru.rbt.parser.admin.services;


import ru.rbt.parser.admin.entity.City;

import java.util.List;
import java.util.Optional;

public interface CityService {
    public List<City> getAll();
    public Optional<City> getByCityId(Integer id);
}
