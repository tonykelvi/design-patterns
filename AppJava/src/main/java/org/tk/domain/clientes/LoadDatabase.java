package org.tk.domain.clientes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ClienteRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Cliente("Mariana", "51998765431")));
            log.info("Preloading " + repository.save(new Cliente("Luis", "41998365722")));
        };
    }
}