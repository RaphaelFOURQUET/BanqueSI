package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.entity.Operation;
import fr.adaming.exception.ForbiddenOperationException;
import fr.adaming.metier.IOperationMetier;

@RestController
public class OperationRestService {
	
	@Autowired	//injection dependances
	private IOperationMetier operationMetier;

	/* Etant donne la representation choisie d'operation en base, on ne peut sauver ou retouver directement une operation, mais plutot un retrait ou un versement
	 * Et même la requete réalisable sur operation : list sera incohérente car retournera des operations differentes (retrait ou versement) avec id identique 
	 * sans possibilite de faire la difference. Je la laisse quand même comme ca pour bien voir al difference entre els deux solutions. */
	
	@RequestMapping(value="/operations",method=RequestMethod.POST)
	public Operation save(@RequestBody Operation o) throws ForbiddenOperationException {
		return operationMetier.save(o);
	}

	@RequestMapping(value="/operations/{idOperation}",method=RequestMethod.GET)
	public Operation getById(@PathVariable("idOperation") Long idOperation) throws ForbiddenOperationException {
		return operationMetier.getById(idOperation);
	}

	@RequestMapping(value="/operations",method=RequestMethod.GET)
	public List<Operation> list() {
		return operationMetier.list();
	}

}
