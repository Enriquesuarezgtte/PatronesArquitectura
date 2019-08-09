package Order;

import java.util.ArrayList;

import javax.sql.RowSet;

public interface OrderDAO {
	public int insertOrder(int id);

	public boolean deleteOrder(int id);

	public Order findOrder(int id);

	public boolean updateOrder(int id, String name);

	public RowSet selectOrderRs(ArrayList<Integer> id);
}
