package org.tk.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CarroVelho {

    private @Id @GeneratedValue Long id;
    private String modelo;
    private String marca;
    private String cor;

    CarroVelho() {}

    CarroVelho (String modelo, String marca) {

        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public Long getId() {
        return this.id;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof CarroVelho))
            return false;
        CarroVelho carroVelho = (CarroVelho) o;
        return Objects.equals(this.id, carroVelho.id) && Objects.equals(this.modelo, carroVelho.modelo)
                && Objects.equals(this.marca, carroVelho.marca) && Objects.equals(this.cor, carroVelho.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.modelo, this.marca, this.cor);
    }

    @Override
    public String toString() {
        return "CarroVelho{" + "id=" + this.id + ", modelo='" + this.modelo + '\'' +
                ", marca='" + this.marca + ", cor='" + this.cor + '\'' + '}';
    }
}
