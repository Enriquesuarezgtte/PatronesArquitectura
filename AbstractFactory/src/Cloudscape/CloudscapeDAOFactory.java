package Cloudscape;

import java.sql.Connection;

import FACTORia.DAOFactory;
import Account.AccountDAO;
import Customer.CustomerDAO;
import Order.OrderDAO;

public class CloudscapeDAOFactory extends DAOFactory {
	public static final String DRIVER = "COM.cloudscape.core.RmiJdbcDriver";
	public static final String DBURL = "jdbc:cloudscape:rmi://localhost:1099/CoreJ2EEDB";

	// method to create Cloudscape connections
	public static Connection createConnection() {
		return null;
		// Use DRIVER and DBURL to create a connection
		// Recommend connection pool implementation/usage
	}

	public CustomerDAO getCustomerDAO() {
		// CloudscapeCustomerDAO implements CustomerDAO
		return new CloudscapeCustomerDAO();
	}

	public AccountDAO getAccountDAO() {
		// CloudscapeAccountDAO implements AccountDAO
		return new CloudscapeAccountDAO();
	}

	public OrderDAO getOrderDAO() {
		// CloudscapeOrderDAO implements OrderDAO
		return new CloudscapeOrderDAO();
	}

}