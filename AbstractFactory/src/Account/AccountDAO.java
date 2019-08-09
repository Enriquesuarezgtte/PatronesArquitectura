package Account;

import java.util.ArrayList;

import javax.sql.RowSet;

public interface AccountDAO {
	public int insertAccount(int id);

	public boolean deleteAccount(int id);

	public Account findAccount(int id);

	public boolean updateAccount(int id, String name);

	public RowSet selectAccountRs(ArrayList<Integer> id);
}
