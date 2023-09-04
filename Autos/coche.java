package Autos;

public class coche {

    public static void main(String[] args) {

        Auto coche1 = new Auto(); 
        Auto coche2 = new Auto();

        coche1.Color = "Blanco";
        coche1.Marca = "Audi";
        coche1.KM = 0;

        coche2.Color = "Rojo";
        coche2.Marca = "Ferrari";
        coche2.KM = 100;

        coche1.encender();
        coche2.encender();
    }
}

class Auto { 
    String Color;
    String Marca;
    int KM;

    public void encender() {
        System.out.println("El coche está encendido.");
    }
}
