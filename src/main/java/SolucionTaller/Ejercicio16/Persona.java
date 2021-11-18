package SolucionTaller.Ejercicio16;

public class Persona {

    private char sexo = 'H';
    private int edad;
    private double peso;
    private double altura;
    private String nombre;
    private String dni = "";

    public Persona () {
        dni = GenerarDNI();
    }

    public Persona (String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        dni = GenerarDNI();
    }

    public Persona (String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        dni = GenerarDNI();
    }

    public void setSexo (char sexo) {
        this.sexo = sexo;
    }
    public void setEdad (int edad) {
        this.edad = edad;
    }
    public void setPeso (double peso) {
        this.peso = peso;
    }
    public void setAltura (double altura) {
        this.altura = altura;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public int CalcularIMC () {
        double imc = (peso / (Math.pow(altura, 2)));
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean EsMayorDeEdad () {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    protected void ComprobarSexo () {

        switch (sexo) {
            case 'm' -> setSexo('M');
            default -> setSexo('H');
        }

    }

    @Override
    public String toString () {
        return "Persona (" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ')';
    }

    protected String GenerarDNI () {
        int limiteDni = 99999999;
        int numero = (int) (Math.random() * limiteDni) + 1;
        char letra = GenerarLetra(numero);
        String dniCompleta = "" + numero + letra;
        return dniCompleta;
    }

    protected char GenerarLetra (int numeroDni) {
        if (numeroDni < 23) {
            numeroDni = 23;
        }

        int moduloDni = numeroDni % 23;

        switch (moduloDni) {
            case 0:
                return 'T';
            case 1:
                return 'R';
            case 2:
                return 'w';
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';
            case 7:
                return 'F';
            case 8:
                return 'P';
            case 9:
                return 'D';
            case 10:
                return 'X';
            case 11:
                return 'B';
            case 12:
                return 'N';
            case 13:
                return 'J';
            case 14:
                return 'Z';
            case 15:
                return 'S';
            case 16:
                return 'Q';
            case 17:
                return 'V';
            case 18:
                return 'H';
            case 19:
                return 'L';
            case 20:
                return 'C';
            case 21:
                return 'K';
            case 22:
                return 'E';
            default:
                return 'T';
        }
    }
}
