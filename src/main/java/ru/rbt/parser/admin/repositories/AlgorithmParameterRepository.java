package ru.rbt.parser.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rbt.parser.admin.entity.AlgorithmParameter;

public interface AlgorithmParameterRepository extends JpaRepository<AlgorithmParameter, Integer> {
}
