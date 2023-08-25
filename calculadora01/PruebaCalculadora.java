package calculadora01;

import javax.swing.JOptionPane;

public class PruebaCalculadora {
	public static void main(String[] args) {
		
		//  Clase Calculadora
		Calculadora miCalculadora = new Calculadora();
		
		// Los valores
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
		
		//Operaciones
		double resultadoSuma = miCalculadora.sumar(num1, num2);
		double resultadoResta = miCalculadora.restar(num1, num2);
		double resultadoMultiplicacion = miCalculadora.multiplicar(num1, num2);
		double resultadoDivision = miCalculadora.dividir(num1, num2);
		
		// Mensaje de la suma, resta, multiplicación y dividión
		String mensaje = "El resultado de La Suma es: " + resultadoSuma + "\n" + "El resultado de La Resta es: " + resultadoResta + "\n" + "El resultado de La Multiplicación es: " + resultadoMultiplicacion + "\n" + "El resultado de La División es: " + resultadoDivision;
		
		// Resultados
		JOptionPane.showMessageDialog(null, mensaje);
	}
}