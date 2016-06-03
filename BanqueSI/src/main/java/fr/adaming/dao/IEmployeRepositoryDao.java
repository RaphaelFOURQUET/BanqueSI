package fr.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.entity.Employe;

public interface IEmployeRepositoryDao extends JpaRepository<Employe, Long> {

}
