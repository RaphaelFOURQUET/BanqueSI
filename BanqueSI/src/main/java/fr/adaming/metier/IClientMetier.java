package fr.adaming.metier;

import java.util.List;

import fr.adaming.entity.Client;

public interface IClientMetier {
	
	public Client saveClient(Client c);
	public List<Client> listClients();

}
