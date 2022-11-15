package org.tk.domain.carros;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {

    private final CarroRepository repository;

    CarroController(CarroRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/carros")
    List<Carro> listar() {
        return repository.findAll();
    }

    @PostMapping("/carros")
    Carro newCar(@RequestBody Carro novoCarro) {
        return repository.save(novoCarro);
    }

    @PutMapping ("/carros/{id}")
    Carro atualizarCarro(@RequestBody Carro novoCarro, @PathVariable Long id) {

        return repository.findById(id)
                .map(carro -> {
                    carro.setModelo(novoCarro.getModelo());
                    carro.setPlaca(novoCarro.getPlaca());
                    return repository.save(carro);
                })
                .orElseGet(() -> {
                    novoCarro.setId(id);
                    return repository.save(novoCarro);
                });
    }

    @DeleteMapping("/carros/{id}")
    void excluirCarro(@PathVariable Long id) {
        repository.deleteById(id);
    }
}