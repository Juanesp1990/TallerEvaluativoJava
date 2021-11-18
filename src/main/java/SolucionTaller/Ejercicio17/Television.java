package SolucionTaller.Ejercicio17;

public class Television extends Electrodomestico{
private int resolucion=20;
private boolean sintonizadorTdt=false;

    public Television () {
    }

    public Television (int peso, double precioBase) {
        super(peso, precioBase);
    }

    public Television (int peso, double precioBase, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTdt) {
        super(peso, precioBase, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public int getResolucion () {
        return resolucion;
    }

    public boolean isSintonizadorTdt () {
        return sintonizadorTdt;
    }

    @Override
    public double PrecioFinal () {
        double precioTelevisor=0;
        if (resolucion >40) {
            precioTelevisor=super.PrecioFinal()*0.3;
        }
        if (sintonizadorTdt ) {
            precioTelevisor+=50;

        }
        return super.PrecioFinal()+precioTelevisor;
    }
}
