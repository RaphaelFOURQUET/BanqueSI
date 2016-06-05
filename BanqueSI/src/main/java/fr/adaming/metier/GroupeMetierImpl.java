package fr.adaming.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IGroupeRepositoryDao;
import fr.adaming.entity.Groupe;

@Service
public class GroupeMetierImpl implements IGroupeMetier {
	
	@Autowired
	private IGroupeRepositoryDao groupeRepositoryDao;

	@Override
	public Groupe save(Groupe g) {
		return groupeRepositoryDao.save(g);
	}

	@Override
	public Groupe getById(Long id) {
		return groupeRepositoryDao.findOne(id);
	}

	@Override
	public List<Groupe> list() {
		return groupeRepositoryDao.findAll();
	}

}
