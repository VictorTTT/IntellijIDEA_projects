package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class PruebaDibujoConJava2D
{
    public static void main(String[] args)
    {
        Dibujo2D mimarco2D=new Dibujo2D();

        mimarco2D.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Dibujo2D extends JFrame
{
    public  Dibujo2D()
    {
        setVisible(true);

        setSize(500,500);

        setTitle("Marco con dibujo 2D");

        Lamina2D milamina2D=new Lamina2D();

        add(milamina2D);


    }
}

class Lamina2D extends JPanel
{

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2=(Graphics2D) g;//Creamos un objeto de tipo Graphics 2D, para ello aplicamos la refundici�n, es decir
        //declaramos nuestro objeto y luego lo igualamos al objeto desde el que queremos convertir precedido de la clase
        // del objeto nuevo entre par�ntesis. Con esta sintaxis conseguimos que nuestro objeto de tipo Graphics (g2)pase a
        // ser un objeto de tipo Graphics 2D.

        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);//La clase Rectangle2D es una clase abstracta,es decir no se puede instanciar dierctamente. Sin embargo podemos
        // hacerlo a trav�s de Rectangle2D.double.Esta instrucci�n es posible debido a la regla es un... de la herencia
        //literalmente ser�a como decir: Instancio un objeto Rectangle 2D a trav�s del constructor de Rectangle 2D.double
        //(que s� me permite hacerlo por no ser abstracta) y esto lo hago porque Rectangle 2D.double hereda de Rectangle.
        /*Un Rectangle2D es un Rectangle, pues como no medeja instanciar la clase abstracata Rectangle utilizo el constructor de Rectangle.double
        * este constructor recibe por par�metros las coordenadas de inicio del rect�ngulo y el ancho y el alto del mismo */


        g2.draw(rectangulo);
        /*Una vez instanciado el rect�ngiulo queremos utilizar el m�todo draw de la clase Graphics2D,
        este m�todo es abstracto, void y recibe como par�metro un objeto de de la intefaz Shape
        Como Rectangle 2D implementa lainterfaz Shape usaremos el objeto rectangulo que hemos creado como argumento Shape*/


        Ellipse2D elipse=new Ellipse2D.Double();//nuevamente instanciamos objeto de clase abtracta a trav�s del constructor
        //de la clase que hereda de la absracta y que no lo es

        elipse.setFrame(rectangulo);
        //aqu� estamos creando una elipse a trav�s del m�todo setFrame que pertenece a la clase Ellipse2D que a su vez lo hereda de RectangularShape,
        // cuando hacemos la llamada a al m�todo, este est� sobrecargado en varios que tienen el mismo nombre pero
        // reciben diferente n�mero  de p�rametros. En nuestro caso usamos el que nos pide un rect�ngulo como l�mite exterior
        // de la elipse, aprovechamos as� el rect�ngulo que hemos creado m�s arriba y se lo pasamos por par�metro

        g2.draw(elipse);//una vez le hemos dicho las dimensiones que va a tener nuestra elipse, tenermos que dibujarla
        //objeto de tipo Graphics 2D(g2) .draw y le pasamos por par�metro el objeto que implementa la interfaz shape(rect�ngulo)

        g2.draw(new Line2D.Double(100,100,300,250));//En esta instrucci�n creamos una linea, pero en vez
        // de instanciarla como hemos hecho en las formas anteriores lo vammos a hacer dentro de el m�todo draw.
        // Para ello utilizamos el objeto de tipo garphics 2D y el m�todo draw y cuando nos pide los par�metros del m�todo
        // le pasamos lo que hacemos es instanciar la linea dentro de ellos.
        /*Si nos fijamos detenidamente es lo mismo que hemos hecho antes tanto en el rect�ngulo como en la elipse pero
        * no le damos nombre a la instancia,directamente construimos el objeto dentro del pase de par�metros y a correr*/

        double CentroenX=rectangulo.getCenterX();//Ahora vamos a crear un c�rculo que englobe lo dem�s y lo vamos a hacer
        //obteniendo el punto central de las coordenadas del ret�ngulo. Para ello declaramos una variable double y la
        // igualamos a nuestro rect�ngulo. el m�todo getCenterX. Una vez por cada eje de coordenadas

        double CentroenY=rectangulo.getCenterY();

        double radio=150;//como lo que queremos esque el c�rculo salga por fuera del rect�ngulo le damos al radio de
        // nuestra circunferencia el alto del rect�ngulo.
        
        
        Ellipse2D circulo= new Ellipse2D.Double();//Para crear el c�rculo instanciamos la clase Ellipse2D
        
        circulo.setFrameFromCenter(CentroenX,CentroenY,CentroenX+radio,CentroenY+radio);/*utilizamos el objeto c�rculo con este m�todo
        para situarlo en nuestra figura*/
        
        g2.draw(circulo);//dibujamos el circulo
        
        

    }
}
