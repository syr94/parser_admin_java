package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.Site;

public interface SiteRepository extends JpaRepository<Site, Integer> {
}
