package javaHomework5.business.concretes;

import javaHomework5.business.abstracts.LoginService;
import javaHomework5.dataAccess.abstracts.Login;
import javaHomework5.entities.concretes.Customer;

public class LoginServiceManager implements LoginService {
	
	private Login loginManager;
	
	public LoginServiceManager(Login loginManager) {
		super();
		this.loginManager = loginManager;
	}
	
	public void login(Customer customer) {
		if(customer.geteMail().isEmpty()) {
			System.out.println("E-posta alan� bo� b�rak�lamaz");
			return;
		}else if (customer.getPassword().isEmpty()) {
			System.out.println("Parola alan� bo� b�rak�lamaz");
			return;
		}else
			loginManager.login(customer);
		
	}
	
}
