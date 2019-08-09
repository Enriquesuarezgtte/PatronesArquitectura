package FACTORia;

import Account.AccountDAO;
import Amazon.AmazonDAOFactory;
import Cloudscape.CloudscapeDAOFactory;
import Customer.CustomerDAO;
import Mongo.MongoDAOFactory;
import Oracle.OracleDAOFactory;
import Order.OrderDAO;
import Sybase.SybaseDAOFactory;

public abstract class DAOFactory {

	public static final int CLOUDSCAPE = 1;
	public static final int ORACLE = 2;
	public static final int SYBASE = 3;
	public static final int MongoDB = 4;
	public static final int AmazonDB = 5;

	public abstract CustomerDAO getCustomerDAO();

	public abstract AccountDAO getAccountDAO();

	public abstract OrderDAO getOrderDAO();

	public static DAOFactory getDaoFactory(int whichFactory) {

		switch (whichFactory) {
		case CLOUDSCAPE:
			return new CloudscapeDAOFactory();
		case ORACLE:
			return new OracleDAOFactory();
		case SYBASE:
			return new SybaseDAOFactory();
		case MongoDB:
			return new MongoDAOFactory();
		case AmazonDB:
			return new AmazonDAOFactory();
		default:
			return null;
		}
	}

}
