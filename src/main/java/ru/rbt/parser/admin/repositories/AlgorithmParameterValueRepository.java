package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.AlgorithmParameterValue;

public interface AlgorithmParameterValueRepository extends JpaRepository<AlgorithmParameterValue, Integer> {
}
