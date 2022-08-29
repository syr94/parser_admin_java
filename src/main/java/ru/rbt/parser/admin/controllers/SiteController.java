package ru.rbt.parser.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.rbt.parser.admin.entity.Algorithm;
import ru.rbt.parser.admin.entity.Site;
import ru.rbt.parser.admin.services.impl.SiteServiceImpl;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "/site")
public class SiteController extends AbstractController{

    @Autowired
    private SiteServiceImpl siteService;

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity read(@PathVariable Integer id) {
        Optional<Site> var =  siteService.getById(id);
        return var.isPresent()?ResponseEntity.ok(var.get()) : ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/all", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity read() {
        List<Site> var =  siteService.getAll();
        return ResponseEntity.ok(var);
    }

    @PostMapping(value = "/create",
            consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE)
    public ResponseEntity create(@RequestBody Site newSite) {
        Site site = siteService.save(newSite);
        if (site == null) {
            //         throw new ServerException();
            return null;
        } else {
            return new ResponseEntity<>(site, HttpStatus.CREATED);
        }
    }
}
