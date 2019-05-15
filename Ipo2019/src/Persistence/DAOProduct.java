package Persistence;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;

import Domain.Product;



public class DAOProduct {
	
	private String sql_sentence;
	private ArrayList<Product> productos = new ArrayList<Product>();
	
	public DAOProduct() throws ClassNotFoundException, SQLException
	{
		DBManager.getInstance();
	}
	
	public void insert(Product p) throws SQLException
	{
		sql_sentence = "";
		
		DBManager.update(sql_sentence);
	}
	
	public void read(Product p) throws SQLException
	{
		ResultSet rs;
		sql_sentence = "";
		
		rs = DBManager.retrieve(sql_sentence);
		
		while(rs.next())
		{

		}
		
		rs.close();
	}
	
	public void update(Product u) throws SQLException
	{
		sql_sentence = "";
		
		DBManager.update(sql_sentence);
		
		
	}
	
	public void delete(Product u) throws SQLException
	{	
		sql_sentence = "";
	
		DBManager.update(sql_sentence);
	}
	
	public void read_all() throws ClassNotFoundException, SQLException
	{
		Product aux;
		ResultSet rs;
		sql_sentence = "SELECT *" +
					   "FROM Products;";
		
		rs = DBManager.retrieve(sql_sentence);
			
		while(rs.next())
		{

		}
	}
	
	public ArrayList<Product> getProducts()
	{
		return productos;
	}
	
	
}
