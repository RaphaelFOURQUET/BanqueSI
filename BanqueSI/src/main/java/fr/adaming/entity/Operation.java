package fr.adaming.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)		//Une table par classe
public abstract class Operation implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private int numOperation;
	
	private Date dateOperation;
	
	private Double montant;
	
	@ManyToOne
	@JoinColumn(name="codeCompte")
	private Compte compte;
	
	@ManyToOne
	@JoinColumn(name="comeEmploye")
	private Employe employe;

	//ACCESSEURS
	public int getNumOperation() {
		return numOperation;
	}

	public void setNumOperation(int numOperation) {
		this.numOperation = numOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	//CONSTRUCTEURS
	public Operation() {
		this.dateOperation = new Date();
	}
	
	public Operation(Double montant) {
		super();
		this.dateOperation = new Date();
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Operation [numOperation=" + numOperation + ", dateOperation=" + dateOperation + ", montant=" + montant
				+ "]";
	}
	
	
	
	

}
