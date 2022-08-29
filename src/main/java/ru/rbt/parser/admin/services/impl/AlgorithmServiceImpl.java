package ru.rbt.parser.admin.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rbt.parser.admin.entity.Algorithm;
import ru.rbt.parser.admin.repositories.AlgorithmRepository;
import ru.rbt.parser.admin.services.AlgorithmService;

import java.util.List;
import java.util.Optional;

@Service
public class AlgorithmServiceImpl implements AlgorithmService {

    @Autowired
    private AlgorithmRepository algorithmRepository;

    @Override
    public Optional<Algorithm> getByAlgorithmId(Integer algorithm_id) {
        return algorithmRepository.findById(algorithm_id);
    }

    @Override
    public List<Algorithm> getAll() {
        return algorithmRepository.findAll();
    }

    @Override
    public List<Algorithm> getAllByType(String type) {
        return algorithmRepository.findAllByAlgorithmType(type);
    };

    @Override
    public Optional<Algorithm> getByClassName(String className){
        return algorithmRepository.findFirstByAlgorithmClassName(className);
    };

    @Override
    public Algorithm save(Algorithm algorithm) {
        return algorithmRepository.save(algorithm);
    };

    @Override
    public Algorithm update(Algorithm algorithm) {
        return  algorithmRepository.saveAndFlush(algorithm);
    }

    @Override
    public Boolean deleteById(Integer id) {
        try {
            algorithmRepository.deleteById(id);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    };
}
