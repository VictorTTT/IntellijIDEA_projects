package pildoras_graficos;

import javax.swing.*;
import java.awt.*;

public class EscibiendoEnMarco
{
    public static void main(String[] args)
    {
        MarcoConTexto mimarco = new MarcoConTexto();//creamos en el main, que es el m�too desde el cual arranca nuestro
        // programa, un objeto de la clase que hemos construido m�s abajo. Desde esta instancia podemos acceder a todos
        // los m�todos que hemos definido en el consutructor con sus respectivos par�metros especificados
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame//creamos clase que hereda de JFrame para crear marco
{
    public MarcoConTexto()//m�todo constructor de nuestra clase d�nde utilizaremos los m�todos que la jerarqu�a de
    //herencia nos proporciona
    {
        setVisible(true);//m�todo que nos pide par�metro booleano para hacer visible nuestro marco. N�tese que en esta
        // ocasi�n estamos poni�ndolo en el metodo constructor en vez del main
        
        setSize(600, 450);//m�todo para dar tama�o al frame alto por ancho
        
        setLocation(400, 200);//m�todo para dar localizai�n a nuestro frame, teniendo en cuenta que comienza
        // a contar desde la esquina superior izquierda
        
        setTitle("Frame para colocar l�mina con texto");//as� se llamar� nuestra ventanita
        
        Lamina milamina=new Lamina();//una vez hemos creado la Lamina debemos instanciarla dentro del constructor de la clase que hemos creado
        
        add(milamina);//no basta solo con instanciarla, tambi�n debemos a�adirla de esta forma
    }
    
    
}

class Lamina extends JPanel//creamos otra clase que hereda de JPanel, esta la vamos a utilizar para a�adir contenido  a nuestra ventana(frame)
{
    public void paintComponent(Graphics g)//Aqu� estamos utilizando el constructor por defecto de la clase JPanel,
    // por eso no estamos especificando constructor alguno.El m�todo que vamos a utilizar en nuestro programa es paintComponent
    // (que se encargar� de dibujar sobre la L�mina), este m�todo lo usa la clase JPanel pero lo hereda de JComponent.
    // Este m�todo es protected, no devuelve nada y recibe un par�metro de la clase Graphics.
    // La clase Graphics es  una clase p�blica y abstracta que tiene un m�todo que permite escribir texto (drawString)
    //Ese m�todo recibe 3 par�metros, 1 de tipo string que ser� el texto que formar� el contenido de la l�mina. Y otros
    // 2 que son de tipo int que se utilizan para ubicar este texto dentro de ella
    //Otra cosa a tener en cuenta es que estamos sobreescribiendo este m�todo,�qu� es esto? pues que estamos
    // hered�ndolo implicitamente a trav�s de JPanel y tambi�nlo estamos declar�ndolo en nuestro programa.
    // Esto es sobreescribir un m�todo, y en este caso lo hacemos para especificarle  lo que queremos de �l.
    //painComponent hace una serie de dibujos por defecto(si solo lo invocmos), y nosotros aqu� estamos diciendo que adem�s de eso
    // tiene que escribir lo que le pedimos ubic�ndolo d�nde le decimos que lo haga (gracias a sobreescribirlo). Pero es importante que le digamos
    // al m�todo que tiene que hacer las dos acciones tanto lo que le pedimos como aquello para lo que fue programado.
    // Para hacer esto utilizamos super para invocar la acci�n propia del m�todo y luego le ponemos el par�metro que queremos a�adir
    {
        super.paintComponent(g);//llamamos a un m�todo de la clase padre (JComponent)
        
        g.drawString("Estamos aprendiendo swing", 100, 300);//Y nosotros le pasamos por par�metro el texto que queremos a�adir
        
    }
    
    
}
