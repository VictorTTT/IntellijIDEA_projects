package pildoras_paquete_por_defecto;

import javax.swing.*;
import java.util.Scanner;

public class AreasGeométricas
{



        public static void main(String[] args)
        {
            Scanner read = new Scanner(System.in);
            //creamos objeto de la clase Scanner

            System.out.println("Elige una opción:\n1: Cuadrado \n2: Rectángulo \n3: Triángulo\n4: Círculo");
            //Aqu? tenemos una forma sencilla de presentar una lista con \n
            //para una posterior secuencia de opciones switch

            int figura = read.nextInt();
            //almacenamos lo introducido por consola en variable entera
            //para la selección del switch.
            //el método nextInt no es estático por eso necesitamos crear
            //un objeto de la clase Scanner(linea 8).

            switch (figura)
            {
                case 1:

                    int lado = Integer.parseInt(JOptionPane.showInputDialog("introduce el lado"));
                    //como el método showInputDialog es estático, no  necesito
                    //crear un objeto pero sí hay que poner antes de él la clase
                    //a la que pertenece.
                    //Además, como lo que se introduce en la ventana resulta ser
                    //un string, debemos utilizar el método parseInt de la clase
                    //Integer de la forma que arriba se describe.

                    System.out.println("El área del cuadrado es " + Math.pow(lado, 2));

                    break;

                case 2:

                    int base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base del ractángulo"));
                    //pásame a entero lo que el usuario introduzca en un showinputdialog

                    int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura del rectángulo"));

                    System.out.println("El área del rect?ngulo es" + base * altura);

                    break;

                case 3:

                    //como la seleccíon entrará solamente en  un case, podemos utilizar el mismo nombre de variable en distintos cases

                    base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base del triángulo"));

                    altura=Integer.parseInt(JOptionPane.showInputDialog("introduce la altura del triángulo"));
                    //////
                    System.out.println("El área del triángulo es "+(base*altura)/2);

                    break;

                case 4:

                    int radio=Integer.parseInt(JOptionPane.showInputDialog("introduce el radio"));

                    System.out.print("El ares del círculo es ");
                    //Imprimimos mensaje SIN salto de linea

                    System.out.printf("%1.2f",Math.PI*(Math.pow(radio,2)));
                    //Imprimimos con formato de dos decimales la constante de clase Math.PI
                    //*el radio al cuadrado usando el método pow de la clase Math.

                    break;

                default:

                    System.out.println("La opción no es correcta");
                }
            }




        }