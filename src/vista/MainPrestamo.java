package vista;

import java.sql.SQLException;

public class MainPrestamo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		PrestamoVista vista = new PrestamoVista(); 
		
		vista.menuPrestamo(); 

	}

}
