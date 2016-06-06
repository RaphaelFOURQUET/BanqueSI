package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.entity.Versement;
import fr.adaming.exception.ForbiddenOperationException;
import fr.adaming.metier.IVersementMetier;

@RestController
public class VersementRestService {
	
	@Autowired
	private IVersementMetier versementMetier;
	
	@RequestMapping(value="/versements",method=RequestMethod.POST)
	public Versement save(@RequestBody Versement v) throws ForbiddenOperationException {
		return versementMetier.save(v);
	}

	@RequestMapping(value="/versements/{idOperation}",method=RequestMethod.GET)
	public Versement getById(@PathVariable("idOperation") Long id) throws ForbiddenOperationException {
		return versementMetier.getById(id);
	}

	@RequestMapping(value="/versements",method=RequestMethod.GET)
	public List<Versement> list() {
		return versementMetier.list();
	}

}
