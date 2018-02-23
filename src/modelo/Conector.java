package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	
	protected Connection conexion; 
	
	public Conector() throws ClassNotFoundException, SQLException{
		
			  
			Class.forName("com.mysql.jdbc.Driver");
			
			this.conexion = DriverManager.getConnection("jdbc:mysql://" + Config.HOST + "/" + Config.BBDD, Config.USERNAME, Config.PASSWORD);
			
	
		   
	}
}
