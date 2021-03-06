package javaHomework5.dataAccess.concretes;

import javaHomework5.dataAccess.abstracts.CustomerDao;
import javaHomework5.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getName()+" "+customer.getSurname()+ " kullanıcısı eklendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getName()+" "+customer.getSurname()+ " kullanıcısı silindi.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getName()+" "+customer.getSurname()+ " kullanıcısı güncellendi.");
		
	}

}
