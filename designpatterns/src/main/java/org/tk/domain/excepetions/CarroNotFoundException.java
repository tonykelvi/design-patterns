package org.tk.domain.excepetions;

public class CarroNotFoundException extends RuntimeException{

    CarroNotFoundException(Long id) {
        super("Não consegui encontrar o Carro " + id);
    }
}
