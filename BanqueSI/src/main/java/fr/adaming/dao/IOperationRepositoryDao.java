package fr.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.entity.Operation;

public interface IOperationRepositoryDao extends JpaRepository<Operation, Long> {

}
