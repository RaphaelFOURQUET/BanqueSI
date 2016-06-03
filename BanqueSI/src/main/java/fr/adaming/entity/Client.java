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
	private Long idClient;
	
	private String nomClient;
	
	@OneToMany(mappedBy="proprietaire", fetch=FetchType.LAZY)
	private List<Compte> comptes;
	
	//ACCESSEURS
	public Long getCodeClient() {
		return idClient;
	}

	public void setCodeClient(Long codeClient) {
		this.idClient = codeClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nom) {
		this.nomClient = nom;
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
		this.nomClient = nom;
	}

	@Override
	public String toString() {
		String myComptes = "["; //for each ajouter nomClient au lieu de tout
		for(Compte p : comptes) {
			myComptes += p.getIdCompte()+", ";
		}
		myComptes += "]";
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", comptes=" + myComptes + "]";
	}
	
	
	
	
}
