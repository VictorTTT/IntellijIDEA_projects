package pildoras_Udemy_POO_Abstract;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class Prueba_temporizador {

    public static void main(String[] args) {

        // Utilizaremos la clase Timer del paquete swing de la api de Java
        // esta clase implementa la interfaz Serializable.
        // Ver descripción en: https://docs.oracle.com/javase/8/docs/api/

        // Creamos un objeto de la clase Temporizador que implementa la interfaz ActionListener
        // esa interfaz nos obliga a desarrollar un método

        //Temporizador oyente = new Temporizador();

        Timer miTemporizador = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date horaActual= new Date();

                System.out.println("Hola alumnos son las " + horaActual );
            }
        });

        miTemporizador.start();// Hasta aquí funcionaría pero acabaría antes de poder imprimir una sola vez
        // debido al transcurso de los primeros 5 segundos hasta retraso de evento que hemos programado.


        // para solucionarlo:
        JOptionPane.showMessageDialog(null, "Deteniendo la finalización del programa");


        // OTRA FORMA DE HACER ESTE PROGRAMA:




    }
}


/*class Temporizador implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

        Date horaActual= new Date();

        System.out.println("Hola alumnos son las " + horaActual );
    }
}*/