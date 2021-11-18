package SolucionTaller;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {
        double radioCirculo = 0;
        double areaCirculo;
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor ingrese el valor del radio");
            radioCirculo = Double.parseDouble(scanner.nextLine());
            areaCirculo = Math.PI * (Math.pow(radioCirculo, 2));
            System.out.println("el area del circulo es: " + areaCirculo);
        } catch (Exception e) {
            System.out.println("el valor ingresado no es correcto");

        }
    }
}
