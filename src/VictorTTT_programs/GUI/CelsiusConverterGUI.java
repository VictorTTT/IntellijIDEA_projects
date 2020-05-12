package VictorTTT_programs.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*Tutorial tomado de
* https://www.youtube.com/watch?v=-SmNpKskfJc*/

public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField centigradosCampo;
    private JLabel centígradosCampo;
    private JButton botonConvertir;
    private JLabel farenheitCampo;

    public CelsiusConverterGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        botonConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*Tomar el texto de los centígrados
                * convertirlo a double
                * aplicar la fórmula de conversión
                * actualizar  farenheit*/
                int tempFarenheit= (int)(Double.parseDouble(centigradosCampo.getText())*1.8+32);
                farenheitCampo.setText(tempFarenheit+" Farenheit");
            }
        });
    }

    public static void main(String[] args) {

        JFrame ventana=new CelsiusConverterGUI("Mi convertidor de grados centígrados");
        ventana.setVisible(true);

    }


}
