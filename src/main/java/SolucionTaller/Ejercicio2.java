package SolucionTaller;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args) {
        int numero1 = 0;
        int numero2 = 0;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer numero: ");
            numero1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese el segundo numero: ");
            numero2 = Integer.parseInt(scanner.nextLine());
            Ejercicio2.Comparar(numero1,numero2);

        } catch (Exception e) {
            System.out.println("Los valores no son validos, intente nuevamente");
        }
    }

        public static void Comparar ( int numero1, int numero2){
            if (numero2 > numero1) {
                System.out.println("El numero: " + numero2 + " Es mayor que el numero: " + numero1);
            } else if (numero1 > numero2) {
                System.out.println("El numero: " + numero1 + " Es mayor que el numero: " + numero2);
            } else {
                System.out.println("El numero: " + numero2 + " Es igual al numero: " + numero1);
            }
        }
    }
