package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.repositories.SiteCityRepository;
import ru.rbt.parser.admin.services.SiteCityService;

@Service
public class SiteCityServiceImpl implements SiteCityService {

    @Autowired
    private SiteCityRepository siteCityRepository;
}
