package org.tk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tk.domain.admin.CacheDePrototipos;
import org.tk.domain.admin.Usuarios;

@SpringBootApplication
public class AppJava {
    public static void main(String[] args) {
        SpringApplication.run(AppJava.class, args);
        System.out.println("Está executando");

        CacheDePrototipos.criar();

        Usuarios PapelAdministradorClonada = CacheDePrototipos.getUsuarioClonado(Usuarios.Papeis.Administradores);
        System.out.println(PapelAdministradorClonada);

        Usuarios PapelRegistradoClonada = CacheDePrototipos.getUsuarioClonado(Usuarios.Papeis.Registrados);
        System.out.println(PapelRegistradoClonada);
    }
}