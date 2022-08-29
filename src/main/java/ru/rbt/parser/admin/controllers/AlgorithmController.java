package ru.rbt.parser.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.rbt.parser.admin.entity.Algorithm;
import ru.rbt.parser.admin.services.impl.AlgorithmServiceImpl;

import javax.servlet.http.HttpServletResponse;
import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "/algorithm")
public class AlgorithmController extends AbstractController{

    @Autowired
    private AlgorithmServiceImpl algorithmService;

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity read(@PathVariable Integer id) {
        Optional<Algorithm> var =  algorithmService.getByAlgorithmId(id);
        return var.isPresent()?ResponseEntity.ok(var.get()) : ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/all", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity read() {
        List<Algorithm> var =  algorithmService.getAll();
        return ResponseEntity.ok(var);
    }

    @RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity read_type(@RequestParam(value="type") String type) {
        List<Algorithm> var =  algorithmService.getAllByType(type);
        return ResponseEntity.ok(var);
    }

    @PostMapping(value = "/create",
            consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE)
    public ResponseEntity create(@RequestBody Algorithm newAlgorithm) {
        Algorithm algorithm = algorithmService.save(newAlgorithm);
        if (algorithm == null) {
   //         throw new ServerException();
            return null;
        } else {
            return new ResponseEntity<>(algorithm, HttpStatus.CREATED);
        }
    }

    @PatchMapping(value = "/update/{id}",
            consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE)
    public ResponseEntity update(
            @RequestBody Algorithm newAlgorithm,
            @PathVariable Integer id
    ) {
        newAlgorithm.setAlgorithmId(id);
        Algorithm algorithm = algorithmService.update(newAlgorithm);
        if (algorithm == null) {
            //         throw new ServerException();
            return null;
        } else {
            return new ResponseEntity<>(algorithm, HttpStatus.CREATED);
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(
            @PathVariable Integer id,
            HttpServletResponse httpServletResponse
    ) {
        Boolean deleted = algorithmService.deleteById(id);

        if (deleted) {
            httpServletResponse.setHeader("Location", "/algorithm/all");
            httpServletResponse.setStatus(302);
        }
    }
}
