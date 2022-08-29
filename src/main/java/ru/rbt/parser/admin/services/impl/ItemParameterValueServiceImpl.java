package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.repositories.ItemParameterValueRepository;
import ru.rbt.parser.admin.services.ItemParameterValueService;

@Service
public class ItemParameterValueServiceImpl implements ItemParameterValueService{

    @Autowired
    private ItemParameterValueRepository itemParameterValueRepository;
}
