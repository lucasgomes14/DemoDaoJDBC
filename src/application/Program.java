package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000., obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao(); // faz que o programa não conhece a implementação, e sim apenas a interface
		
		System.out.println(seller);
	}

}
