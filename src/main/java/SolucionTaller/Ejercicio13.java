package SolucionTaller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {
    public static void main (String[] args) {
        LocalDateTime tiempo= LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("'('yyyy'/'MM'/'dd')''('kk'/'mm'/'ss')'");
        System.out.println(tiempo);
        System.out.println(tiempo.format(f));
    }
}
