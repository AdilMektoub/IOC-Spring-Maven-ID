package metier;

import dao.DaoImpl;
import dao.DaoImpl2;
import dao.IDao;

public class MetierImpl implements IMetier {

	private IDao dao;
	
	public MetierImpl() {
//		dao = new DaoImpl();
	}	
	
	public double calcul() {
		double nb = dao.getTemp();
		return nb * 2;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}
}
