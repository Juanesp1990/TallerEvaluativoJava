package SolucionTaller.Ejercicio16;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        String nombre;
        int edad;
        char sexo;
        double peso, altura;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese su Sexo M-mujer H-hombre: ");
        sexo = scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0);
        System.out.println("Ingrese su peso: ");
        peso = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese su altura en metros: ");
        altura = Double.parseDouble(scanner.nextLine());

        Persona personaUno = new Persona(nombre, edad, sexo, peso, altura);
        Persona personaDos = new Persona(nombre, edad, sexo);
        Persona personaTres = new Persona();

        personaTres.setNombre("Juan Esteban");
        personaTres.setEdad(25);
        personaTres.setSexo('M');
        personaTres.setPeso(80.5);
        personaTres.setAltura(1.7);

        ImplementarMetodos(personaUno);
        ImplementarMetodos(personaDos);
        ImplementarMetodos(personaTres);

    }

    public static void ImplementarMetodos(Persona persona){
        int valorImc;

        valorImc=persona.CalcularIMC();
        if (valorImc==-1) {
            System.out.println("La persona esta por debajo del peso");
                    }
        else if (valorImc==0){
            System.out.println("El peso es el ideal");
        }else{
            System.out.println("la persona esta por encima del peso ideal (sobrepeso)");
        }

        if (persona.EsMayorDeEdad()){
            System.out.println("la persona es mayor de edad");
        }
        System.out.println(persona.toString());
        System.out.println("*****************************************************\n\n");
    }
}
