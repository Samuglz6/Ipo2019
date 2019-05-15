package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;

import Domain.Client;
import Domain.User;

public class DAOclient
{
	private String sql_sentence;
	private ArrayList<Client> clientes = new ArrayList<Client>();
	
	public DAOclient() throws ClassNotFoundException, SQLException
	{
		DBManager.getInstance();
	}
	
	public ArrayList<Client> getClients() {
		return clientes;
	}
	
	public void insert(Client u) throws SQLException
	{
		sql_sentence = "INSERT INTO Clients VALUES ("+u.getName()+","+u.getSurname()+","
						+u.getAddress()+","+u.getMail()+","+u.getPhone()+","
						+u.getLast_access()+");";
		
		DBManager.update(sql_sentence);
	}
	
	public void read(Client u) throws SQLException
	{
		ResultSet rs;
		sql_sentence = "SELECT * "+
				   	   "FROM Clients "+
				   	   "WHERE Client.first_name = " + u.getName() + ";";
		
		rs = DBManager.retrieve(sql_sentence);
		
		while(rs.next())
		{
			u.setName(rs.getString("first_name"));
			u.setSurname(rs.getString("surname"));
			u.setAddress(rs.getString("address"));
			u.setMail(rs.getString("mail"));
			u.setPhone(rs.getString("phone"));
			u.setLast_access(rs.getString("last_access"));
		}
		rs.close();
	}
	
	public void update(Client u) throws SQLException
	{
		sql_sentence = "SET Clients"+
					   "VALUES ("+u.getName()+","+u.getSurname()+","+ u.getAddress()+","+
					   	u.getMail()+","+u.getPhone()+"," + u.getLast_access()+")"+
					   "WHERE Clients.first_name = "+u.getName()+";";
		
		DBManager.update(sql_sentence);
		
		
	}
	
	public void delete(Client u) throws SQLException
	{	
		sql_sentence = "DELETE * "+
					   "FROM Clients "+
					   "WHERE Clients.first_name = "+u.getName()+";";
	
		DBManager.update(sql_sentence);
	}
	
	public void read_all() throws ClassNotFoundException, SQLException
	{
		Client aux;
		ResultSet rs;
		sql_sentence = "SELECT *" +
					   "FROM Clients;";
		
		rs = DBManager.retrieve(sql_sentence);
			
		while(rs.next())
		{
			aux = new Client(rs.getString("first_name"), rs.getString("surname"), rs.getString("address"),
							   rs.getString("mail"),rs.getString("phone")
							   ,rs.getString("last_access"), rs.getString("image"));
			clientes.add(aux);
		}
	}
}
