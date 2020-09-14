package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dao.DaoImpl;
import dao.DaoImpl2;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class Presentation {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
	
		Scanner sc = new Scanner(new File("config.txt"));
		String daoClassName = sc.next();
		String metierClassName = sc.next();
		System.out.println(daoClassName);
		System.out.println(metierClassName);
		
		Class cdao = Class.forName(daoClassName);
		IDao dao = (IDao) cdao.newInstance();

		Class cmetier = Class.forName(metierClassName);
		IMetier metier = (IMetier) cmetier.newInstance();
		System.out.println(metier.calcul());

	}
}















//DaoImpl dao = new DaoImpl();
//MetierImpl metier = new MetierImpl();
//metier.setDao(dao);
//System.out.println(metier.calcul());










//DaoImpl dao = new DaoImpl();
//MetierImpl metier = new MetierImpl();
//metier.setDao(dao);
//System.out.println(metier.calcul());










