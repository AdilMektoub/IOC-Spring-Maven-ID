package entities;

public class Compte implements ICompte {
	
	private double solde;
	private char devise;

	public double returnSolde() {
		return 30.0;
	}
	
	public char returnDevise() {
		return '€';
	}
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getSolde() {
		return solde;
	}

	public char getDevise() {
		return devise;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void setDevise(char devise) {
		this.devise = devise;
	}

}
