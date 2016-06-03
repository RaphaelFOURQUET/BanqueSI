package fr.adaming.entity;

import javax.persistence.Entity;

@Entity
public class CompteEpargne extends Compte {
	
	private double tauxInteret;

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	
	public CompteEpargne() {
		super();
	}

	@Override
	public String toString() {
		return "CompteEpargne [numCompte=" + getNumCompte() + ", solde=" + getSolde() + ", dateCreation=" + getDateCreation()
				+ ", proprietaire=" + getProprietaire().getNom() +", tauxInteret=" + tauxInteret + "]";
	}

	
}
