package LibroJavaEjercicios;

import java.util.Scanner;

public class EntreadaDatosObtenerMediaAritmetica
{
    public static void main(String[] args)
    {
        System.out.println(" Introduce 3 números separados por un espacio" +
                " pueden contener decimales, después te mostraremos la media ");

        Scanner entrada=new Scanner(System.in);

        double n1=entrada.nextDouble();

        double n2=entrada.nextDouble();

        double n3=entrada.nextDouble();

        //Cuando introduciomes decimales por consola hay que indicarlos con la coma
        //aunque dentro de java sea on el punto. Si ponemos punto desde consola dará error

        double media=(n1+n2+n3)/3;

        System.out.println("Has introducido "+ n1 + n2 + n3 +"y la media entre ellos es  " +media);

    }
}
