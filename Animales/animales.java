package Animales;

import javax.swing.JOptionPane;

public class animales {
//atributos
	String nombre;
	String Genero;
	String Tipo;
//metodos

	public void preguntar() {
		nombre = JOptionPane.showInputDialog("Ingresa el animal");
	};

	public void Comer() {
		System.out.println("el " + nombre + " esta comiendo");
	}

	;

	public void Correr() {
		System.out.println("el " + nombre + " esta corriendo");
	};

	public void dormir() {
		System.out.println("el " + nombre + " esta dormiendo");
	};

	public void genero() {
		System.out.println("el " + nombre + " es " + Genero);
	};

	public void tipo() {
		System.out.println("el " + nombre + " es " + Tipo);
	};
}