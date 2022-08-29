package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.repositories.AlgorithmParameterValueRepository;
import ru.rbt.parser.admin.services.AlgorithmParameterValueService;

@Service
public class AlgorithmParameterValueServiceImpl implements AlgorithmParameterValueService {

    @Autowired
    private AlgorithmParameterValueRepository algorithmParameterValueRepository;
}
