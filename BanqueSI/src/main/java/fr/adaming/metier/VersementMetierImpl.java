package fr.adaming.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IVersementRepositoryDao;
import fr.adaming.entity.Versement;

@Service
public class VersementMetierImpl implements IVersementMetier {
	
	@Autowired
	private IVersementRepositoryDao versementRepositoryDao;

	@Override
	public Versement save(Versement v) {
		return versementRepositoryDao.save(v);
	}

	@Override
	public Versement getById(Long id) {
		return versementRepositoryDao.findOne(id);
	}

	@Override
	public List<Versement> list() {
		return versementRepositoryDao.findAll();
	}

}
