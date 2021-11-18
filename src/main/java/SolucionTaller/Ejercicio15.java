package SolucionTaller;

import java.awt.*;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main (String[] args) {
        int indice=0;
        Scanner scanner = new Scanner(System.in);
        do {
            Menu();
            indice = Integer.parseInt(scanner.nextLine());
            switch (indice){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: indice=8;
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
                    break;
            }
        }while(indice!=8);

    }
    public static void Menu(){

            System.out.println("****** GESTION CINEMATOGRAFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");

    }
}
