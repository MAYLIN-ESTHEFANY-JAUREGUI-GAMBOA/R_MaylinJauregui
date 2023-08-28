package Persona;

import javax.swing.JOptionPane;

public class persona {


	// atributos
	String nombre;
	String apellido;
	public int edad;

	
	// metodos
	public void preguntar() {
		nombre = JOptionPane.showInputDialog("Ingresa nombre");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad"));
	}

	public void mostrarDatos() {
		String mensaje = "Nombre: " + nombre + "\nEdad: " + edad;
		JOptionPane.showMessageDialog(null, mensaje, "Información de la Persona", JOptionPane.INFORMATION_MESSAGE);
	}

	

	}