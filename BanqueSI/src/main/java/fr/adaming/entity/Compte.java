package fr.adaming.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TypeCompte", length=2, discriminatorType=DiscriminatorType.STRING)					//Une table en base pour tous nos comptes.
public abstract class Compte implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCompte;
	
	private double solde;
	
	private Date dateCreation;
	
	@ManyToOne
	@JoinColumn(name="codeClient")
	private Client proprietaire;
	
	@ManyToOne
	@JoinColumn(name="codeEmploye")
	private Employe employe;
	
	@OneToMany(mappedBy="compte")
	private Collection<Operation> operations;
	
	//ACCESSEURS
	public Long getNumCompte() {
		return idCompte;
	}

	public void setNumCompte(Long numCompte) {
		this.idCompte = numCompte;
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
	
	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Collection<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
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
		String myOperations = "[";
		for(Operation o : operations) {
			myOperations += o.getNumOperation()+", ";
		}
		myOperations += "]";
		return "Compte [idCompte=" + idCompte + ", solde=" + solde + ", dateCreation=" + dateCreation
				+ ", proprietaire=" + proprietaire.getNom() + ", employe=" +employe.getNom() + ", operations=" + myOperations + "]";
	}
	
	
	

}
