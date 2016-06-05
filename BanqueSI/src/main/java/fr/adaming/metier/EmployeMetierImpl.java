package fr.adaming.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IEmployeRepositoryDao;
import fr.adaming.entity.Employe;

@Service
public class EmployeMetierImpl implements IEmployeMetier {
	
	@Autowired
	private IEmployeRepositoryDao employeRepositoryDao;

	@Override
	public Employe save(Employe e) {
		return employeRepositoryDao.save(e);
	}

	@Override
	public List<Employe> list() {
		return employeRepositoryDao.findAll();
	}

	@Override
	public Employe getById(Long id) {
		return employeRepositoryDao.findOne(id);
	}

}
