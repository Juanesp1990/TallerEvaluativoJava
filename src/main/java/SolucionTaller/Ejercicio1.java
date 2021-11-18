package SolucionTaller;

public class Ejercicio1 {
    public static void main (String[] args) {
        int numero1=3;
        int numero2=3;

        if (numero2 > numero1) {
            System.out.println("El numero: "+numero2+" Es mayor que el numero: "+numero1);
        }else if (numero1>numero2){
            System.out.println("El numero: "+numero1+" Es mayor que el numero: "+numero2);
        }else{
            System.out.println("El numero: "+numero2+" Es igual al numero: "+numero1);
        }
    }
}
