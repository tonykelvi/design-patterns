package org.tk.domain.admin;

public class PapelAdministrador extends Usuarios{

    public PapelAdministrador(){papeis = Papeis.Administradores;}

    @Override
    public void criarUsuario() {
        System.out.println("Usuario Administrador");
    }
}
