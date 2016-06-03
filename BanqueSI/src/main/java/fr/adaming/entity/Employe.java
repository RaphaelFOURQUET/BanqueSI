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
	private Long idEmploye;

	private String nomEmploye;
	
	@ManyToOne
	@JoinColumn(name="superieur")
	private Employe superieurHierarchique;
	
	@ManyToMany
	@JoinTable(name="employe_groupe")
	private List<Groupe> groupes;

	//ACCESSEURS
	public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long codeEmploye) {
		this.idEmploye = codeEmploye;
	}

	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
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
		String myGroupes = "["; //for each ajouter nomEmploye au lieu de tout
		for(Groupe g : groupes) {
			myGroupes += g.getNomGroupe()+", ";
		}
		return "Employe [idEmploye=" + idEmploye + ", nomEmploye=" + nomEmploye + ", superieurHierarchique="
				+ superieurHierarchique.getNomEmploye() + ", groupes=" + myGroupes + "]";
	}
	
	
	
}
