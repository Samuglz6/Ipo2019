package Domain;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import Persistence.DAOclient;

public class Client
{	
	private String name;
	private String surname;
	private String address;
	private String mail;
	private String phone;
	private String last_access;
	private String image;
	private DAOclient dao_user;
	
	/*--------------------------------------------------------------------------
			Constructors. The void one is for create empty auxiliary Users
	--------------------------------------------------------------------------*/
	
	public Client(String name, String surname, String address, String mail, String phone, 
				String last_access, String image) throws ClassNotFoundException, SQLException
	{
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.mail = mail;
		this.phone = phone;
		this.last_access = last_access;
		this.image = image;
		this.dao_user = new DAOclient();
	}
	
	public Client() throws ClassNotFoundException, SQLException
	{
		dao_user = new DAOclient();
	}
	
	/*--------------------------------------------------------------------------
	 *  							CRUD Defined here
	 -------------------------------------------------------------------------*/
	 
	/*
	 * Create (Insert) calling method -> DAO_User insert()
	 * Read calling method -> DAO_User read()
	 * Update calling method -> DAO_User update()
	 * Delete calling method -> DAO_User delete()
	 * 
	 * Every one of those methods uses the object that is calling to that function,
	 * so we are defining an object in the Presentation layer and calling the 
	 * CRUD functions defined here to pass to the DAO_User which is in charge 
	 * to manage the persistent data in the database
	 */
	
	public void insertUser() throws SQLException
	{
		dao_user.insert(Client.this);
	}
	
	public void readUser() throws SQLException
	{
		dao_user.read(Client.this);
	}
	
	public void updateUser() throws SQLException
	{
		dao_user.update(Client.this);
	}
	
	public void deleteUser() throws SQLException
	{
		dao_user.delete(Client.this);
	}
	
	public ArrayList<Client> getAllClients() throws ClassNotFoundException, SQLException{
		dao_user.read_all();
		return dao_user.getClients();
	}
	
	/*--------------------------------------------------------------------------
	   					Necessary setters and getters
	--------------------------------------------------------------------------*/
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getSurname() 
	{
		return surname;
	}
	public void setSurname(String surname) 
	{
		this.surname = surname;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getMail() 
	{
		return mail;
	}
	public void setMail(String mail) 
	{
		this.mail = mail;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	public String getLastAccess() 
	{
		return last_access;
	}
	public void setLastAccess(String last_access) 
	{
		this.last_access = last_access;
	}
	public String getLast_access() 
	{
		
		return last_access;
	}
	public void setLast_access(String last_access) 
	{
		this.last_access = last_access;
	}
	public String getImage()
	{
		return image;
	}
	public void setImage(String image)
	{
		this.image = image;
	}
}
