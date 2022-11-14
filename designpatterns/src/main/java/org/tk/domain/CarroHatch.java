package org.tk.domain;

public class CarroHatch extends Carro {

    public CarroHatch() {
        modelo = Modelo.Hatch;
    }

    @Override
    public void criarCarro() {
        System.out.println("Novo carro Hatch criado!");
    }
}
