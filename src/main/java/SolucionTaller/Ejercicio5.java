package SolucionTaller;

public class Ejercicio5 {
    public static void main (String[] args) {
        String pares = "";
        String impares = "";
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                pares += i + ",";
            } else {
                impares += i + ",";
            }
            i++;
        }
        System.out.println("los numeros impares:" + "\n" + impares);
        System.out.println("los numeros pares:" + "\n" + pares);
    }
}
