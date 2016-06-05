package fr.adaming.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IRetraitRepositoryDao;
import fr.adaming.entity.Retrait;

@Service
public class RetraitMetierImpl implements IRetraitMetier {
	
	@Autowired
	private IRetraitRepositoryDao retraitRepositoryDao;

	@Override
	public Retrait save(Retrait r) {
		return retraitRepositoryDao.save(r);
	}

	@Override
	public Retrait getById(Long id) {
		return retraitRepositoryDao.findOne(id);
	}

	@Override
	public List<Retrait> list() {
		return retraitRepositoryDao.findAll();
	}

}
