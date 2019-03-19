package Domain;

import java.sql.SQLException;

import Persistence.AppDAO;

public class Application {

	private static volatile Application singleton_app;
	private static User logged_user;
	private static AppDAO dao_application;
	
	public Application() throws ClassNotFoundException, SQLException
	{
		logged_user = new User();
		dao_application = new AppDAO();
	}
	
	public static void setUser(User u)
	{
		logged_user = u;
	}
	
	public static User getUser()
	{
		return logged_user;
	}
	
	
	public static boolean login(String name, String password) throws 
											ClassNotFoundException, SQLException
	{
		return dao_application.login(name, password, logged_user);
	}
	
	public static Application getInstance() throws ClassNotFoundException,
																	SQLException
	{
		if(singleton_app == null)
		{
			synchronized(Application.class)
			{
				if(singleton_app == null)
				{
					singleton_app = new Application();
				}
			}
		}
		return singleton_app;
	}
}
