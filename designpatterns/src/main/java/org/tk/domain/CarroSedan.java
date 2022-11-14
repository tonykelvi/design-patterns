package org.tk.domain;

public class CarroSedan extends Carro {

    public CarroSedan() {
        modelo = Modelo.Sedan;
    }

    @Override
    public void criarCarro() {
        System.out.println("Novo carro Sedan criado!");
    }
}