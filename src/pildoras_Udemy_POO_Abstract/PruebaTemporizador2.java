package pildoras_Udemy_POO_Abstract;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class PruebaTemporizador2 {

    public static void main(String[] args) {

        // Creamos un objeto que instantaneamente ejecuata el constructor de la clase Reloj,
        Reloj miReloj = new Reloj();

        miReloj.ejecutarTemporizador(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsar aceptar para terminar");
    }
}

class Reloj {

    public void ejecutarTemporizador(int intervalo, boolean sonido) {

        Timer miTemporizador = new Timer(intervalo, e -> {

            Date ahora = new Date();

            System.out.println("Te pongo la hora cada 3 segundos " + ahora);

            if (sonido) Toolkit.getDefaultToolkit().beep();
        });

        miTemporizador.start();

    }

}
