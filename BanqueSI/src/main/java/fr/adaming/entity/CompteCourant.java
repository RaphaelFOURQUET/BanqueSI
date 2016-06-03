package fr.adaming.entity;

import javax.persistence.Entity;

@Entity
public class CompteCourant extends Compte {
	
	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
	}
	
	@Override
	public String toString() {
		return "CompteCourante [numCompte=" + getNumCompte() + ", solde=" + getSolde() + ", dateCreation=" + getDateCreation()
				+ ", proprietaire=" + getProprietaire().getNom() +", decouvert=" + decouvert + "]";
	}

}
