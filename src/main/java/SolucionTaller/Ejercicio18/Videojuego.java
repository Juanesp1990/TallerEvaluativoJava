package SolucionTaller.Ejercicio18;

public class Videojuego implements Entregable{
    private String titulo;
    private int horasEstimadas=10;
    private boolean entregado=false;
    private String genero;
    private String compania;

    public Videojuego () {
    }

    public Videojuego (String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego (String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo () {
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas () {
        return horasEstimadas;
    }

    public void setHorasEstimadas (int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero () {
        return genero;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public String getCompania () {
        return compania;
    }

    public void setCompania (String compania) {
        this.compania = compania;
    }

    @Override
    public String toString () {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compania + '\'' +
                '}';
    }

    @Override
    public boolean entregar () {
        entregado=true;
        return entregado;
    }

    @Override
    public boolean devolver () {
        entregado=false;
        return entregado;
    }

    @Override
    public boolean isEntregado () {
        if(entregado){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int compareTo (Object a) {
        int comparar = ((Integer) horasEstimadas).compareTo(((Videojuego) a).getHorasEstimadas());
        return comparar;

    }
}