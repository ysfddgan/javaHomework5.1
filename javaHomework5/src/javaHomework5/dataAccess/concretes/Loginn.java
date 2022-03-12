package javaHomework5.dataAccess.concretes;

import javaHomework5.dataAccess.abstracts.Login;
import javaHomework5.entities.concretes.Customer;

public class Loginn implements Login {

	@Override
	public void login(Customer customer) {
		System.out.println("Sisteme giriþ yapýldý.");
		
	}
	
}
