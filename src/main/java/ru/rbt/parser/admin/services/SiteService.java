package ru.rbt.parser.admin.services;

import ru.rbt.parser.admin.entity.Site;

import java.util.List;
import java.util.Optional;

public interface SiteService {
    List<Site> getAll();
    Optional<Site> getById(Integer id);
    Site save(Site site);
}
