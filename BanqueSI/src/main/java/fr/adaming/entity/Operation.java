package fr.adaming.entity;

import java.util.Date;

public abstract class Operation {
	
	private int numOperation;
	
	private Date dateOperation;
	
	private Double montant;

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
