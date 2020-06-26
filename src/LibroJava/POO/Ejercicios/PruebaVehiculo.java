package LibroJava.POO.Ejercicios;

import java.util.Scanner;

import static VictorTTT_Metodos.Consola.detenerConsola;

public class PruebaVehiculo {

    public static void main(String[] args) {

        System.out.println("Hola, esto es un programa que hace circular bicicletas y coches," +
                " además, guarda un registro de los kilómetros que se recorren tanto individual como " +
                "grupalmente");

        detenerConsola();

        Bicicleta canyon = new Bicicleta();
        Coche passat = new Coche();

        Scanner entrada = new Scanner(System.in);
        int seleccion;
        int kilometrosIntroducidos;

        do {

            System.out.println("Por favor, elija una de las siguientes opciones:\n\n\n" +
                    "VEHÍCULOS\n" +
                    "=========\n" +
                    "1. Anda con la bicicleta\n" +
                    "2. Haz el caballito con la bicicleta\n" +
                    "3. Anda con el coche\n" +
                    "4. Quema rueda con el coche\n" +
                    "5. Ver kilometraje de la bicicleta\n" +
                    "6. Ver kilometraje del coche\n" +
                    "7. Ver kilometraje total\n" +
                    "8. Salir");

            seleccion = entrada.nextInt();
            entrada.nextLine();

            switch (seleccion) {

                case 1:

                    System.out.println("Has elegido hacer este viaje en bicicleta, introduce la distancia que has recorrido\n");
                    canyon.setKilometrosRecorridos(kilometrosIntroducidos = entrada.nextInt());
                    entrada.nextLine();

                    break;

                case 2:

                    System.out.println("Vamos a hacer un caballito con la bicicleta:\n");
                    detenerConsola();

                    canyon.hacerCaballito();

                    break;

                case 3:

                    System.out.println("Has elegido hacer este viaje en coche, introduce la distancia que has recorrido\n");
                    passat.setKilometrosRecorridos(kilometrosIntroducidos = entrada.nextInt());
                    entrada.nextLine();

                    break;
                case 4:

                    System.out.println("Vamos a hacer trompos con el coche:\n");
                    detenerConsola();
                    passat.quemarRueda();

                    break;

                case 5:

                    System.out.println("Los kilómetros que se han recorrido con la bicicleta son:\n" + canyon.getKilometrosRecorridos());

                    break;

                case 6:

                    System.out.println("Los klómetros que se han recorrido con el coche son: \n" + passat.getKilometrosRecorridos());

                    break;

                case 7:

                    System.out.println("Se han creado un total de " + Vehiculo.getVehiculosCreados() + " \n");
                    System.out.println("La suma de kilómetros que han recorrido todos los vehículoses: \n" + Vehiculo.getKilometrosTotales());

                    break;


            }

        } while (seleccion != 8);

        System.out.println("Muchas gracias por utilizar este sencillo programa");


    }


}
