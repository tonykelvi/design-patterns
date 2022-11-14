package org.tk.domain;


public abstract class Carro implements Cloneable {

    public static enum Modelo {

        Sedan,
        Hatch,
        SUV,
    }
    public static enum Marca{
        Volkswagen,
        Ford,
        Chevrolet,
        Fiat,
        Volvo,
        Scania
    }
    public static enum Cor{
        Preto,
        Prata,
        Branco,
        Vermelho,
        Azul,
        Verde
    }

    private int id;
    protected Modelo modelo;
    protected Marca marca;
    protected Cor cor;

    public abstract void criarCarro();

    public Carro(){
    }

    public Carro(int id, Modelo modelo, Marca marca, Cor cor){
        super();

        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public Modelo getModelo(){
        return modelo;
    }
    public void setModelo(Modelo modelo){
        this.modelo = modelo;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Cor getCor() {
        return cor;
    }
    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    protected Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        StringBuffer detalhes = new StringBuffer();
        detalhes.append("Id: " + id);
        detalhes.append(" Modelo: " + modelo);
        detalhes.append(" Marca: " + marca);
        detalhes.append(" Cor: " + cor);
        return detalhes.toString();
    }
}