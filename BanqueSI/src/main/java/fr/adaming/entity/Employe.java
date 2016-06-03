package fr.adaming.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employe implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int codeEmploye;

	private String nom;
	
	@ManyToOne
	@JoinColumn(name="superieur")
	private Employe superieurHierarchique;
	
	@ManyToMany
	@JoinTable(name="employe_groupe")
	private List<Groupe> groupes;

	//ACCESSEURS
	public int getCodeEmploye() {
		return codeEmploye;
	}

	public void setCodeEmploye(int codeEmploye) {
		this.codeEmploye = codeEmploye;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Employe getSuperieurHierarchique() {
		return superieurHierarchique;
	}

	public void setSuperieurHierarchique(Employe superieurHierarchique) {
		this.superieurHierarchique = superieurHierarchique;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}
	
	//CONSTRUCTEURS
	public Employe() {
		
	}

	@Override
	public String toString() {
		String myGroupes = "["; //for each ajouter nom au lieu de tout
		for(Groupe g : groupes) {
			myGroupes += g.getNom()+", ";
		}
		return "Employe [codeEmploye=" + codeEmploye + ", nom=" + nom + ", superieurHierarchique="
				+ superieurHierarchique.getNom() + ", groupes=" + myGroupes + "]";
	}
	
	
	
}
