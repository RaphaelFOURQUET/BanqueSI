package fr.adaming.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")			//TypeCompte=CE
public class CompteEpargne extends Compte {

	private static final long serialVersionUID = 1L;
	
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
		return "CompteEpargne [numCompte=" + getIdCompte() + ", solde=" + getSolde() + ", dateCreation=" + getDateCreation()
				+ ", proprietaire=" + getProprietaire().getNomClient() +", tauxInteret=" + tauxInteret + "]";
	}

	
}
