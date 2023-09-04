package Animales;

public class principal {

	public static void main(String[] args) {

		animales animal = new animales();

		animal.nombre = "Leon";
		animal.Tipo = "viviparo";
		animal.Genero = "Macho";

		animal.preguntar();
		animal.Comer();
		animal.Correr();
		animal.tipo();
		animal.dormir();
		animal.genero();
	}
}