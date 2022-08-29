package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.Catalogue;

public interface CatalogueRepository extends JpaRepository<Catalogue, String> {
}
