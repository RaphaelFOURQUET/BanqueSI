package fr.adaming.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IOperationRepositoryDao;
import fr.adaming.entity.Operation;
import fr.adaming.exception.ForbiddenOperationException;

@Service
public class OperationMetierImpl implements IOperationMetier {
	
	@Autowired
	private IOperationRepositoryDao operationRepositoryDao;

	@Override
	public Operation save(Operation o) throws ForbiddenOperationException {
		throw new ForbiddenOperationException("Forbidden Access : You're supposed to access Operation via Retrait(/retraits) or Versement(/versements), or by HTTP.GET on /operations only.");
//		return operationRepositoryDao.save(o);
	}

	@Override
	public Operation getById(Long id) throws ForbiddenOperationException {
		throw new ForbiddenOperationException("Forbidden Access : You're supposed to access Operation via Retrait(/retraits) or Versement(/versements), or by HTTP.GET on /operations only.");
		//return operationRepositoryDao.findOne(id);
	}

	@Override
	public List<Operation> list() {
		return operationRepositoryDao.findAll();
	}

}
