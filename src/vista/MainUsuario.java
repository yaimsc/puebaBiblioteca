package vista;

import java.sql.SQLException;
import java.text.ParseException;

import modelo.Usuario;

public class MainUsuario {

	public static void main(String[] args) throws ClassNotFoundException, ParseException, SQLException {
		// TODO Auto-generated method stub
		
		UsuarioVista vista = new UsuarioVista();
		
		vista.menuUsuario();
		
	}

}
