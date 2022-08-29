package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.repositories.SiteCityAlgorithmRepository;
import ru.rbt.parser.admin.services.SiteCityAlgorithmService;

@Service
public class SiteCityAlgorithmServiceImpl implements SiteCityAlgorithmService {

    @Autowired
    private SiteCityAlgorithmRepository siteCityAlgorithmRepository;
}
