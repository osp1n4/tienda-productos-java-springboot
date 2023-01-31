package com.sofkau.qa.tiendaproductos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TiendaProductosApplication {

	public static void main(String[] args) {

		SpringApplication.run(TiendaProductosApplication.class, args);
	}
	@Bean
	public CommandLineRunner cambiarEstenombre(){

		return args -> {
			System.out.println("Hola desde la consola sprinboot");
		};
	}

}
