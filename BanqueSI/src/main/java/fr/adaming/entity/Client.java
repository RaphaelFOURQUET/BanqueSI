package fr.adaming.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int codeClient;
	
	private String nom;
	
	@OneToMany(mappedBy="proprietaire", fetch=FetchType.LAZY)
	private List<Compte> comptes;
	
	//ACCESSEURS
	public int getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(int codeClient) {
		this.codeClient = codeClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	//CONSTRUCTEURS
	public Client() {
		
	}
	
	public Client(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		String myComptes = "["; //for each ajouter nom au lieu de tout
		for(Compte p : comptes) {
			myComptes += p.getNumCompte()+", ";
		}
		myComptes += "]";
		return "Client [codeClient=" + codeClient + ", nom=" + nom + ", comptes=" + myComptes + "]";
	}
	
	
	
	
}
