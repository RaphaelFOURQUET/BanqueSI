package fr.adaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.adaming.entity.Client;

@SpringBootApplication
public class BanqueSiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanqueSiApplication.class, args);
		
		//https://www.youtube.com/watch?v=bmonVh9Bmtg pour un cours pas à pas.
		Client c = new Client();
	}
}
