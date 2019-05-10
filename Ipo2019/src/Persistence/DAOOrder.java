package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;

import Domain.Client;
import Domain.Order;


public class DAOOrder {
	
	private String sql_sentence;
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public DAOOrder() throws ClassNotFoundException, SQLException
	{
		DBManager.getInstance();
	}
	
	public void insert(Order o) throws SQLException
	{
		sql_sentence = "INSERT INTO Orders VALUES ("+o.getClient()+","+o.getState()+","
						+o.getAddres()+","+o.getTotalPrice()+","+o.getShippingCost()+");";
		
		DBManager.update(sql_sentence);
	}
	
	public void read(Order o) throws SQLException, ClassNotFoundException
	{
		
		ResultSet rs;
		sql_sentence = "SELECT * "+
				   	   "FROM Orders "+
				   	   "WHERE Orders.id = " + o.getId() + ";";
		
		rs = DBManager.retrieve(sql_sentence);
		
		while(rs.next())
		{

			o.setClient(rs.getInt("id_client"));
			o.setState(rs.getString("actual_state"));
			o.setAddres(rs.getString("address"));
			o.setTotalPrice(rs.getDouble("total_price"));
			o.setShippingCost(rs.getDouble("shipping_cost"));
		}
		rs.close();
	}
	
	public void update(Order o) throws SQLException
	{
			sql_sentence = "SET Orders"+
			   "VALUES ("+o.getId()+","+o.getClient()+","+ o.getState()+","+
			   	o.getAddres()+","+o.getTotalPrice()+"," + o.getShippingCost()+")"+
			   "WHERE Orders.id = "+o.getId()+";";

			DBManager.update(sql_sentence);
		
		
	}
	
	public void delete(Order o) throws SQLException
	{	
		sql_sentence = "DELETE * "+
				   "FROM Orders "+
				   "WHERE Orders.id = "+o.getId()+";";

		DBManager.update(sql_sentence);
	}
	
	public void read_all() throws ClassNotFoundException, SQLException
	{
		Order aux;
		ResultSet rs;
		sql_sentence = "SELECT *" +
					   "FROM Orders;";
		
		rs = DBManager.retrieve(sql_sentence);
			
		while(rs.next())
		{
			aux = new Order(rs.getInt("id_client"), rs.getString("actual_state"), rs.getString("address"), 
						    rs.getDouble("total_price"), rs.getDouble("shipping_cost"));
			orders.add(aux);
		}
	}
}
