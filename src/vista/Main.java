package vista;

import java.sql.SQLException;
import java.text.ParseException;

public class Main {
	
	
  //hay que crear throws exception y luego manejarlas en el test
	public static void main(String[] args) throws ParseException, SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

			BibliotecaVista biblioteca = new BibliotecaVista();
			
			biblioteca.menuBiblioteca();
			
	}

}
