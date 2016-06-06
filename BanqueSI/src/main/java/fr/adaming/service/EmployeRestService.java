package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.entity.Employe;
import fr.adaming.exception.ForbiddenOperationException;
import fr.adaming.metier.IEmployeMetier;

//Service RestFull
@RestController		//Controleur en mode REST
public class EmployeRestService {
	
	@Autowired	//injection dependances
	private IEmployeMetier employeMetier;

	@RequestMapping(value="/employes/{idEmploye}",method=RequestMethod.GET)
	public Employe getById(@PathVariable("idEmploye") Long idEmploye) throws ForbiddenOperationException {
		return employeMetier.getById(idEmploye);
	}

	@RequestMapping(value="/employes",method=RequestMethod.POST)
	public Employe save(@RequestBody Employe t) throws ForbiddenOperationException {
		return employeMetier.save(t);
	}

	@RequestMapping(value="/employes",method=RequestMethod.GET)
	public List<Employe> list() {
		return employeMetier.list();
	}

}
