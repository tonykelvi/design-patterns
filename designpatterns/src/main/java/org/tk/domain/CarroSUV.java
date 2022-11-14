package org.tk.domain;

public class CarroSUV extends Carro {

    public CarroSUV() {
        modelo = Modelo.SUV;
    }

    @Override
    public void criarCarro() {
        System.out.println("Novo carro SUV criado!");
    }
}