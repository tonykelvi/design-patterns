package org.tk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tk.domain.CacheDePrototipos;
import org.tk.domain.Carro;
import org.tk.domain.Carro.Modelo;

import java.util.ArrayList;
import java.util.List;

// http://localhost:8080/carros

@SpringBootApplication
public class AppJava {
    public static void main(String[] args) {
        SpringApplication.run(AppJava.class, args);
        System.out.println("Está executando");

        CacheDePrototipos.criar();

        Carro CarroSedanClonada = CacheDePrototipos.getCarroClonado(Modelo.Sedan);
        System.out.println(CarroSedanClonada);

        Carro CarroHatchClonada = CacheDePrototipos.getCarroClonado(Modelo.Hatch);
        System.out.println(CarroHatchClonada);

        Carro CarroSUVClonada = CacheDePrototipos.getCarroClonado(Modelo.SUV);
        System.out.println(CarroSUVClonada);
    }
}
