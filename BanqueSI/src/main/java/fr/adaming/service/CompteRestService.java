package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.entity.Compte;
import fr.adaming.metier.ICompteMetier;

@RestController
public class CompteRestService {
	
	@Autowired	//injection dependances
	private ICompteMetier compteMetier;

	@RequestMapping(value="/comptes",method=RequestMethod.POST)
	public Compte save(@RequestBody Compte compte) {
		return compteMetier.save(compte);
	}

	@RequestMapping(value="/comptes",method=RequestMethod.GET)
	public List<Compte> list() {
		return compteMetier.list();
	}
	
	@RequestMapping(value="/comptes/{idCompte}",method=RequestMethod.GET)
	public Compte getById(@PathVariable("idCompte") Long idCompte) {
		return compteMetier.getById(idCompte);
	}
	
	


}
