package Domain;

import java.sql.SQLException;
import javax.swing.ImageIcon;
import Persistence.UserDAO;

public class User
{	
	private String name;
	private String surname;
	private String mail;
	private String phone;
	private String last_access;
	private ImageIcon user_image;
	private UserDAO dao_user;
	
	/*--------------------------------------------------------------------------
			Constructors. The void one is for create empty auxiliary Users
	--------------------------------------------------------------------------*/
	
	public User(String name, String surname, String mail, String phone, 
				String last_access, ImageIcon user_image) throws ClassNotFoundException, SQLException
	{
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.phone = phone;
		this.last_access = last_access;
		this.user_image = user_image;
		this.dao_user = new UserDAO();
	}
	public User() throws ClassNotFoundException, SQLException
	{
		dao_user = new UserDAO();
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
		dao_user.insert(User.this);
	}
	
	public void readUser() throws SQLException
	{
		dao_user.read(User.this);
	}
	
	public void updateUser() throws SQLException
	{
		dao_user.update(User.this);
	}
	
	public void deleteUser() throws SQLException
	{
		dao_user.update(User.this);
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
	public ImageIcon getUser_image()
	{
		return user_image;
	}
	public void setUser_image(ImageIcon user_image)
	{
		this.user_image = user_image;
	}
}
