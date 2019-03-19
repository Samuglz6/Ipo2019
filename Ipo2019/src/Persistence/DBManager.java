package Persistence;

import java.sql.*;

public final class DBManager {
	
	private static volatile DBManager singleton_db;
	private static String dbName = (DBManager.class.getResource(
			  "/Resources/Database.accdb")).toString().replaceAll("file:/", "");
	private static String dbUrl = "jdbc:ucanaccess://"+dbName;
	private static Connection connection;
	private static Statement statement;
	
	public DBManager() throws SQLException, ClassNotFoundException
	{
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		connection = DriverManager.getConnection(dbUrl, "", "");
		statement = connection.createStatement();
	}
	
	public static void update(String sql) throws SQLException
	{
		statement.executeUpdate(sql);
	}
	
	public static ResultSet retrieve(String sql) throws SQLException
	{
		return statement.executeQuery(sql);
	}
	
	public static void close() throws SQLException
	{
		statement.close();
		connection.close();
	}

	public static DBManager getInstance() throws ClassNotFoundException, SQLException
	{
		if(singleton_db == null)
		{
			synchronized(DBManager.class)
			{
				if(singleton_db == null)
				{
					singleton_db = new DBManager();
				}
			}
		}
		return singleton_db;
	}
}