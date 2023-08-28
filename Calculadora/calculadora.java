package Calculadora;

import javax.swing.JOptionPane;

public class calculadora {
    // Métodos de la calculadora
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

    public static void main(String[] args) {
        // Crear dos objetos de la clase Calculadora
        calculadora calculadora1 = new calculadora();
        calculadora calculadora2 = new calculadora();

        // Mostrar menú de opciones para la Calculadora 1
        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        int seleccion1 = JOptionPane.showOptionDialog(null, "Selecciona una operación para la Calculadora 1:", "Calculadora 1",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (seleccion1 == -1) {
            // El usuario cerró el cuadro de diálogo
            JOptionPane.showMessageDialog(null, "Calculadora cerrada. ¡Hasta luego!");
            return;
        }

        // Ingresar los valores usando JOptionPane para la Calculadora 1
        double num1Calc1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número para la Calculadora 1:"));
        double num2Calc1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número para la Calculadora 1:"));

        double resultadoCalc1 = 0;

        // Realizar la operación seleccionada con la primera calculadora
        switch (seleccion1) {
            case 0:
                resultadoCalc1 = calculadora1.sumar(num1Calc1, num2Calc1);
                break;
            case 1:
                resultadoCalc1 = calculadora1.restar(num1Calc1, num2Calc1);
                break;
            case 2:
                resultadoCalc1 = calculadora1.multiplicar(num1Calc1, num2Calc1);
                break;
            case 3:
                resultadoCalc1 = calculadora1.dividir(num1Calc1, num2Calc1);
                break;
        }

        // Mostrar menú de opciones para la Calculadora 2
        int seleccion2 = JOptionPane.showOptionDialog(null, "Selecciona una operación para la Calculadora 2:", "Calculadora 2",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        if (seleccion2 == -1) {
            // El usuario cerró el cuadro de diálogo
            JOptionPane.showMessageDialog(null, "Calculadora cerrada. ¡Hasta luego!");
            return;
        }

        // Ingresar los valores usando JOptionPane para la Calculadora 2
        double num1Calc2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número para la Calculadora 2:"));
        double num2Calc2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número para la Calculadora 2:"));

        double resultadoCalc2 = 0;

        // Realizar la operación seleccionada con la segunda calculadora
        switch (seleccion2) {
            case 0:
                resultadoCalc2 = calculadora2.sumar(num1Calc2, num2Calc2);
                break;
            case 1:
                resultadoCalc2 = calculadora2.restar(num1Calc2, num2Calc2);
                break;
            case 2:
                resultadoCalc2 = calculadora2.multiplicar(num1Calc2, num2Calc2);
                break;
            case 3:
                resultadoCalc2 = calculadora2.dividir(num1Calc2, num2Calc2);
                break;
        }

        // Mostrar los resultados en cuadros de diálogo separados al final
        String mensaje = "Resultado de la Calculadora 1: " + resultadoCalc1 + "\n"
                + "Resultado de la Calculadora 2: " + resultadoCalc2;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}