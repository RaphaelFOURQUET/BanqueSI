package fr.adaming.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Groupe implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int idGroupe;
	
	private String nomGroupe;
	
	@ManyToMany(mappedBy="groupes")
	private Collection<Employe> employes;

	//ACCESSEURS
	public int getNumGroupe() {
		return idGroupe;
	}

	public void setNumGroupe(int numGroupe) {
		this.idGroupe = numGroupe;
	}

	public String getNom() {
		return nomGroupe;
	}

	public void setNom(String nom) {
		this.nomGroupe = nom;
	}

	public Collection<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}

	//CONSTRUCTEURS
	public Groupe() {
		
	}
	
	public Groupe(String nom) {
		super();
		this.nomGroupe = nom;
	}

	@Override
	public String toString() {
		String myEmployes="[";
		for(Employe e : employes) {
			myEmployes+=e.getNom()+", ";
		}
		myEmployes+="]";
		return "Groupe [idGroupe=" + idGroupe + ", nomGroupe=" + nomGroupe + ", employes=" + myEmployes + "]";
	}
	
	

}
