import java.util.Collection;

import Customer.Customer;
import Customer.CustomerDAO;
import FACTORia.DAOFactory;

public class Client {

	public static void main(String[] args) {
		DAOFactory cloudscapeFactory = DAOFactory.getDaoFactory(DAOFactory.CLOUDSCAPE);

		// Create a DAO
		CustomerDAO custDAO = cloudscapeFactory.getCustomerDAO();

		// create a new customer
		int newCustNo = custDAO.insertCustomer(506161049);

		// Find a customer object. Get the Transfer Object.
		Customer cust = custDAO.findCustomer(newCustNo);

		// modify the values in the Transfer Object.
		cust.setStreetAddress("Villas");
		cust.setEmail("enriqued.suarezg@konradlorenz.edu.co");
		// update the customer object using the DAO
		custDAO.updateCustomer(newCustNo, "Enrique");

		// delete a customer object
		custDAO.deleteCustomer(newCustNo);
		// select all customers in the same city
		Customer criteria = new Customer();
		criteria.setCity("New York");
		Collection customersList = (Collection) custDAO.selectCustomerRs(criteria);
		// returns customersList - collection of Customer
		// Transfer Objects. iterate through this collection to
		// get values.
	}
}
