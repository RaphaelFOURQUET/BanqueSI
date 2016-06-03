package fr.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.entity.Client;

public interface IClientRepositoryDao extends JpaRepository<Client, Long> {	//Pour utiliser Spring Data qui injecte seul les implementations de gestion entites
	

}
