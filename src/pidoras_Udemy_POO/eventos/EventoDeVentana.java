package pidoras_Udemy_POO.eventos;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoDeVentana {

    public static void main(String[] args) {

        MarcoEventoVentana miVentana = new MarcoEventoVentana();
        miVentana.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        miVentana.addWindowListener(new EventosDeVentana());

    }

}

class MarcoEventoVentana extends JFrame {

    public MarcoEventoVentana() {

        setBounds(300, 300, 600, 350);
        setVisible(true);

    }

}

class EventosDeVentana extends WindowAdapter {


    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Gracias por trabajar con nuestra app");
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Se ha abierto la ventana");
    }


}
