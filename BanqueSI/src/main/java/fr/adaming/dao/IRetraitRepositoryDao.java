package fr.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.entity.Retrait;

public interface IRetraitRepositoryDao extends JpaRepository<Retrait, Long> {

}
