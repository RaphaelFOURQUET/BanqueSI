package fr.adaming.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")			//TypeCompte=CC
public class CompteCourant extends Compte {	
	
	private static final long serialVersionUID = 1L;
	
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
		return "CompteCourante [numCompte=" + getIdCompte() + ", solde=" + getSolde() + ", dateCreation=" + getDateCreation()
				+ ", proprietaire=" + getProprietaire().getNomClient() +", decouvert=" + decouvert + "]";
	}

}
