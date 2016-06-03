package fr.adaming.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IClientRepositoryDao;
import fr.adaming.entity.Client;

@Service			//Service ou component pour considerer la classe comme un bean et pouvoir utiliser un autowired
public class ClientMetierImpl implements IClientMetier {
	
	@Autowired
	private IClientRepositoryDao clientRepository;

	@Override
	public Client saveClient(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClients() {
		return clientRepository.findAll();
	}

}
