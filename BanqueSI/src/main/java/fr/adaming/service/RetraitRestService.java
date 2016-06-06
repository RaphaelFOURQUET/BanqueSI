package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.entity.Retrait;
import fr.adaming.exception.ForbiddenOperationException;
import fr.adaming.metier.IRetraitMetier;

@RestController
public class RetraitRestService {
	
	@Autowired
	private IRetraitMetier retraitMetier;

	@RequestMapping(value="/retraits",method=RequestMethod.POST)
	public Retrait save(@RequestBody Retrait t) throws ForbiddenOperationException {
		return retraitMetier.save(t);
	}

	@RequestMapping(value="/retraits/{idOperation}",method=RequestMethod.GET)
	public Retrait getById(@PathVariable("idOperation") Long id) throws ForbiddenOperationException {
		return retraitMetier.getById(id);
	}

	@RequestMapping(value="/retraits",method=RequestMethod.GET)
	public List<Retrait> list() {
		return retraitMetier.list();
	}

}
