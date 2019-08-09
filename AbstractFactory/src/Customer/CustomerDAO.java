package Customer;

import javax.sql.RowSet;

public interface CustomerDAO {
	public int insertCustomer(int id);

	public boolean deleteCustomer(int id);

	public Customer findCustomer(int id);

	public boolean updateCustomer(int id, String name);

	public RowSet selectCustomerRs(Customer criteria);
}
