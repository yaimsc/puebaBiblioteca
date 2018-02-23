package vista;

import java.sql.SQLException;

import modelo.Libro;

public class MainLibro {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		LibroVista libro = new LibroVista(); 
		
		libro.menuLibro();

	}

}
