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
	
	
	
	public User read(User u) throws SQLException {

		ResultSet rs;
		sql_sentence = "SELECT * "+
				   	   "FROM Users "+
				   	   "WHERE Users.username = '" + u.getUserName() +
				   	   "' AND Users.password = '" + u.getPass() +
				   	   "';";
		rs = DBManager.retrieve(sql_sentence);
		
		while(rs.next())
		{
			u.setId(rs.getInt("Id"));
			u.setUserName(rs.getString("username"));
			u.setPass(rs.getString("password"));
			u.setPersonalId(rs.getString("person_id"));
		}
		rs.close();
		
		return u;
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
			System.out.println("Users length" + users.size());
			users.add(aux);
		}
	}


	public String getSql_sentence() {
		return sql_sentence;
	}


	public void setSql_sentence(String sql_sentence) {
		this.sql_sentence = sql_sentence;
	}


	public ArrayList<User> getUsers() {
		return users;
	}


	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	
	
	
}
