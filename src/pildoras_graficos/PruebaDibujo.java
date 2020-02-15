package pildoras_graficos;

import javax.swing.*;
import java.awt.*;

public class PruebaDibujo
{
    public static void main(String[] args)
    {
        MarcoConDibujos mimarco = new MarcoConDibujos();//instancia de clase propia
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//m�todo para que acabe el programa cuando se cierre el frame
    }
}

class MarcoConDibujos extends JFrame//clase propia que hereda de JFrame
{
    public MarcoConDibujos()//constructor de nuestra clase que dispone de todos los m�todos de JFrame
    {
        setVisible(true);//le da visibilidad
        
        setTitle("prueba de Dibjujo");////le da nombre
        
        setSize(400, 400);//le da tama�o
        
        LaminaConFiguras milaminaConFiguras=new LaminaConFiguras();//una vez acabada la l�mina la instanciamos en nuestro consructor
        
        add(milaminaConFiguras);//y por �ltimo, agregamos el objeto L�mina
    }
}

class LaminaConFiguras extends JPanel//clase propia que hereda de JPanel
{
    
    protected void paintComponent(Graphics g)//sobreescribimos este m�todo que es heredado de JComponent-JPanel
    // que recibe como par�metro un objeto de tipo graphics
    {
        super.paintComponent(g);//llamamos al la clase padre con la palabra reservada super para que el m�todo haga
        // lo que est� programado para hacer y le pasamos por par�metro el objeto de tipo graphics
        // (que es sobre el que nosotros vamos a trabajar, sobre el que a�adimos contenido)
        
        g.drawRect(50,50,200,200);//pasamos como par�metro de la clase Graphics el objeto "g" con un m�todo
        //(drawRect) que tambi�n utiliza 4 par�metros que se utilizan para dibujar
        //la x y la y especifican el inicio del dibujo respecto a la esquina superior izquierda del frame
        //el width y el height se refieren a el ancho y el alto del dibujo, como son iguales, dibujar� un cuadrado
        
        g.drawLine(40,40,200,50);//este m�todo dibuja una linea y como una linea es la uni�n entre dos puntos,
        // pues debemos pasarle por par�metro las coordenadas del punto de inicio y las coordenadas del punto final
        
        g.drawArc(50,50,100,200,120,150);
        
        
    }
}

