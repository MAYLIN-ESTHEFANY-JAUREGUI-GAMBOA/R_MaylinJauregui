package calculadora01;

import javax.swing.JOptionPane;

public class Calculadora {

	// Métodos
	public double sumar(double num1, double num2) {
		return num1 + num2;
	}

	public double restar(double num1, double num2) {
		return num1 - num2;
	}

	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public double dividir(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Error: división por cero no permitida");
			return Double.NaN;
		}
	}
}