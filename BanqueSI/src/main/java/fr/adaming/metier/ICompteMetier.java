package fr.adaming.metier;

import fr.adaming.entity.Compte;

public interface ICompteMetier extends IGeneriqueMetier<Compte> {
	
	public Compte getCompte(Long idCompte);

}
