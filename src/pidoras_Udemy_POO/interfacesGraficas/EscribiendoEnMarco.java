package pidoras_Udemy_POO.interfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String[] args) {

        MarcoTexto miMarco = new MarcoTexto();
        miMarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}

class MarcoTexto extends JFrame {

    public MarcoTexto() throws HeadlessException {

        setBounds(400, 200, 600, 450);
        setTitle("Escritura en JFrame");
        setVisible(true); // Hay que ponerla siempre en último lugar

        // En el constructor del marco incluimos el panel que hemos creado
        PrimerPanel miLamina= new PrimerPanel();
        add(miLamina);

    }
}

class PrimerPanel extends JPanel {

    // El método pertenece a JComponent, clase padre de JPanel, para poder utilizarlo sin tener que instanciarlo
    // tenemos que incluirlo dentro del constructor
    public PrimerPanel(){
        setBackground(Color.black);
    }

    // Sobreescribir este método que está en la clase JPanel que invalida al comportamiento que viene de la api
    public void paintComponent(Graphics g) {
        super.paintComponent(g);// pero con esta instrucción lo recuperamos

        // Asignar color al texto que aparecerá (consultar clases if necessary)
        Color miColor= new Color(25,200,5);
        g.setColor(miColor);// Se establece a través del método de la clase Graphics

        // Establecemos el tipo de letra
        Font letra= new Font("Verdana", Font.BOLD | Font.ITALIC,20);
        g.setFont(letra);


        g.drawString("Primer Panel", 190, 60);// Y además añadimos nuevo comportamiento
        // Todos estos pasos son recomendados en la API de Java

    }


}
