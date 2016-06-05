package fr.adaming.metier;

import java.util.List;

public interface IGeneriqueMetier<T> {
	
	public T save(T t);
	public T getById(Long id);
	public List<T> list();

}
