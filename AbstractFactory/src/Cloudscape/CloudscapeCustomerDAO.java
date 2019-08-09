package Cloudscape;

import java.util.ArrayList;
import java.util.Iterator;

import javax.sql.RowSet;

import Customer.Customer;
import Customer.CustomerDAO;

public class CloudscapeCustomerDAO implements CustomerDAO {
	Customer cs;
	ArrayList<Customer> cus;

	public CloudscapeCustomerDAO() {
		// initialization
		cus = new ArrayList<Customer>();
	}

	// The following methods can use
	// CloudscapeDAOFactory.createConnection()
	// to get a connection as required

	@Override
	public int insertCustomer(int id) {
		// TODO Auto-generated method stub
		cus.add(new Customer(id));
		return id;
	}

	@Override
	public boolean deleteCustomer(int id) {
		for (int i = 0; i < cus.size(); i++) {
			if (cus.get(i).getCustomerNUmber() == id) {
				System.out.println(id + " " + cus.size());
				cus.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public Customer findCustomer(int id) {
		// TODO Auto-generated method stub
		for (Iterator iterator = cus.iterator(); iterator.hasNext();) {
			Customer customer = (Customer) iterator.next();
			if (customer.getCustomerNUmber() == id) {
				return customer;
			}

		}
		return null;
	}

	@Override
	public boolean updateCustomer(int id, String name) {
		for (int i = 0; i < cus.size(); i++) {
			if (cus.get(i).getCustomerNUmber() == id) {
				cus.get(i).setName(name);
				return true;
			}
		}
		return false;

	}

	@Override
	public RowSet selectCustomerRs(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}
}