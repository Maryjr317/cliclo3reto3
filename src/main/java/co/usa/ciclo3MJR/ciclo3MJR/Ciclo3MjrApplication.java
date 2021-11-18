package co.usa.ciclo3MJR.ciclo3MJR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//se anota la clase que tiene el main para que pueda buscar las entidades
@EntityScan(basePackages = {"co.usa.ciclo3MJR.ciclo3MJR.model"})
@SpringBootApplication
public class Ciclo3MjrApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3MjrApplication.class, args);
	}

}
