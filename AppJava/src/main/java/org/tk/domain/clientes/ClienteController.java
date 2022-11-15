package org.tk.domain.clientes;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    private final ClienteRepository repository;

    ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/clientes")
    List<Cliente> all() {
        return repository.findAll();
    }

    @PostMapping("/clientes")
    Cliente newCliente(@RequestBody Cliente novoCliente) {
        return repository.save(novoCliente);
    }

    @GetMapping("/clientes/{id}")
    Cliente one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new ClienteNotFoundException(id));
    }

    @PutMapping("/clientes/{id}")
    Cliente atualizarCliente(@RequestBody Cliente novoCliente, @PathVariable Long id) {

        return repository.findById(id)
                .map(cliente -> {
                    cliente.setNome(novoCliente.getNome());
                    cliente.setContato(novoCliente.getContato());
                    return repository.save(cliente);
                })
                .orElseGet(() -> {
                    novoCliente.setId(id);
                    return repository.save(novoCliente);
                });
    }

    @DeleteMapping("/clientes/{id}")
    void excluirCliente(@PathVariable Long id) {
        repository.deleteById(id);
    }
}