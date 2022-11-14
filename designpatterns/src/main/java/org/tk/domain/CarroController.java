package org.tk.domain;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarroController {

    private final CarroRepository repository;

    CarroController(CarroRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/carros")
    List<CarroVelho> listar() {
        return repository.findAll();
    }

    @DeleteMapping("/carros/{id}")
    void excluirCarro(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
