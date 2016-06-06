package fr.adaming.metier;

import java.util.List;

import fr.adaming.exception.ForbiddenOperationException;

public interface IGeneriqueMetier<T> {
	
	public T save(T t) throws ForbiddenOperationException;
	public T getById(Long id) throws ForbiddenOperationException;
	public List<T> list();

}
