package Calculadora;

public class PruebaCalculadora {
	public static void main(String[] args) {
		// Crear un objeto de la clase Calculadora
		calculadora miCalculadora = new calculadora();

		// Realizar algunas operaciones
		double resultadoSuma = miCalculadora.sumar(5.0, 3.0);
		double resultadoResta = miCalculadora.restar(10.0, 7.0);
		double resultadoMultiplicacion = miCalculadora.multiplicar(4.0, 2.5);
		double resultadoDivision = miCalculadora.dividir(15.0, 3.0);

		// Imprimir resultados
		System.out.println("Resultado Suma: " + resultadoSuma);
		System.out.println("Resultado Resta: " + resultadoResta);
		System.out.println("Resultado Multiplicación: " + resultadoMultiplicacion);
		System.out.println("Resultado División: " + resultadoDivision);
	}
}