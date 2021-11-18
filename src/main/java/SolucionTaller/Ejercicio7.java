package SolucionTaller;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[] args) {
        double numero;
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.print("Escriba un valor :");
                numero = Double.parseDouble(scanner.nextLine());
            } while (numero < 0);
            System.out.println("El numero mayor o igual que cero es " + numero);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
