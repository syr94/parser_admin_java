package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.repositories.ItemPriceRepository;
import ru.rbt.parser.admin.services.ItemPriceService;

@Service
public class ItemPriceServiceImpl implements ItemPriceService {

    @Autowired
    private ItemPriceRepository itemPriceRepository;
}
