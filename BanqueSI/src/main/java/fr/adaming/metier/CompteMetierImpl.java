package fr.adaming.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.ICompteRepositoryDao;
import fr.adaming.entity.Compte;

@Service
public class CompteMetierImpl implements ICompteMetier {
	
	@Autowired
	private ICompteRepositoryDao compteRepositoryDao;

	@Override
	public Compte saveCompte(Compte compte) {
		//compte.setDateCreation(new Date());
		return compteRepositoryDao.save(compte);
	}

	@Override
	public Compte getCompte(Long idCompte) {
		return compteRepositoryDao.findOne(idCompte);
	}

}
