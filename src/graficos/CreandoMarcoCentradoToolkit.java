package graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentradoToolkit
{
    public static void main(String[] args)
    {
        MarcoCentrado miMarcoCentrado=new MarcoCentrado();//instancia de la clase propia MarcoCentrado
        //llama al constructor y recibe los m�todos que este contiene

        miMarcoCentrado.setVisible(true);//utilizamos la instancia con el m�todo qque le permite ser visible
        

        miMarcoCentrado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//utilizamos la instancia con el m�todo que le
        // acaba con la ejecuci�n del programa una vez cerrada la ventana
        
        
    }
}

class MarcoCentrado extends JFrame//clase propia que para construir el marco debe heredar de JFrame
{
    public MarcoCentrado()//constructor, al instanciar esta clase podemos utilizar tooodos los m�todos de la clase JFrame
            //que por su larga herencia son muchos
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

        setLocation(anchoPantalla/4,alturaPantalla/4);//estamos dic�ndole que coloque la esquina de referencia
        // de la ventana (que es la superior izquierda) a un cuarto del ancho y a un cuarto del alto, consiguiendo as�
        // que quede totalmente centrada respecto a nuestra pantalla
    
        setTitle("Marco Centrado");//Dar t�tulo
        
        Image miIcono=miPantalla.getImage("src/graficos/IconoPasarela.gif");//Utilizamos el m�todo getImage de la clase Toolkit
        //  nos devuelve un objeto de la clase abstracta Image. Por lo tanto, como devuelve un objeto de tipo Image,
        // pues entonces la instrucci�n que construimos es:Image nombre_objeto=mipantalla(que es nuestro objeto Toolkit
        //con esto le decimos al programa d�nde tiene que buscar el archivo que queremos usar como icono.
        
        setIconImage(miIcono);//Y con este m�todo establecemos la imagen, usando como par�metro el objeto que hemos
        //creado en la instrucci�n anterior
        
       
        
        
        
        
    }
}
