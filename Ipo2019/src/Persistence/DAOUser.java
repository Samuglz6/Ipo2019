package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;

import Domain.Order;
import Domain.User;

public class DAOUser {
	
	private ArrayList<User> users = new ArrayList<User>();
	private String sql_sentence;
	
	public DAOUser() throws ClassNotFoundException, SQLException {
		DBManager.getInstance();
	}
	
	
	public void readAll() throws SQLException, ClassNotFoundException
	{
		User aux;
		ResultSet rs;
		sql_sentence = "SELECT *" +
					   "FROM Users;";
		
		rs = DBManager.retrieve(sql_sentence);
			
		while(rs.next())
		{
			aux = new User(rs.getInt("Id"), rs.getString("username"), rs.getString("password"), 
						    rs.getString("person_id"));
			users.add(aux);
		}
	}
	
	
	
	
}
