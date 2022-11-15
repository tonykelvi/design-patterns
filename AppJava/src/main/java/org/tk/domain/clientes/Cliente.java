package org.tk.domain.clientes;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {
    private @Id @GeneratedValue Long id;
    private String nome;
    private String contato;

    Cliente() {
    }

    Cliente(String name, String contato) {

        this.nome = name;
        this.contato = contato;
    }

    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getContato() {
        return this.contato;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Cliente))
            return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(this.id, cliente.id) && Objects.equals(this.nome, cliente.nome)
                && Objects.equals(this.contato, cliente.contato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nome, this.contato);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + this.id + ", nome='" + this.nome + '\'' + ", contato='" + this.contato + '\'' + '}';
    }
}