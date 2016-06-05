package fr.adaming.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.ICompteRepositoryDao;
import fr.adaming.entity.Compte;

@Service
public class CompteMetierImpl implements ICompteMetier {
	
	@Autowired
	private ICompteRepositoryDao compteRepositoryDao;

	@Override
	public Compte save(Compte compte) {
		//compte.setDateCreation(new Date());
		return compteRepositoryDao.save(compte);
	}

	@Override
	public List<Compte> list() {
		return compteRepositoryDao.findAll();
	}

	@Override
	public Compte getById(Long id) {
		return compteRepositoryDao.findOne(id);
	}

}
