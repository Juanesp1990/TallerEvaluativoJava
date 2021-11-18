package SolucionTaller;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String[] args) {
        String frase="";
        int a=0,e=0,i=0,o=0,u=0;
        Scanner scanner= new Scanner(System.in);

        System.out.println("ingrese una frase : ");
        frase=scanner.nextLine();
        System.out.println("la tamaño de la frase es: "+frase.length());

        for (int j = 0; j <frase.length() ; j++) {
            char opcion=frase.charAt(j);
            switch (opcion){
                case 'a':a+=1;break;
                case 'e':e+=1;break;
                case 'i':i+=1;break;
                case 'o':o+=1;break;
                case 'u':u+=1;break;
                default:break;
            }

        }
        System.out.println("la cantidad de vocales a="+a+" la cantidad de vocales e="+e+"\nla cantidad de vocales i="+i+
                " la cantidad de vocales o="+o+"\nla cantidad de vocales u="+u);

    }
}
