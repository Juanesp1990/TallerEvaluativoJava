package SolucionTaller;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String[] args) {
        String frase="";
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese una frase con espacios ");
        frase=scanner.nextLine().replaceAll(" ","");
        System.out.println(frase);
    }
}
