package Amazon;

import java.util.ArrayList;

import javax.sql.RowSet;

import Order.Order;
import Order.OrderDAO;

public class AmazonOrderDAO implements OrderDAO {

	@Override
	public int insertOrder(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteOrder(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order findOrder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOrder(int id, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RowSet selectOrderRs(ArrayList<Integer> id) {
		// TODO Auto-generated method stub
		return null;
	}

}
