package pidoras_Udemy_POO.interfacesGraficas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class DibujandoEnJframe {
    public static void main(String[] args) {

        MarcoDibujos miMarco = new MarcoDibujos();
        miMarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

class MarcoDibujos extends JFrame {

    public MarcoDibujos() {

        setBounds(300, 300, 800, 450);
        LaminaDibujos laminaDibujos = new LaminaDibujos();
        add(laminaDibujos);

        setVisible(true);

    }

}

class LaminaDibujos extends JPanel {

    // Para el buen funcionamiento de la clase que hereda de JPanel hay que sobreescribir este método
    public void paintComponent(Graphics graphics) {
        // Y llamar al método de la clase padre, pasándole el parámetro que recibe arriba
        super.paintComponent(graphics);

        // Vamos a trabjar con un objeto de tipo grafics 2d,como lo que recibimos es un objeto graphics
        // lo primero que hacemos es castearlo.
        Graphics2D g2 = (Graphics2D) graphics;

        //2. Después instanciamos la clase Rectangle2D pero como es una clase abstracta tenemos que
        // llamar a un constructor de su cadena de herencia que no lo sea, por eso se utiliza
        // rectangle 2d.Double
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);

        // 3.Ahora a aumentar el grosor
        //g2.setStroke(new BasicStroke(4));

        float[] midash = {10.0f};

        setBackground(Color.BLACK);
        setForeground(Color.GREEN);
        // El método setPaint pide argumento (Paint) el cual es una interfaz.
        // Lo que hacemos es pasar una clase (Color) que la implementa
        g2.setPaint(Color.BLUE);
        g2.setStroke(new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, midash, 0));
        g2.drawString("Mira qué coloritos tan monos que acabo de hacer",20,20);
        g2.draw(rectangulo);


    }


}


