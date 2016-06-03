package fr.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.entity.Compte;

public interface ICompteRepositoryDao extends JpaRepository<Compte, Long> {

}
