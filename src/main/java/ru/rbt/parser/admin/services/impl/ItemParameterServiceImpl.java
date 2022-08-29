package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.repositories.ItemParameterRepository;
import ru.rbt.parser.admin.services.ItemParameterService;

@Service
public class ItemParameterServiceImpl implements ItemParameterService {

    @Autowired
    private ItemParameterRepository itemParameterRepository;
}
