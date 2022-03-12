package javaHomework5.business.concretes;

import javaHomework5.business.abstracts.CustomerService;
import javaHomework5.business.abstracts.SendeMail;
import javaHomework5.dataAccess.abstracts.CustomerDao;
import javaHomework5.dataAccess.concretes.HibernateCustomerDao;
import javaHomework5.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private SendeMail sendeMail;
	
	public CustomerManager(CustomerDao customerDao, SendeMail sendeMail) {
		super();
		this.customerDao = customerDao;
		this.sendeMail= sendeMail;
	}

	@Override
	public void add(Customer customer) {
		if(customer.getPassword().length()<=5) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr");
			return;
		}else if(customer.getName().length()<=1 || customer.getSurname().length()<=1) {
			System.out.println("Ad ve soyad 2 karakterden kýsa olamaz");
			return;
		}
		else
		this.customerDao.add(customer);
		this.sendeMail.send(customer);
		
	}

}
