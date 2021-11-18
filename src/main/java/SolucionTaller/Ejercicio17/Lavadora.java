package SolucionTaller.Ejercicio17;

public class Lavadora extends Electrodomestico{
    private int carga=5;

    public Lavadora(){

    }

    public Lavadora (int peso, double precioBase) {
        super(peso, precioBase);
    }

    public Lavadora (int peso, double precioBase, char consumoEnergetico, String color, int carga) {
        super(peso, precioBase, consumoEnergetico, color);
        this.carga = carga;
    }

    public int getCarga () {
        return carga;
    }

    ;

    @Override
    public double PrecioFinal () {
        double precioLavadora=0;
        if (carga >30) {
            precioLavadora=50;
        }
        return super.PrecioFinal()+precioLavadora;
    }
}
