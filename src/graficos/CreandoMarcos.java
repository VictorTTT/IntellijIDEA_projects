package graficos;

import javax.swing.*;//para heredar de JFrame
import java.awt.*;

public class CreandoMarcos
{
    public static void main(String[] args)
    {
        miMarco marco1=new miMarco();//instancia marco1 de la clase miMarco, como el constructor no tiene par�metros,
        // no hay que pasarle ninguno
        
        marco1.setVisible(true);//para hacer que la ventana sea visible utilizamos la instancia que hemos creado
        // y el m�todo setVisible, como par�metro hay que ponerle un true booleano
        //Esta instrucci�n tambien podrimos situarla dentro del constructor junto a setSize dejando en el main
        // �nicamente la declaraci�n de la instancia y el programa  funcionar�a igualmente
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//con esta instrucci�n le decimos al programa
        // qu� tiene que hacer esta ventana cuando se cierre. Para ello llamamos a este m�todo al que hay que pasarle
        // por par�metro la descripci�n de lo que va a hacer despues de cerrar.
        //Si vamos a la API veremos que hay 4 opciones posibles. Aqu� usamos la de Exit ON Close
        //Si vamos a la descripci�n de Exit ON Close comprobamos que es una constante de clase est�tica, por este motivo
        // utilizamos el nombre de la clase delante
        //si obviamos este m�todo nos daremos cuenta de que el programa no temina se queda en ejecuci�n continuamente
        //Esta instrucci�n tambien podrimos situarla dentro del constructor junto a setSize dejando en el main
        // �nicamente la declaraci�n de la instancia y  el programa funcionar�a igualmente
    }
}

class miMarco extends JFrame//indicamos a la clase que creamos que queremos heredar de la clase JFrame
        //de esta forma podremos usar todos sus m�todos. Si vamos a la API veremos que JFrame tiene una larga cadena de
        //her�ncia y que por ello dispone de muchos m�todos que podemos utilizar.
            //Esta clase la vamos a utilizar para darle un tama�o al marco,ventana,frame
{
    public miMarco()//m�todo constructor de la clase que hemos creado (miMarco)
    {
        //setSize(500, 300);
        /*Llamamos al m�todo setSize de la clase Jframe. Le tenemos que pasar 2 enteros que se refieren
        al ancho y alto de la ventana gr�fica que vamos a crear. Los par�metros pueden variar dependiendo del monitor
        d�nde vayamos a mostrar el programa. Si tenemos problemas con este tama�o y quermos asegurarnos de cu�l es
        el adecuado, podemos utilizar Toolkit para averiguar qu� configuraci�n es la adecuada para nuestro monitor*/

        //setLocation(500,300);/*Con este m�todo vamos a especificar laubicaci�n de la ventana. El m�todo trabaja con
        //un eje de coordenandas cartesiano y debemos pasarle 2 par�metros que se refieren al eje x y al y en px*/

        setBounds(500,300,550,250);//con este m�todo le damos tanto posici�n como tama�o, por lo que
        // podemos prescindir de los dos anteriores cuando lo  utlizamos


        /*setResizable(false);/*este m�todo impide que la ventana gr�fica resultante pueda ser modificada por el usuario
         al introducir false. Si la dej�ramos en vac�a o en true el usuario podr�a redimensionarla*/

        /*setExtendedState(Frame.MAXIMIZED_BOTH);/*este m�todo utiliza unos estados como argumentos
          campos de clase de la clase JFrame, existen 5 estados.Aqu� utilizamos MAXIMIZED_BOTH
          que nos permite redimensionar la ventana emergente a la totalidad de la pantalla. MAXIMIZED_BOTH es una constante de clase
          est�tica,por lo tanto debemos usarla poniendo el nombre de la clase a a la que pertenece antes de ella Al ser
          una constante de clase de tipo entero, tiene asignado un n�mero, en este caso 6*/

        setTitle("Mi ventana");//para darle nombre a ala ventana emergente


    }
}
