package LibroJava.POO.Ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static VictorTTT_Metodos.Consola.detenerConsola;

public class PruebaAnimal {
    public static void main(String[] args) {

        ArrayList<Gato> gatos =new ArrayList<>();

        System.out.println("Este programa permite crear animalitos");
        //detenerConsola();
        Scanner entrada = new Scanner(System.in);
        int seleccion = entrada.nextInt();
        entrada.nextLine();
        String sexo;


        do {
            System.out.println("Elige el animal que quieres crear: \n\n" +
                    "1------> Quiero crear un gato\n" +
                    "2------> Quiero crear un perro\n" +
                    "3------> Quiero crear un canario\n" +
                    "4------> Quiero crear un pinguino\n" +
                    "5------> Quiero crear un lagarto\n\n" +
                    "6------> Salir del programa");


            switch (seleccion) {

                case 1:
                    Gato gato1 =new Gato();
                    System.out.println("Has elegido crear un gatito, perfecto!");

                    System.out.print("Elige su nombre: ");gato1.setNombre(entrada.nextLine());

                    System.out.print("Elige su sexo (Macho o hembra)");sexo =entrada.nextLine();
                    if (sexo.equalsIgnoreCase("macho")){
                        gato1.setSexo(Animal.Sexo.MACHO);
                    }else gato1.setSexo(Animal.Sexo.HEMBRA);

                    System.out.println();

                    break;

            }
        }while(seleccion!=6);
    }


}


