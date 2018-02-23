package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.Usuario;

public class Operaciones {
	
	int contador = 0; 
	
	double suma = 0; 

	
	public double edadMedia() throws ClassNotFoundException, SQLException{
		
		MockUsuario mockUsuario = new MockUsuario(false); 
		ArrayList <Usuario> usuarios = mockUsuario.selectAll(); 
		
		Iterator<Usuario> i = usuarios.iterator(); 
		
		while(i.hasNext()){
			suma = suma + i.next().getEdad(); 
		}
		
		return suma/contador;
	
	}
}
