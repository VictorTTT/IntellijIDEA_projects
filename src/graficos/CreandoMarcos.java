package graficos;

import javax.swing.*;//para heredar de JFrame
import java.awt.*;

public class CreandoMarcos
{
    public static void main(String[] args)
    {
        miMarco marco1=new miMarco();//instancia marco1 de la clase miMarco, como el constructor no tiene parámetros,
        // no hay que pasarle ninguno
        
        marco1.setVisible(true);//para hacer que la ventana sea visible utilizamos la instancia que hemos creado
        // y el método setVisible, como parámetro hay que ponerle un true booleano
        //Esta instrucción tambien podrimos situarla dentro del constructor junto a setSize dejando en el main
        // únicamente la declaración de la instancia y el programa  funcionaría igualmente
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//con esta instrucción le decimos al programa
        // qué tiene que hacer esta ventana cuando se cierre. Para ello llamamos a este método al que hay que pasarle
        // por parámetro la descripción de lo que va a hacer despues de cerrar.
        //Si vamos a la API veremos que hay 4 opciones posibles. Aquí usamos la de Exit ON Close
        //Si vamos a la descripción de Exit ON Close comprobamos que es una constante de clase estática, por este motivo
        // utilizamos el nombre de la clase delante
        //si obviamos este método nos daremos cuenta de que el programa no temina se queda en ejecución continuamente
        //Esta instrucción tambien podrimos situarla dentro del constructor junto a setSize dejando en el main
        // únicamente la declaración de la instancia y  el programa funcionaría igualmente
    }
}

class miMarco extends JFrame//indicamos a la clase que creamos que queremos heredar de la clase JFrame
        //de esta forma podremos usar todos sus métodos. Si vamos a la API veremos que JFrame tiene una larga cadena de
        //heréncia y que por ello dispone de muchos métodos que podemos utilizar.
            //Esta clase la vamos a utilizar para darle un tamaño al marco,ventana,frame
{
    public miMarco()//método constructor de la clase que hemos creado (miMarco)
    {
        //setSize(500, 300);
        /*Llamamos al método setSize de la clase Jframe. Le tenemos que pasar 2 enteros que se refieren
        al ancho y alto de la ventana gráfica que vamos a crear. Los parámetros pueden variar dependiendo del monitor
        dónde vayamos a mostrar el programa. Si tenemos problemas con este tamaño y quermos asegurarnos de cuál es
        el adecuado, podemos utilizar Toolkit para averiguar qué configuración es la adecuada para nuestro monitor*/

        //setLocation(500,300);/*Con este método vamos a especificar laubicación de la ventana. El método trabaja con
        //un eje de coordenandas cartesiano y debemos pasarle 2 parámetros que se refieren al eje x y al y en px*/

        setBounds(500,300,550,250);//con este método le damos tanto posición como tamaño, por lo que
        // podemos prescindir de los dos anteriores cuando lo  utlizamos


        /*setResizable(false);/*este método impide que la ventana gráfica resultante pueda ser modificada por el usuario
         al introducir false. Si la dejáramos en vacía o en true el usuario podría redimensionarla*/

        /*setExtendedState(Frame.MAXIMIZED_BOTH);/*este método utiliza unos estados como argumentos
          campos de clase de la clase JFrame, existen 5 estados.Aquí utilizamos MAXIMIZED_BOTH
          que nos permite redimensionar la ventana emergente a la totalidad de la pantalla. MAXIMIZED_BOTH es una constante de clase
          estática,por lo tanto debemos usarla poniendo el nombre de la clase a a la que pertenece antes de ella Al ser
          una constante de clase de tipo entero, tiene asignado un número, en este caso 6*/

        setTitle("Mi ventana");//para darle nombre a ala ventana emergente


    }
}
