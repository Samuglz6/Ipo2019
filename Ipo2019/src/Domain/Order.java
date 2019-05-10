package Domain;

import java.sql.SQLException;

import Persistence.DAOOrder;

public class Order {

	private int id;
	private int client;
	private String state;
	private String addres;
	private double totalPrice;
	private double shippingCost;
	private DAOOrder dao_order;
	

	public Order(int id, int client, String state, String addres, double totalPrice, double shippingCost) throws ClassNotFoundException, SQLException {
		super();
		this.id = id;
		this.client = client;
		this.state = state;
		this.addres = addres;
		this.totalPrice = totalPrice;
		this.shippingCost = shippingCost;
		this.dao_order = new DAOOrder();
	}
	
	public Order() throws ClassNotFoundException, SQLException {
		this.dao_order = new DAOOrder();
	}
	
	public Order(int int1, String string, String string2, double double1, double double2) throws ClassNotFoundException, SQLException {
		super();
		this.client = int1;
		this.state = string;
		this.addres = string2;
		this.totalPrice = double1;
		this.shippingCost = double2;
		this.dao_order = new DAOOrder();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void insertUser() throws SQLException
	{
		dao_order.insert(Order.this);
	}
	
	public void readUser() throws SQLException, ClassNotFoundException
	{
		dao_order.read(Order.this);
	}
	
	public void updateUser() throws SQLException
	{
		dao_order.update(Order.this);
	}
	
	public void deleteUser() throws SQLException
	{
		dao_order.update(Order.this);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public DAOOrder getDao_order() {
		return dao_order;
	}

	public void setDao_order(DAOOrder dao_order) {
		this.dao_order = dao_order;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}
	
	
	
}
