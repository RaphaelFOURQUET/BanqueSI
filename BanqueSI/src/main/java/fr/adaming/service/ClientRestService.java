package fr.adaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.metier.IClientMetier;

@RestController		//Controleur en mode REST
public class ClientRestService {
	
	@Autowired	//injection dependances
	private IClientMetier clientMetier;
	
}
