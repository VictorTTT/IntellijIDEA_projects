package pildoras_paquete_por_defecto;

import javax.swing.*;
import java.util.Scanner;

public class AreasGeom�tricas
{



        public static void main(String[] args)
        {
            Scanner read = new Scanner(System.in);
            //creamos objeto de la clase Scanner

            System.out.println("Elige una opci�n:\n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo\n4: C�rculo");
            //Aqu? tenemos una forma sencilla de presentar una lista con \n
            //para una posterior secuencia de opciones switch

            int figura = read.nextInt();
            //almacenamos lo introducido por consola en variable entera
            //para la selecci�n del switch.
            //el m�todo nextInt no es est�tico por eso necesitamos crear
            //un objeto de la clase Scanner(linea 8).

            switch (figura)
            {
                case 1:

                    int lado = Integer.parseInt(JOptionPane.showInputDialog("introduce el lado"));
                    //como el m�todo showInputDialog es est�tico, no  necesito
                    //crear un objeto pero s� hay que poner antes de �l la clase
                    //a la que pertenece.
                    //Adem�s, como lo que se introduce en la ventana resulta ser
                    //un string, debemos utilizar el m�todo parseInt de la clase
                    //Integer de la forma que arriba se describe.

                    System.out.println("El �rea del cuadrado es " + Math.pow(lado, 2));

                    break;

                case 2:

                    int base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base del ract�ngulo"));
                    //p�same a entero lo que el usuario introduzca en un showinputdialog

                    int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura del rect�ngulo"));

                    System.out.println("El �rea del rect?ngulo es" + base * altura);

                    break;

                case 3:

                    //como la selecc�on entrar� solamente en  un case, podemos utilizar el mismo nombre de variable en distintos cases

                    base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base del tri�ngulo"));

                    altura=Integer.parseInt(JOptionPane.showInputDialog("introduce la altura del tri�ngulo"));
                    //////
                    System.out.println("El �rea del tri�ngulo es "+(base*altura)/2);

                    break;

                case 4:

                    int radio=Integer.parseInt(JOptionPane.showInputDialog("introduce el radio"));

                    System.out.print("El ares del c�rculo es ");
                    //Imprimimos mensaje SIN salto de linea

                    System.out.printf("%1.2f",Math.PI*(Math.pow(radio,2)));
                    //Imprimimos con formato de dos decimales la constante de clase Math.PI
                    //*el radio al cuadrado usando el m�todo pow de la clase Math.

                    break;

                default:

                    System.out.println("La opci�n no es correcta");
                }
            }




        }