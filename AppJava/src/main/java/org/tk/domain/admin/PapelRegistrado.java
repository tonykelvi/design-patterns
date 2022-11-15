package org.tk.domain.admin;

public class PapelRegistrado extends Usuarios{

    public PapelRegistrado(){
        papeis = Papeis.Registrados;
    }

    @Override
    public void criarUsuario() {
        System.out.println("Usuario Registrado");
    }
}
