package Amazon;

import javax.sql.RowSet;

import Customer.Customer;
import Customer.CustomerDAO;

public class AmazonCustomerDAO implements CustomerDAO {

	@Override
	public int insertCustomer(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer findCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCustomer(int id, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RowSet selectCustomerRs(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}

}
