package javaHomework5.business.concretes;

import javaHomework5.business.abstracts.SendeMail;
import javaHomework5.entities.concretes.Customer;

public class SendeMailManager implements SendeMail{

	@Override
	public void send(Customer customer) {
		System.out.println(customer.geteMail()+" adresine mail gönderildi.");
		
	}
	
}
