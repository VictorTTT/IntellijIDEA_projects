package pildoras_graficos;

import javax.swing.*;
import java.awt.*;

public class EscibiendoEnMarco
{
    public static void main(String[] args)
    {
        MarcoConTexto mimarco = new MarcoConTexto();//creamos en el main, que es el métoo desde el cual arranca nuestro
        // programa, un objeto de la clase que hemos construido más abajo. Desde esta instancia podemos acceder a todos
        // los métodos que hemos definido en el consutructor con sus respectivos parámetros especificados
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame//creamos clase que hereda de JFrame para crear marco
{
    public MarcoConTexto()//método constructor de nuestra clase dónde utilizaremos los métodos que la jerarquía de
    //herencia nos proporciona
    {
        setVisible(true);//método que nos pide parámetro booleano para hacer visible nuestro marco. Nótese que en esta
        // ocasión estamos poniéndolo en el metodo constructor en vez del main
        
        setSize(600, 450);//método para dar tamaño al frame alto por ancho
        
        setLocation(400, 200);//método para dar localizaión a nuestro frame, teniendo en cuenta que comienza
        // a contar desde la esquina superior izquierda
        
        setTitle("Frame para colocar lámina con texto");//así se llamará nuestra ventanita
        
        Lamina milamina=new Lamina();//una vez hemos creado la Lamina debemos instanciarla dentro del constructor de la clase que hemos creado
        
        add(milamina);//no basta solo con instanciarla, también debemos añadirla de esta forma
    }
    
    
}

class Lamina extends JPanel//creamos otra clase que hereda de JPanel, esta la vamos a utilizar para añadir contenido  a nuestra ventana(frame)
{
    public void paintComponent(Graphics g)//Aquí estamos utilizando el constructor por defecto de la clase JPanel,
    // por eso no estamos especificando constructor alguno.El método que vamos a utilizar en nuestro programa es paintComponent
    // (que se encargará de dibujar sobre la Lámina), este método lo usa la clase JPanel pero lo hereda de JComponent.
    // Este método es protected, no devuelve nada y recibe un parámetro de la clase Graphics.
    // La clase Graphics es  una clase pública y abstracta que tiene un método que permite escribir texto (drawString)
    //Ese método recibe 3 parámetros, 1 de tipo string que será el texto que formará el contenido de la lámina. Y otros
    // 2 que son de tipo int que se utilizan para ubicar este texto dentro de ella
    //Otra cosa a tener en cuenta es que estamos sobreescribiendo este método,¿qué es esto? pues que estamos
    // heredándolo implicitamente a través de JPanel y tambiénlo estamos declarándolo en nuestro programa.
    // Esto es sobreescribir un método, y en este caso lo hacemos para especificarle  lo que queremos de él.
    //painComponent hace una serie de dibujos por defecto(si solo lo invocmos), y nosotros aquí estamos diciendo que además de eso
    // tiene que escribir lo que le pedimos ubicándolo dónde le decimos que lo haga (gracias a sobreescribirlo). Pero es importante que le digamos
    // al método que tiene que hacer las dos acciones tanto lo que le pedimos como aquello para lo que fue programado.
    // Para hacer esto utilizamos super para invocar la acción propia del método y luego le ponemos el parámetro que queremos añadir
    {
        super.paintComponent(g);//llamamos a un método de la clase padre (JComponent)
        
        g.drawString("Estamos aprendiendo swing", 100, 300);//Y nosotros le pasamos por parámetro el texto que queremos añadir
        
    }
    
    
}
