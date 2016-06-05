package fr.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.entity.Versement;

public interface IVersementRepositoryDao extends JpaRepository<Versement, Long> {

}
