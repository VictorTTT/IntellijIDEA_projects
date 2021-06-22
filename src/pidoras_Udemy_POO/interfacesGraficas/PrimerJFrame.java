package pidoras_Udemy_POO.interfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class PrimerJFrame {

    public static void main(String[] args) {

        /*JFrame ventana = new JFrame();
        ventana.setSize(400,200);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setLocation(600,350);
        ventana.setVisible(true);*/

        MiJframe ventana2 = new MiJframe();

    }
}

class MiJframe extends JFrame {

    public MiJframe() {

        // setBounds(600, 350, 450, 450); // Con este m�todo primero se especifica la ubicaci�n y luego la dimensi�n
        setResizable(false); // Evitamos redimensi�n
        setExtendedState(MAXIMIZED_BOTH); // Para que se abra a pantalla completa
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Decir lo que va a hacer la x de cerrar
        setTitle("Ventana de Java");
        Toolkit miSistema = Toolkit.getDefaultToolkit(); // Almacenamos en variable las caracter�sticas de nuestro hardware
        Image miIcono = miSistema.getImage("src/pidoras_Udemy_POO/interfacesGraficas/abstract-2675672_640.png"); // Para cambiar imagen por defecto usamos clase Image con la instancia Toolkit
        // creada anteriormente y le pasamos el nombre de el archivo que contiene la imagen
        setIconImage(miIcono); // usamos el m�todo de la clase image que establece el nuevo icono y le pasamos por par�metro la instancia anterior
        setVisible(true); // Esta instrucci�n siempre al final


    }
}

