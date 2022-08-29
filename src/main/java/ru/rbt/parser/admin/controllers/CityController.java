package ru.rbt.parser.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.rbt.parser.admin.entity.Algorithm;
import ru.rbt.parser.admin.entity.City;
import ru.rbt.parser.admin.services.impl.CityServiceImpl;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(path = "/city")
public class CityController extends AbstractController{

    @Autowired
    private CityServiceImpl cityService;

    @GetMapping(value = "/all", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity read() {
        List<City> var =  cityService.getAll();
        return ResponseEntity.ok(var);
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity read(@PathVariable Integer id) {
        Optional<City> var =  cityService.getByCityId(id);
        return var.isPresent()?ResponseEntity.ok(var.get()) : ResponseEntity.notFound().build();
    }
}
