package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.repositories.CatalogueRepository;
import ru.rbt.parser.admin.services.CatalogueService;

@Service
public class CatalogueServiceImpl implements CatalogueService {

    @Autowired
    private CatalogueRepository catalogueRepository;
}
