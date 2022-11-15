package org.tk.domain.admin;

public class PapelDesenvolvedor extends Usuarios{

    public PapelDesenvolvedor(){
        papeis = Papeis.Desenvolvedores;
    }

    @Override
    public void criarUsuario() {
        System.out.println("Usuario Desenvolvedor");
    }
}
