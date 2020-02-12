package poo_pildoras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador3ClasesInternasLocales
    /*En este ejemplo vamos a realizar el mismo programa de temporizador
    pero utilizando clases internas locales.Comprobaremos la notable simplificaci�n del c�digo*/

{
    public static void main(String[] args)
    {
        Reloj2 miReloj = new Reloj2();
        //Retiramos los par�metros de la instancia ya que hemos prescindido del constructor
        
        
        
        miReloj.enMarcha(3000, true);
        //Los colocamos en la llamada al m�todo
        
        
        JOptionPane.showMessageDialog(null, "pulsa aceptar para terminar");
        
        
        System.exit(0);
        
    }
    
}


class Reloj2//clase externa
{
    
    
    public void enMarcha(int intervalo, final boolean sonido)//m�todo setter
    
    {
        class DameLaHora3 implements ActionListener//clase interna local, no debe llevar ning�n modificador de acceso
        
        /*Hemos situado la clase dentro de del m�todo(convirti�ndose asi en una clase interna local),
         a su vez tanto m�todo como clase interna est�n dentro de una clase externa
        gracias a esto, podemos prescindir de las variables de clase y utilizarlas como
        par�metros del m�todo. Por extensi�n el m�todo constructor ya no tiene raz�n de ser y
        prescindimos tambi�n de �l. Una regla que hay que tener en cuenta es la de que hay que poner
        como final a los par�metros que se utilicen dentro de la clase interna local(final boolean sonido)
         */
        {
            
            public void actionPerformed(ActionEvent evento)
            {
                Date ahora = new Date();
                
                
                System.out.println("te pongo la hora cada 3 seg  " + ahora);
                
                
                if (sonido)
                {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        
        
        ActionListener oyente = new DameLaHora3();
        
        Timer mitemporizador = new Timer(intervalo, oyente);
        
        mitemporizador.start();
        
    }
    
    
}
