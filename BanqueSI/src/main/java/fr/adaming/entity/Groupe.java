package fr.adaming.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Groupe {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int numGroupe;
	
	private String nom;

	//ACCESSEURS
	public int getNumGroupe() {
		return numGroupe;
	}

	public void setNumGroupe(int numGroupe) {
		this.numGroupe = numGroupe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	//CONSTRUCTEURS
	public Groupe() {
		
	}
	
	public Groupe(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Groupe [numGroupe=" + numGroupe + ", nom=" + nom + "]";
	}
	
	

}
