package org.tk.domain.carros;

public class CarroNotFoundException extends RuntimeException{

    CarroNotFoundException(Long id) {
        super("Não consegui encontrar o Carro " + id);
    }
}