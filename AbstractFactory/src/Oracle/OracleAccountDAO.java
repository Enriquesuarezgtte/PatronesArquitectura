package Oracle;

import java.util.ArrayList;

import javax.sql.RowSet;

import Account.Account;
import Account.AccountDAO;

public class OracleAccountDAO implements AccountDAO {

	@Override
	public int insertAccount(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteAccount(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account findAccount(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAccount(int id, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RowSet selectAccountRs(ArrayList<Integer> id) {
		// TODO Auto-generated method stub
		return null;
	}

}
