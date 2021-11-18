package SolucionTaller.Ejercicio17;

import java.util.Locale;

public class Electrodomestico {

    protected int peso = 5;
    protected double precioBase = 100;
    protected char consumoEnergetico = 'F';
    protected String color = "BLANCO";
    protected double precioTotal=0;

    public Electrodomestico () {
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color.toUpperCase(Locale.ROOT));
    }

    public Electrodomestico (int peso, double precioBase) {
        this.peso = peso;
        this.precioBase = precioBase;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color.toUpperCase(Locale.ROOT));
    }

    public Electrodomestico (int peso, double precioBase, char consumoEnergetico, String color) {
        this.peso = peso;
        this.precioBase = precioBase;
        this.consumoEnergetico = consumoEnergetico;
        this.color = color;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(this.color.toUpperCase(Locale.ROOT));
    }

    public int getPeso () {
        return peso;
    }

    public double getPrecioBase () {
        return precioBase;
    }

    public char getConsumoEnergetico () {
        return consumoEnergetico;
    }

    public String getColor () {
        return color;
    }



    private char comprobarConsumoEnergetico (char letra) {
        switch (letra) {
            case 'A':
                return letra;
            case 'B':
                return letra;
            case 'C':
                return letra;
            case 'D':
                return letra;
            case 'E':
                return letra;
            default:
                return 'F';
        }
    }

    private String comprobarColor (String color) {
        switch (color) {
            case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {
                return color;
            }
            default -> {
                return "BLANCO";
            }
        }
    }

    public double PrecioFinal () {
        double preciofinal = precioBase;

        if (consumoEnergetico == 'A') {
            preciofinal += 100;
        } else if (consumoEnergetico == 'B') {
            preciofinal += 80;
        } else if (consumoEnergetico == 'C') {
            preciofinal += 60;
        } else if (consumoEnergetico == 'D') {
            preciofinal += 50;
        } else if (consumoEnergetico == 'E') {
            preciofinal += 30;
        } else {
            preciofinal += 10;
        }

        if (peso <= 19) {
            preciofinal += 10;
        } else if (peso >= 20 && peso <= 49) {
            preciofinal += 50;
        } else if (peso >= 50 && peso <= 79) {
            preciofinal += 80;
        } else {
            preciofinal += 100;
        }
        precioTotal=preciofinal;
        return preciofinal;
    }
}
