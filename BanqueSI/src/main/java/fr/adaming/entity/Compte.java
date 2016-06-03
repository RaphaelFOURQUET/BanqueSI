package fr.adaming.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public abstract class Compte {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int numCompte;
	
	private double solde;
	
	private Date dateCreation;
	
	@OneToOne
	private Client proprietaire;
	
	//ACCESSEURS
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public Client getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	
	
	//CONSTRUCTEURS
	public Compte() {
		
	}

	public Compte(double solde) {
		super();
		this.solde = solde;
		this.dateCreation = new Date();
	}

	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", solde=" + solde + ", dateCreation=" + dateCreation
				+ ", proprietaire=" + proprietaire.getNom() + "]";
	}
	
	
	

}
