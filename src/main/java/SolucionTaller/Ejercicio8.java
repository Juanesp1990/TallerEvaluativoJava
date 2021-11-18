package SolucionTaller;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {
        String dia;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana: ");
        dia = scanner.nextLine().toUpperCase(Locale.ROOT);
        switch (dia) {
            case "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" -> System.out.println(dia + " Es dia laboral");
            case "SABADO", "DOMINGO" -> System.out.println(dia + "No es un dia labora");
            default -> System.out.println("Ese dia no existe, o contiene espacios");
        }
    }
}
