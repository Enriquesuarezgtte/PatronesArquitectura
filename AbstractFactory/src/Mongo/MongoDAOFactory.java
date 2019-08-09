package Mongo;

import Account.AccountDAO;
import Customer.CustomerDAO;
import FACTORia.DAOFactory;
import Order.OrderDAO;

public class MongoDAOFactory extends DAOFactory {

	@Override
	public CustomerDAO getCustomerDAO() {
		// TODO Auto-generated method stub
		return new MongoCustomerDAO();
	}

	@Override
	public AccountDAO getAccountDAO() {
		// TODO Auto-generated method stub
		return new MongoAccountDAO();
	}

	@Override
	public OrderDAO getOrderDAO() {
		// TODO Auto-generated method stub
		return new MongoOrderDAO();
	}

}
