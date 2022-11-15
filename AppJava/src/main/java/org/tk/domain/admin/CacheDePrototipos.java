package org.tk.domain.admin;

import java.util.Hashtable;
import org.tk.domain.admin.Usuarios.*;

public class CacheDePrototipos {
    private static Hashtable<Usuarios.Papeis, Usuarios> usuarios = new Hashtable<Usuarios.Papeis, Usuarios>();

    public static Usuarios getUsuarioClonado(Papeis papeis){
        Usuarios retorna = usuarios.get(papeis);
        return (Usuarios) retorna.clone();
    }

    public static void criar(){

        Usuarios PapelAdministrador = new PapelAdministrador();
        PapelAdministrador.setId(1);
        PapelAdministrador.setPapeis(Papeis.Administradores);
        PapelAdministrador.setPrivilegios(Privilegios.Geral);
        PapelAdministrador.setLoguin(Loguin.Admin);
        usuarios.put(PapelAdministrador.getPapeis(), PapelAdministrador);
        PapelAdministrador.criarUsuario();

        Usuarios PapelRegistrado = new PapelRegistrado();
        PapelRegistrado.setId(2);
        PapelRegistrado.setPapeis(Papeis.Registrados);
        PapelRegistrado.setPrivilegios(Privilegios.Editor);
        PapelRegistrado.setLoguin(Loguin.Users);
        usuarios.put(PapelRegistrado.getPapeis(), PapelRegistrado);
        PapelRegistrado.criarUsuario();
    }
}
