package pidoras_Udemy_POO.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoSencillo {
    public static void main(String[] args) {

        MarcoColoresBotones miMarco = new MarcoColoresBotones();
        miMarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}


class MarcoColoresBotones extends JFrame {
    public MarcoColoresBotones() throws HeadlessException {

        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);
        LaminaColoresBotones miLamina = new LaminaColoresBotones();
        add(miLamina);

    }
}

class LaminaColoresBotones extends JPanel {

    JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");
    JButton botonVede = new JButton("Verde");

    private class ColorDeFondo implements ActionListener {

        private Color colorDeFondo;
        public ColorDeFondo(Color color){
            this.colorDeFondo=color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }

    }


    public LaminaColoresBotones() {

        add(botonAzul);
        add(botonRojo);
        add(botonVede);

        ColorDeFondo azul= new ColorDeFondo(Color.BLUE);
        ColorDeFondo rojo= new ColorDeFondo(Color.RED);
        ColorDeFondo green= new ColorDeFondo(Color.GREEN);

        botonAzul.addActionListener(azul);
        botonRojo.addActionListener(rojo);
        botonVede.addActionListener(green);

    }


}

