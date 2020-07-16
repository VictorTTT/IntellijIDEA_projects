package LibroJava.POO.Ejercicios;
/*El menú del programa debe ser el que se muestra a continuación. Cuando
elegimos la opción 2, se nos debe preguntar para qué zona queremos las
entradas y cuántas queremos. Lógicamente, el programa debe controlar que
no se puedan vender más entradas de la cuenta.

1. Mostrar número de entradas libres
2. Vender entradas
3. Salir*/

import java.util.Scanner;

public class ZonaMain {
    public static void main(String[] args) {

        System.out.println("Este programa getiona la venta de entradas\n" +
                "de Expocoches Campanillas");

        Scanner entrada = new Scanner(System.in);
        int seleccion;

        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        do {
            System.out.println("Por favor, seleccione una de las siguientes opciones:\n\n" +
                    "1. Mostrar número de entradas libres\n" +
                    "2. Vender entradas\n" +
                    "3. Salir");
            seleccion = entrada.nextInt();
            entrada.nextLine();

            switch (seleccion) {
                case 1:

                    System.out.println("Actualmente, estas son las entradas disponibles en cada zona: ");
                    System.out.println("En la sala principal quedan " + principal.getEntradasPorVender());
                    System.out.println("En la zona de compra venta quedan " + compraVenta.getEntradasPorVender());
                    System.out.println("En la zona vip quedan: " + vip.getEntradasPorVender());

                    break;

                case 2:


                    do {

                        System.out.println("¿Para qué zona quiere las estradas?");
                        System.out.println("1. Sala principal\n" +
                                "2. Zona Compra-Venta\n" +
                                "3. Zona Vip\n" +
                                "4. Salir de la compra de entradas");
                        seleccion = entrada.nextInt();
                        entrada.nextLine();

                        if (seleccion == 1) {
                            System.out.println("Usted ha elegido la sala prinipal, cuantas entradas desea?");
                            principal.vender(entrada.nextInt());
                            entrada.nextLine();
                            break;
                        } else if (seleccion == 2) {
                            System.out.println("Usted ha elegido la Zona de Compra-Venta, cuantas entradas desea?");
                            compraVenta.vender(entrada.nextInt());
                            entrada.nextLine();
                            break;
                        } else if (seleccion == 3) {
                            System.out.println("Usted ha elegido la Zona V.I.P, cuantas entradas desea?");
                            vip.vender(entrada.nextInt());
                            entrada.nextLine();
                            break;
                        }

                    } while (seleccion != 4);


                    break;


            }

        } while (seleccion != 3);

        System.out.println("Muchas gracias por utilizar este programa");
    }
}
