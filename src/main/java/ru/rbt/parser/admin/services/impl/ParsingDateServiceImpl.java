package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.repositories.ParsingDateRepository;
import ru.rbt.parser.admin.services.ParsingDateService;

@Service
public class ParsingDateServiceImpl implements ParsingDateService {

    @Autowired
    private ParsingDateRepository parsingDateRepository;
}
