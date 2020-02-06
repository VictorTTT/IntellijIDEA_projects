package paquete_por_defecto;

import javax.swing.*;

public class AccesoAplicacionWhile
{
    public static void main(String[] args)
    {
        String clave ="Enzo";

        String pass="";//"ejemplo de variable declarada pero vac�a"

        int contador=0;

        while(!clave.equals(pass))
        {//mientras que el texto clave no sea igual al texto pass...
            //por lo tanto siempre va a entrar porque la cadena est� vac�a

            pass= JOptionPane.showInputDialog("introduce la contrase�a, por favor\n");

            if(!clave.contentEquals(pass))
            {
                System.out.println("Contrase�a incorrecta\n");
                contador++;
            }
            else
            {
                System.out.println("Has acertado a la "+contador+"vez\n");
            }

            if(contador==3)
            {
                System.out.println("hasta aqu� hemos llegado\n");
                break;
            }


        }

        System.out.println("El programa ha terminado");
        }
    }

