package ru.rbt.parser.admin.services;

import ru.rbt.parser.admin.entity.Algorithm;

import java.util.List;
import java.util.Optional;

public interface AlgorithmService {
    List<Algorithm> getAllByType(String type);

    Optional<Algorithm> getByAlgorithmId(Integer algorithm_id);

    List<Algorithm> getAll();

    Algorithm save(Algorithm algorithm);

    Algorithm update(Algorithm algorithm);

    Optional<Algorithm> getByClassName(String className);

    Boolean deleteById(Integer id);

}
