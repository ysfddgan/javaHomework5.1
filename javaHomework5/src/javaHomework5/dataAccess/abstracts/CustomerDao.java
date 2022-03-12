package javaHomework5.dataAccess.abstracts;

import javaHomework5.entities.concretes.Customer;

public interface CustomerDao {
	public void add(Customer customer);
	public void delete(Customer customer);
	public void update(Customer customer);
}
