package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.entity.Algorithm;
import ru.rbt.parser.admin.entity.Site;
import ru.rbt.parser.admin.repositories.SiteRepository;
import ru.rbt.parser.admin.services.SiteService;

import java.util.List;
import java.util.Optional;

@Service
public class SiteServiceImpl implements SiteService {

    @Autowired
    private SiteRepository siteRepository;

    @Override
    public List<Site> getAll() {
        return siteRepository.findAll();
    }

    @Override
    public Optional<Site> getById(Integer id) {
        return siteRepository.findById(id);
    }

    @Override
    public Site save(Site site) {
        return siteRepository.save(site);
    }
}
