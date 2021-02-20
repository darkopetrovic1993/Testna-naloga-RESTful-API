package com.example.restservice;

//Simple Logging Facade for Java (SLF4J) - a logging abstraction which helps to decouple your application from the
//underlying logger by allowing it to be plugged in -at runtime
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class RelationalDataAccessApplication implements CommandLineRunner {

    // LocalDateTime.now()
    // Mogoče: PostgreSQL JDBC connection string --->  jdbc:postgresql://localhost:5432/datum
    // http://localhost:8080/postgres?datum=28-02-2021
    @GetMapping("/postgres")
    public Datum datum(@RequestParam(value = "datum") String name) {return new Datum(String.format(name));
    }

    //Simple Logging Facade for Java (SLF4J)
    private static final Logger log = LoggerFactory.getLogger(RelationalDataAccessApplication.class);

    //Začetek aplikacije
    public static void main(String args[]) {
        SpringApplication.run(RelationalDataAccessApplication.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings){

        // Vstavimo spremenljivko "Datum" v našo bazo podatkov
/*        log.info("Creating tables");
//        jdbcTemplate.execute("CREATE DATABASE baza_datumov;");
        jdbcTemplate.batchUpdate("CREATE TABLE tabela_datumov (" +
              "created_on TIMESTAMP NOT NULL;");
        jdbcTemplate.batchUpdate("INSERT INTO tabela_datumov (" +
              "created_on new Datum(String.format(name));");*/
    }
}
