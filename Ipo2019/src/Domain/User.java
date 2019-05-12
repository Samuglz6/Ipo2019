package Domain;

import java.sql.SQLException;

import Persistence.DAOUser;

public class User {

		private int id;
		private String userName;
		private String pass;
		private String personalId;
		private DAOUser daoUser;
		
		public User(int id, String userName, String pass, String personalId) throws ClassNotFoundException, SQLException {
			this.id = id;
			this.userName = userName;
			this.pass = pass;
			this.personalId = personalId;
			this.daoUser = new DAOUser();
		}
		
		public User() throws ClassNotFoundException, SQLException {
			this.daoUser = new DAOUser();
		}
		
		public User(String userName, String pass, String personalId) throws ClassNotFoundException, SQLException {
			this.userName = userName;
			this.pass = pass;
			this.personalId = personalId;
			this.daoUser = new DAOUser();
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getPersonalId() {
			return personalId;
		}
		public void setPersonalId(String personalId) {
			this.personalId = personalId;
		}

		public DAOUser getDaoUser() {
			return daoUser;
		}

		public void setDaoUser(DAOUser daoUser) {
			this.daoUser = daoUser;
		}
	
}
