package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.entity.Client;
import fr.adaming.metier.IClientMetier;

//Service RestFull
@RestController		//Controleur en mode REST
public class ClientRestService {
	
	@Autowired	//injection dependances
	private IClientMetier clientMetier;

	@RequestMapping(value="/clients/{idCompte}",method=RequestMethod.GET)
	public Client getById(@PathVariable("idCompte")Long idCompte) {
		return clientMetier.getById(idCompte);
	}

	@RequestMapping(value="/clients",method=RequestMethod.POST)	//Selon REST : clients pour mapper et post pour save Get pour recuperer
	//@ResponseBody		//retour au format JSON, implicite si RestController sur classe
	public Client save(@RequestBody Client c) {	//Recupere les donnes au format JSON
		return clientMetier.save(c);
	}

	@RequestMapping(value="/clients",method=RequestMethod.GET)	//Selon REST : clients pour mapper et post pour save Get pour recuperer
	public List<Client> list() {
		return clientMetier.list();
	}
	
	
	
}
