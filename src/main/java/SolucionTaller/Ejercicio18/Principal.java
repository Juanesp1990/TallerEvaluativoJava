package SolucionTaller.Ejercicio18;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Principal {
    public static void main (String[] args) {
        int seriesEntregadas = 0;
        int videojuegoEntregados = 0;
        LinkedList<Serie> listaSeries = new LinkedList<>();
        LinkedList<Videojuego> listaVideojuegos = new LinkedList<>();

        listaSeries.add(new Serie("Mentalista,", "universal"));
        listaSeries.add(new Serie("House", 10, "drama", "universal"));
        listaSeries.add(new Serie("DragonBall", 12, "anime", "Akira Toriyama"));
        listaSeries.add(new Serie("House 2", 11, "drama", "universal"));
        listaSeries.add(new Serie("Caballeros Zodiaco", "Masami Kurumada"));

        listaVideojuegos.add(new Videojuego("Fifa", 100));
        listaVideojuegos.add(new Videojuego("MarioBroos", 100));
        listaVideojuegos.add(new Videojuego("Crash", 120));
        listaVideojuegos.add(new Videojuego("Pacman", 100));
        listaVideojuegos.add(new Videojuego("Halo", 100));

        listaSeries.get(2).entregar();
        listaSeries.get(4).entregar();

        listaVideojuegos.get(1).entregar();
        listaVideojuegos.get(3).entregar();

        for (int i = 0; i < listaSeries.size(); i++) {
            if (listaSeries.get(i).isEntregado()) {
                seriesEntregadas += 1;
                listaSeries.get(i).devolver();
            }

        }

        for (int i = 0; i < listaVideojuegos.size(); i++) {
            if (listaVideojuegos.get(i).isEntregado()) {
                videojuegoEntregados += 1;
                listaVideojuegos.get(i).devolver();
            }

        }

        for (int i = 0; i < listaSeries.size(); i++) {
            int acumulado = 0;
            for (int j = 0; j < listaSeries.size(); j++) {
                int valor = listaSeries.get(i).compareTo(listaSeries.get(j));
                acumulado += valor;
                if (acumulado == 4) {
                    System.out.println("la serie de mas temporadas es: \n" + listaSeries.get(i).toString());
                    break;
                }
            }


        }

        for (int i = 0; i < listaVideojuegos.size(); i++) {
            int acumulado = 0;
            for (int j = 0; j < listaVideojuegos.size(); j++) {
                int valor = listaVideojuegos.get(i).compareTo(listaVideojuegos.get(j));
                acumulado += valor;
                if (acumulado == 4) {
                    System.out.println("El videojuego de mas duración es: \n" + listaVideojuegos.get(i).toString());
                    break;
                }
            }


        }

        System.out.println("el numero de series entregadas es " + seriesEntregadas);
        System.out.println("el numero de videojuegos entregados es " + videojuegoEntregados);
    }
}
