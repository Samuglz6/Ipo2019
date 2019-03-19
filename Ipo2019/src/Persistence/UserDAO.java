package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;

import Domain.User;

public class UserDAO
{
	private String sql_sentence;
	private Hashtable<String,User> app_users;
	
	public UserDAO() throws ClassNotFoundException, SQLException
	{
		app_users = new Hashtable<String, User>();
		DBManager.getInstance();
	}
	
	public void insert(User u) throws SQLException
	{
		sql_sentence = "INSERT INTO User(name, surname, mail, phone, last_access)"+
						"VALUES ("+u.getName()+","+u.getSurname()+","
						+u.getMail()+","+u.getPhone()+","
						+u.getLast_access()+")";
		
		DBManager.update(sql_sentence);
	}
	
	public void read(User u) throws SQLException
	{
		ResultSet rs;
		sql_sentence = "SELECT * "+
				   "FROM Persons "+
				   "WHERE Users.name = " + u.getName() + ";";
		
		rs = DBManager.retrieve(sql_sentence);
		
		while(rs.next())
		{
			u.setName(rs.getString("first_name"));
			u.setSurname(rs.getString("surname"));
			u.setMail(rs.getString("mail"));
			u.setPhone(rs.getString("phone"));
			u.setLast_access(rs.getString("last_access"));
		}
		rs.close();
	}
	
	public void update(User u) throws SQLException
	{
		sql_sentence = "SET Users(name,surname,mail,phone,last_access)"+
					   "VALUES ("+u.getName()+","+u.getSurname()+","+ 
					   			u.getMail()+","+u.getPhone()+"," + 
					   			u.getLast_access()+")"+
					   "WHERE Persons.name = "+u.getName()+";";
		
		DBManager.update(sql_sentence);
		
		
	}
	
	public void delete(User u) throws SQLException
	{	
		sql_sentence = "DELETE * "+
					   "FROM Persons "+
					   "WHERE Persons.name = "+u.getName()+";";
	
		DBManager.update(sql_sentence);
	}
	
	public void read_all() throws ClassNotFoundException, SQLException
	{
		User aux = null;
		ResultSet rs;
		sql_sentence = "SELECT *" +
					   "FROM Persons;";
		
		rs = DBManager.retrieve(sql_sentence);
			
		while(rs.next())
		{
			aux = new User(rs.getString("first_name"), rs.getString("surname"),
							   rs.getString("mail"),rs.getString("phone")
							   ,rs.getString("last_access"), null);
		}
		
		sql_sentence = "SELECT * " +
			 "FROM Users " +
			 "WHERE ;";
		
		rs = DBManager.retrieve(sql_sentence);
		
		while(rs.next())
		{
			app_users.put(rs.getString("username"),aux);
		}
	
		rs.close();
	}
}
