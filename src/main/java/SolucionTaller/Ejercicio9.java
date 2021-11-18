package SolucionTaller;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[] args) {
        String mensaje = "";
        String texto = "La sonrisa sera la mejor arma contra la tristeza ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un mensaje para completar la oración: ");
        mensaje = scanner.nextLine();
        texto = texto.replace('a', 'e');
        System.out.println(texto + mensaje);
    }
}
