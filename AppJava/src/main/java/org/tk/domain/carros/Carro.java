package org.tk.domain.carros;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Carro {
    private @Id @GeneratedValue Long id;
    private String modelo;
    private String placa;

    Carro() {}

    Carro(String modelo, String placa) {

        this.modelo = modelo;
        this.placa = placa;
    }

    public Long getId() {
        return this.id;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Carro))
            return false;
        Carro carro = (Carro) o;
        return Objects.equals(this.id, carro.id) && Objects.equals(this.modelo, carro.modelo)
                && Objects.equals(this.placa, carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.modelo, this.placa);
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + this.id + ", modelo='" + this.modelo + '\'' +
                ", marca='" + this.placa + '\'' + '}';
    }
}
