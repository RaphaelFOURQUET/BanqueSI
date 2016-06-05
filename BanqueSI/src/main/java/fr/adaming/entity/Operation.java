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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)		//Une table par classe
public abstract class Operation implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private Long idOperation;
	
	private Date dateOperation;
	
	private Double montant;
	
	@ManyToOne
	@JoinColumn(name="codeCompte")
	private Compte compte;
	
	@ManyToOne
	@JoinColumn(name="codeEmploye")
	private Employe employe;

	//ACCESSEURS
	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
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

	@JsonIgnore
	public Compte getCompte() {
		return compte;
	}

	@JsonSetter
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@JsonIgnore
	public Employe getEmploye() {
		return employe;
	}

	@JsonSetter
	public void setEmploye(Employe employe) {
		this.employe = employe;
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
		return "Operation [idOperation=" + idOperation + ", dateOperation=" + dateOperation + ", montant=" + montant
				+ "]";
	}
	
	
	
	

}
