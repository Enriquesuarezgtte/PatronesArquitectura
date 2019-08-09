package Sybase;

import Account.AccountDAO;
import Customer.CustomerDAO;
import FACTORia.DAOFactory;
import Order.OrderDAO;

public class SybaseDAOFactory extends DAOFactory {

	@Override
	public CustomerDAO getCustomerDAO() {
		// TODO Auto-generated method stub
		return new SybaseCustomerDAO();
	}

	@Override
	public AccountDAO getAccountDAO() {
		// TODO Auto-generated method stub
		return new SybaseAccountDAO();
	}

	@Override
	public OrderDAO getOrderDAO() {
		// TODO Auto-generated method stub
		return new SybaseOrderDAO();
	}

}
