package Amazon;

import Account.AccountDAO;
import Customer.CustomerDAO;
import FACTORia.DAOFactory;
import Order.OrderDAO;

public class AmazonDAOFactory extends DAOFactory {

	@Override
	public CustomerDAO getCustomerDAO() {
		// TODO Auto-generated method stub
		return new AmazonCustomerDAO();
	}

	@Override
	public AccountDAO getAccountDAO() {
		// TODO Auto-generated method stub
		return new AmazonAccountDAO();
	}

	@Override
	public OrderDAO getOrderDAO() {
		// TODO Auto-generated method stub
		return new AmazonOrderDAO();
	}

}
