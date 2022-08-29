package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.Algorithm;

import java.util.List;
import java.util.Optional;

public interface AlgorithmRepository extends JpaRepository<Algorithm, Integer> {

    List<Algorithm> findAllByAlgorithmType(String type);
    Optional<Algorithm> findFirstByAlgorithmClassName(String type);
}
