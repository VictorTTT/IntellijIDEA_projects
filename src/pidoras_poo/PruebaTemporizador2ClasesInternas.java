package pidoras_poo;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;

public class PruebaTemporizador2ClasesInternas
{
    public static void main(String[] args)
    {
        Reloj miReloj=new Reloj(3000,true);
        //instanciamos miReloj de la clase Reloj que al ser llamada por new
        //nos pide 2 par�metros

        miReloj.enMarcha();
        //con el objeto reci�n creado llamamos al m�todo que hemos creado para poner en funcionamiento el programa

        JOptionPane.showMessageDialog(null,"pulsa aceptar para terminar");
        //para que el programa se quede en ejecuci�n sin finalizar

        System.exit(0);
        //Para que el programa finalice una vez pulsemos aceptar en la ventana
    }
}

class Reloj
{
    public Reloj(int intervalo, boolean sonido)
    //m�todo constructor de la clase reloj que recibe 2 par�metros
    //de forma que cada vez que instanciemos un objeto de esta clase,
    // a la hora de invocar al constructor despu�s de la palabra new,
    // deberemos pasarle esos dos argumentos para crearlo.Por un lado el intervalo,
    // con el que vamos a decidir cada cu�nto tiempo vamos a imprimir en pantalla
    //y por otro el sonido de tipo boolean que decidir� si pita o no.
    {
        this.intervalo=intervalo;

        this.sonido=sonido;

        //Desde el constructor damos estado inicial a los campos privados que hay en la clase Reloj
        //con this. nos referimos al campo de clase que se llama igual que los argumentos que le pasamos al constructor
    }

    public void enMarcha()
    //este m�todo setter void porque no devuelve nada se encarga de poner en funcionamiento el programa
    {
       ActionListener oyente=new DameLaHora2();//DameLaHora2 es una clase interna
        //instanciamos objeto oyente perteneciente a la interfaz action listener
       Timer mitemporizador=new Timer(intervalo,oyente);
       //instanciamos objeto de la clase timer que nos pide 2 argumentos
        //por un lado el intervalo de tiempo con el que va actuar en milisegundos
        //por otro un, objeto de tipo interfaz ActionListener (arriba declarado)

        mitemporizador.start();////le decimos al programa que comience a ejecutar
        // la instrucci�n mitemporizador,
        //para ello utilizamos el m�todo start() perteneciente a la clase timer

    }

    private int intervalo;//campo encapsulado de la clase Reloj

    private boolean sonido;//campo encapsulado de la clase Reloj

    private class DameLaHora2 implements ActionListener
    //esto es una clase interna que lleva el modificador de acceso private, este modificador solamente pueden llevarlo estas clases
    //adem�s debemos implementar la interfaz ActionListener que a su vez nos obliga a crear los m�todos que desarrolla e la API
    {

        public void actionPerformed(ActionEvent evento)
        {
            Date ahora=new Date();
            //con este m�todo de la clase date estamos almacenando la hora actual en el objeto ahora

            System.out.printf("te pongo la hora cada 3 seg  "+ahora);
            //damos formato a la salida por pantalla y concatenamos con con el objeto que contiene la hora

            if (sonido)//si el usuario ha decidido que se emita un sonido la condici�n ser� cierta
            {
                Toolkit.getDefaultToolkit().beep();
                //se reproduce sonido a trav�s del m�todo getDefaultToolkit().beep() de la clase Toolkit
            }//en este if est� la clave y el sentido de este programa, ya que estamos usando como condici�n un ejemplar
            // de clase que es exterior a la clase en la que ahora nos encontramos. sonido est� definido fuera de DameLaHora2
            //esto podemos hacerlo gracias a que una clase interna puede acceder a lo que hay fuera de ella SIN NECESIDAD DE M�TODO ALGUNO
        }
    }

}
