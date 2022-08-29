package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.repositories.AlgorithmParameterRepository;
import ru.rbt.parser.admin.services.AlgorithmParameterService;

@Service
public class AlgorithmParameterServiceImpl implements AlgorithmParameterService {

    @Autowired
    private AlgorithmParameterRepository algorithmParameterRepository;
}
