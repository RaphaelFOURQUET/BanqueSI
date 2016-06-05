package fr.adaming.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IOperationRepositoryDao;
import fr.adaming.entity.Operation;

@Service
public class OperationMetierImpl implements IOperationMetier {
	
	@Autowired
	private IOperationRepositoryDao operationRepositoryDao;

	@Override
	public Operation save(Operation o) {
		return operationRepositoryDao.save(o);
	}

	@Override
	public Operation getById(Long id) {
		return operationRepositoryDao.findOne(id);
	}

	@Override
	public List<Operation> list() {
		return operationRepositoryDao.findAll();
	}

}
