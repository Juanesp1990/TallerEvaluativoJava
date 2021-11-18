package SolucionTaller;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args) {
        double precioProducto;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del producto: ");
        try {
            precioProducto = Double.parseDouble(scanner.nextLine());
            System.out.println("el valor final del producto incluyendo iva es: " + (precioProducto * 1.21));
        } catch (Exception e) {
            System.out.println("Error ingresando el valor del producto");
        }
    }

}
