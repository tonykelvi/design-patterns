package org.tk.domain.admin;

public class PapelAnonimos extends Usuarios{

    public PapelAnonimos(){
        papeis = Papeis.Anonimos;
    }

    @Override
    public void criarUsuario() {
        System.out.println("Usuario Anônimo");
    }
}
