package SolucionTaller;

import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;

public class Ejercicio14 {
    public static void main (String[] args) {
        int numeroInicial;
        String lista = "";

        showMessageDialog(null, "vALORES DE 2 EN 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el limite inferior (valor menor que 1000): ");
        numeroInicial = Integer.parseInt(scanner.nextLine());

        for (int i = numeroInicial; i <= 1000; i += 2) {
            System.out.println(" numero : " + i);
            lista += i + "\n";

        }
        System.out.println(lista);
        showMessageDialog(null, lista);



    }
}
