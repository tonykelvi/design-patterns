package org.tk.domain.carros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabaseCarro {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabaseCarro.class);

    @Bean
    CommandLineRunner initDatabaseCarro(CarroRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Carro("Jetta", "KDK-1672")));
            log.info("Preloading " + repository.save(new Carro("Golf", "HSW-5935")));
        };
    }
}