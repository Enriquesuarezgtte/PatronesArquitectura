package Sybase;

import javax.sql.RowSet;

import Customer.Customer;
import Customer.CustomerDAO;

public class SybaseCustomerDAO implements CustomerDAO {

	@Override
	public int insertCustomer(int id) {
		return 0;
	}

	@Override
	public boolean deleteCustomer(int id) {
		return false;
	}

	@Override
	public Customer findCustomer(int id) {
		return null;
	}

	@Override
	public boolean updateCustomer(int id, String name) {
		return false;
	}

	@Override
	public RowSet selectCustomerRs(Customer cust) {
		return null;
	}

}
