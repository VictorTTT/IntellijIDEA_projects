package paquete_por_defecto;

import javax.swing.*;

public class AccesoAplicacionWhile
{
    public static void main(String[] args)
    {
        String clave ="Enzo";

        String pass="";//"ejemplo de variable declarada pero vacía"

        int contador=0;

        while(!clave.equals(pass))
        {//mientras que el texto clave no sea igual al texto pass...
            //por lo tanto siempre va a entrar porque la cadena está vacía

            pass= JOptionPane.showInputDialog("introduce la contraseña, por favor\n");

            if(!clave.contentEquals(pass))
            {
                System.out.println("Contraseña incorrecta\n");
                contador++;
            }
            else
            {
                System.out.println("Has acertado a la "+contador+"vez\n");
            }

            if(contador==3)
            {
                System.out.println("hasta aquí hemos llegado\n");
                break;
            }


        }

        System.out.println("El programa ha terminado");
        }
    }

