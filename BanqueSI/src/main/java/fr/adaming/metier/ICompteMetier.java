package fr.adaming.metier;

import fr.adaming.entity.Compte;

public interface ICompteMetier {
	
	public Compte saveCompte(Compte compte);
	public Compte getCompte(Long idCompte);

}
