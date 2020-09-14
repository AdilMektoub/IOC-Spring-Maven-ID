package entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Utilisateur implements IUtilisateur{

	private String nom;
	private String age;
	
	private Compte compte;

	public Utilisateur() {
		compte = new Compte();
	}

	public void afficherSolde(char c) {

		if ( c == compte.returnDevise())
			System.out.println("le solde est : "+ compte.returnSolde()+ " "+ c);

		else {
			if (compte.returnDevise() == '$' && c == '€') 
				System.out.println("le solde est : "+ compte.returnSolde() * 0.9 + " €");
			else if ( compte.returnDevise() == '€' && c == '$' )
				System.out.println("le solde est : "+ compte.returnSolde() * 1.1 + " $");	
			else	System.out.println("la devise est mauvaise");
		}			
	}

	public String getNom() {
		return nom;
	}

	public String getAge() {
		return age;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}



}
