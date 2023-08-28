package Persona;

public class principal {
	
	public static void main (String[] args) {
		
		persona per1 = new persona ();
		
		per1.nombre = "maria";
		per1.edad = 52;
		
		per1.preguntar();
		per1.mostrarDatos();
	
		
	}
}