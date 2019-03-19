package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import Domain.User;

public class AppDAO {

	private String sql_sentence;
	
	public void DAO_Application() throws ClassNotFoundException, SQLException
	{
		DBManager.getInstance();
	}
	
	public boolean login(String s, String p, User u) throws SQLException, ClassNotFoundException
	{
		sql_sentence = "SELECT Persons.*, Users.username, Users.password "+
					   "FROM Persons, Users "+
					   "WHERE Persons.";
		
		ResultSet rs = DBManager.retrieve(sql_sentence);
		if(p.equals(rs.getString("password")))
		{
			while(rs.next())
			{
				
			}
		}else{
			return false;
		}
	
		
		return true;
	}
	
	
}
