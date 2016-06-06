package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.entity.Groupe;
import fr.adaming.exception.ForbiddenOperationException;
import fr.adaming.metier.IGroupeMetier;

@RestController	
public class GroupeRestService {
	
	@Autowired
	private IGroupeMetier groupeMetier;

	@RequestMapping(value="/groupes", method=RequestMethod.POST)
	public Groupe save(@RequestBody Groupe t) throws ForbiddenOperationException {
		return groupeMetier.save(t);
	}

	@RequestMapping(value="/groupes/{idGroupe}", method=RequestMethod.GET)
	public Groupe getById(@PathVariable("idGroupe") Long id) throws ForbiddenOperationException {
		return groupeMetier.getById(id);
	}

	@RequestMapping(value="/groupes", method=RequestMethod.GET)
	public List<Groupe> list() {
		return groupeMetier.list();
	}

}
