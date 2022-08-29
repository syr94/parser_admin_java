package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.entity.City;
import ru.rbt.parser.admin.repositories.CityRepository;
import ru.rbt.parser.admin.services.CityService;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> getByCityId(Integer id) {
        return  cityRepository.findById(id);
    }
}
