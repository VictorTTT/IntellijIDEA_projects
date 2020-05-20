package Ilerna_POO.Pac_Desarrollo_entregada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);// objeto que utilizaremos para las entradas por pantalla
        String nombreUsuario;//para almacenar el nombre
        int edadUsuario = 0;// para almacenar la edad
        String DNI;// para almacenar el DNI
        int eleccion = 0;// para la elecci�n del men� switch
        String description;// para alamcenar la descripci�n
        double cantidad = 0;// para almacenar la cantidad
        boolean error;// para poder evaluar las diferentes entradas no esperadas

        Usuario usuario = new Usuario();// creamos un �nico usuario

        do {// pedimos el nombre
            System.out.println("Introduce el nombre de usuario");
            nombreUsuario = entrada.nextLine();
            usuario.setNombre(nombreUsuario);// establecemos nombre

        } while (nombreUsuario.isEmpty());// seguimos pidiendo mientras no se introduzca nada

        do {// pedimos la edad
            try {
                error = false;
                System.out.println("Introduce la edad del usuario");
                edadUsuario = entrada.nextInt();
                entrada.nextLine();
            } catch (InputMismatchException ex) {// si el usuario introduce letras en vez de numeros capturamos la excepci�n
                System.out.println("Introduce un valor num�rico mayor que 0\n");// e informamos
                entrada.next();
                error = true;
            }
        } while (edadUsuario <= 0 || error);// seguimos pidiendo mientras la edad introducida tiene un formato no permitido
        usuario.setEdad(edadUsuario);// establecemos edad

        System.out.println("Introduce el DNI del usuario");
        DNI = entrada.nextLine();//establecemos DNI, el m�todo devolver� un booleano si el DNI tiene un formato no v�lido
        while (!usuario.setDNI(DNI)) {// mientras el DNI no es v�lido
            System.out.println("DNI introducido incorrecto\n" +
                    "Introduce el DNI del usuario v�lido");
            DNI = entrada.nextLine();// pedimos el DNI de nuevo y se vuelve a evaluar
        }
        System.out.println("Usuario creado correctamente");

        Cuenta cuentaUsuario = new Cuenta(usuario);// creamos la cuenta pas�ndole el usuario que acabamos de crear

        do {// repite el men�

            do {//repite la selecci�n si lo que se introduce es texto en vez de n�meros.
                try {
                    error = false;//  no hay errores
                    System.out.println("Realiza una nueva acci�n\n" +
                            "1 Introduce un nuevo gasto\n" +
                            "2 Introduce un nuevo ingreso\n" +
                            "3 Mostrar gastos\n" +
                            "4 Mostrar ingresos\n" +
                            "5 Mostrar saldo\n" +
                            "0 Salir");

                    eleccion = entrada.nextInt();//
                    entrada.nextLine();


                } catch (InputMismatchException ex) {// captura el posible error para que no caiga el programa
                    System.out.println("Introduce un n�mero por favor\n");
                    entrada.next();
                    error = true;// hay errores
                }
            } while (error); // repite estructura mientras hay errores


            switch (eleccion) {// recoger� lo que se introduzca por teclado y ejecutar� el c�digo que contenga

                case 0:// finaliza el programa

                    System.out.println("Fin del programa.\n" +
                            "Gracias por utilizar la aplicaci�n.");
                    break;

                case 1://Introduce un nuevo gasto

                    System.out.println("Introduce la descripci�n ");
                    description = entrada.next();// almacena descripci�n introducida

                    do {// repite bloque si lo que se introduce no son n�meros
                        try {
                            error = false;// no hay errores
                            System.out.println("Introduce la cantidad ");
                            cantidad = entrada.nextDouble();// almacena la cantidad introducida


                        } catch (InputMismatchException ex) {// captura el error para que no caiga el programa
                            System.out.println("Introduce un valor num�rico mayor que 0\n");
                            entrada.next();
                            error = true;// hay errores
                        }
                    } while ( error);// evalua si hay errores
                    System.out.println("Saldo restante: "+cuentaUsuario.addGastos(description,cantidad)+"�");
                    //Imprimimos lo que devuelve el m�todo addGastos, en su llamada le pasamos descripci�n y cantidad
                    break;

                case 2:// introduce un nuevo ingreso

                    System.out.println("Introduce la descripci�n ");
                    description = entrada.next();// almacena descripci�n introducida
                    entrada.nextLine();

                    do {// repite bloque si lo que se introduce no son n�meros
                        try {
                            error = false; // no hay errores
                            System.out.println("Introduce la cantidad ");
                            cantidad = entrada.nextDouble();


                        } catch (InputMismatchException ex) {// captura el error para que no caiga el programa
                            System.out.println("Introduce un valor num�rico mayor que 0\n");
                            entrada.next();
                            error = true;// hay errores
                        }
                    } while ( error);// evalua si hay errores
                    System.out.println("Saldo restante: "+cuentaUsuario.addIngresos(description,cantidad)+"�");
                    //Imprimimos lo que devuelve el m�todo addIngresos, en su llamada le pasamos descripci�n y cantidad
                    break;

                case 3:// Mostrar todos los gastos realizados, para hacerlo utilizamos una estructura iterativa
                    // que repetir� la llamada al m�todo getGastos tantas veces como posiciones tenga el array que devuelve
                    for (int i = 0; i < cuentaUsuario.getGastos().size(); i++) {
                        System.out.println(cuentaUsuario.getGastos().get(i));}
                    // Dentro del cuerpo imprimimos cada posici�n del array
                    break;

                case 4:// Mostrar todos los ingresos realizados, para hacerlo utilizamos una estructura iterativa
                    // que repetir� la llamada al m�todo getGastos tantas veces como posiciones tenga el array que devuelve
                    for (int i = 0; i < cuentaUsuario.getIngresos().size(); i++) {
                        System.out.println(cuentaUsuario.getIngresos().get(i));}
                    // Dentro del cuerpo imprimimos cada posici�n del array
                    break;

                case 5:// Mostrar el saldo actual en la cuenta
                    System.out.println("El saldo actual de la cuenta es: " + cuentaUsuario.getSaldo());
                    break;

            }
        } while (eleccion != 0);// mientras le elecci�n sea diferente de 0
    }

}

