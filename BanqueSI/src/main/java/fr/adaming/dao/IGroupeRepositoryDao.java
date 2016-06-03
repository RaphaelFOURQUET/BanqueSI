package fr.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.entity.Groupe;


public interface IGroupeRepositoryDao extends JpaRepository<Groupe, Long>  {

}
