package presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import entities.IUtilisateur;
import metier.IMetier;

public class PresentationAvecSpring {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext(
		new String[] {"spring-ioc.xml"});
	
		IUtilisateur util = 
		(IUtilisateur) context.getBean("utilisateur");
		util.afficherSolde('$');

	}
}


//IMetier metier = (IMetier) context.getBean("metier");
//System.out.println(metier.calcul());