package fr.adaming.metier;

import fr.adaming.entity.Operation;
import fr.adaming.exception.ForbiddenOperationException;

public interface IOperationMetier extends IGeneriqueMetier<Operation> {
	
	@Override
	public Operation save(Operation o)  throws ForbiddenOperationException;

}
