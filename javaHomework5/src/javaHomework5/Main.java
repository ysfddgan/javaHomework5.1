package javaHomework5;

import javaHomework5.business.abstracts.CustomerService;
import javaHomework5.business.abstracts.LoginService;
import javaHomework5.business.abstracts.SendeMail;
import javaHomework5.business.concretes.CustomerManager;
import javaHomework5.business.concretes.LoginServiceManager;
import javaHomework5.business.concretes.SendeMailManager;
import javaHomework5.dataAccess.abstracts.CustomerDao;
import javaHomework5.dataAccess.abstracts.Login;
import javaHomework5.dataAccess.concretes.HibernateCustomerDao;
import javaHomework5.dataAccess.concretes.Loginn;
import javaHomework5.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"Yusuf","Doðan","yusuf.230@hotmail.com","123456");
		CustomerDao customerDao = new HibernateCustomerDao();
		SendeMail sendeMail = new SendeMailManager();
		CustomerService customerManager = new CustomerManager(customerDao, sendeMail);
		customerManager.add(customer);
		
		Login loginnn = new Loginn();
		LoginService loginService = new LoginServiceManager(loginnn);
		loginService.login(customer);
	}

}
