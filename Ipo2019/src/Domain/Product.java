package Domain;

import java.sql.SQLException;
import java.util.ArrayList;

import Persistence.DAOProduct;

public class Product {

	private int id;
	private String name;
	private String type;
	private String ingredientes;
	private int price;
	private DAOProduct dao_product;
	
	
	public Product(String name, String type, String ingredientes, int price) throws ClassNotFoundException, SQLException {
		this.name = name;
		this.type = type;
		this.ingredientes = ingredientes;
		this.price = price;
		this.dao_product = new DAOProduct();
	}
	
	public Product() throws ClassNotFoundException, SQLException
	{
		dao_product = new DAOProduct();
	}
	
	public void insertUser() throws SQLException
	{
		dao_product.insert(Product.this);
	}
	
	public void readUser() throws SQLException
	{
		dao_product.read(Product.this);
	}
	
	public ArrayList<Product> getAllProducts() throws ClassNotFoundException, SQLException{
		dao_product.read_all();
		return dao_product.getProducts();
	}
	
	public void updateUser() throws SQLException
	{
		dao_product.update(Product.this);
	}
	
	public void deleteUser() throws SQLException
	{
		dao_product.update(Product.this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public DAOProduct getDao_product() {
		return dao_product;
	}

	public void setDao_product(DAOProduct dao_product) {
		this.dao_product = dao_product;
	}
}
