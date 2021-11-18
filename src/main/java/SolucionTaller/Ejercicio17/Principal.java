package SolucionTaller.Ejercicio17;

public class Principal {
    public static void main (String[] args) {
        double sumaLavadores=0,sumaTelevisores=0,sumaElectrodomesticos=0;

        Electrodomestico []electrodomestico= new Electrodomestico[10];

        electrodomestico[0]=new Electrodomestico(80,100,'C',"GRIS");
        electrodomestico[1]=new Lavadora(5,200,'A',"ROJO",30);
        electrodomestico[2]=new Television(30,150);
        electrodomestico[3]=new Electrodomestico(80,100,'A',"BLANCO");
        electrodomestico[4]=new Lavadora(10,100,'B',"NEGRO",30);
        electrodomestico[5]=new Television(10,150);
        electrodomestico[6]=new Electrodomestico(80,40,'F',"BLANCO");
        electrodomestico[7]=new Lavadora(5,50,'D',"AZUL",30);
        electrodomestico[8]=new Television(10,150);
        electrodomestico[9]=new Electrodomestico(80,15,'A',"BLANCO");

        sumaLavadores=electrodomestico[1].PrecioFinal()+electrodomestico[4].PrecioFinal()+electrodomestico[7].PrecioFinal();
        sumaTelevisores=electrodomestico[2].PrecioFinal()+electrodomestico[5].PrecioFinal()+electrodomestico[8].PrecioFinal();
        sumaElectrodomesticos=electrodomestico[0].PrecioFinal()+electrodomestico[3].PrecioFinal()+
                electrodomestico[6].PrecioFinal()+electrodomestico[9].PrecioFinal()+sumaLavadores+sumaTelevisores;

        System.out.println("la suma total de los electrodomesticos es:"+sumaElectrodomesticos);
        System.out.println("la suma total de las lavadoras es:"+sumaLavadores);
        System.out.println("la suma total de los televisores es:"+sumaTelevisores);


    }
}
