package SolucionTaller;

public class Ejercicio6 {

    public static void main (String[] args) {
        String pares = "";
        String impares = "";
        for (int i = 0; i <101 ; i++) {
            if (i % 2 == 0) {
                pares += i + ",";
            } else {
                impares += i + ",";
            }

        }

        System.out.println("los numeros impares:" + "\n" + impares);
        System.out.println("los numeros pares:" + "\n" + pares);
    }







}
