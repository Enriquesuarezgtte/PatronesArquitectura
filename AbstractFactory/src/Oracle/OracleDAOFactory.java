package Oracle;

import Account.AccountDAO;
import Customer.CustomerDAO;
import FACTORia.DAOFactory;
import Order.OrderDAO;

public class OracleDAOFactory extends DAOFactory {

	@Override
	public CustomerDAO getCustomerDAO() {
		// TODO Auto-generated method stub
		return new OracleCustomerDAO();
	}

	@Override
	public AccountDAO getAccountDAO() {
		// TODO Auto-generated method stub
		return new OracleAccountDAO();
	}

	@Override
	public OrderDAO getOrderDAO() {
		// TODO Auto-generated method stub
		return new OracleOrderDAO();
	}

}
