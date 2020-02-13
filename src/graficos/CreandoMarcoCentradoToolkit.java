package graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentradoToolkit
{
    public static void main(String[] args)
    {
        MarcoCentrado miMarcoCentrado=new MarcoCentrado();

        miMarcoCentrado.setVisible(true);

        miMarcoCentrado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCentrado extends JFrame//clase propia
{
    public MarcoCentrado()//constructor
    {
        Toolkit  miPantalla=Toolkit.getDefaultToolkit();//instanciamos un objeo de la clase Toolkit y lo igualamos a lo
        // que devuelve el m�todo getDefaultToolkit() que es un m�todo est�tico de la clase abstracta toolkit
        //nos proporciona la configuraci�n nativa de nuestro equipo por defecto

        Dimension tamanoPantalla=miPantalla.getScreenSize();//instanciamos un objeto de la clase Dimensi�n
        // y lo igualamos a el objeto miPantalla con el m�todo  getscreenSize de la clase Dimension
        //con esta combinaci�n de instrucciones conseguimos que Java tome la configuraci�n de nuestra pantalla
        // y nos diga cu�l es

        int alturaPantalla=tamanoPantalla.height;//height es un campo de la clase Dimensi�n y lo utilizamos para saber el
        // alto de nuestra pantalla

        int anchoPantalla=tamanoPantalla.width;//width es un camp de la clase Dimensi�n y lo utilizamos
        //para saber el ancho de nuestra pantalla

        setSize(anchoPantalla/2,alturaPantalla/2);//le estamos daando a MiMarco unas dimensiones
        // correspondientes a la mitad del alto y a la mitad del ancho de mi pantalla

        setLocation(anchoPantalla/4,alturaPantalla/4);//estamos dic�ndole que coloque la eaquina de referencia
        // de la ventana (que es la superior izquierda) a un cuarto del ancho y a un cuarto del alto, consiguiendo as�
        // que quede totalmente centrada respecto a nuestra pantalla
    }
}
