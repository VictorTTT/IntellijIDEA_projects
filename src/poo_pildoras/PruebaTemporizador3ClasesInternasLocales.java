package poo_pildoras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador3ClasesInternasLocales
    /*En este ejemplo vamos a realizar el mismo programa de temporizador
    pero utilizando clases internas locales.Comprobaremos la notable simplificación del código*/

{
    public static void main(String[] args)
    {
        Reloj2 miReloj = new Reloj2();
        //Retiramos los parámetros de la instancia ya que hemos prescindido del constructor
        
        
        
        miReloj.enMarcha(3000, true);
        //Los colocamos en la llamada al método
        
        
        JOptionPane.showMessageDialog(null, "pulsa aceptar para terminar");
        
        
        System.exit(0);
        
    }
    
}


class Reloj2//clase externa
{
    
    
    public void enMarcha(int intervalo, final boolean sonido)//método setter
    
    {
        class DameLaHora3 implements ActionListener//clase interna local, no debe llevar ningún modificador de acceso
        
        /*Hemos situado la clase dentro de del método(convirtiéndose asi en una clase interna local),
         a su vez tanto método como clase interna están dentro de una clase externa
        gracias a esto, podemos prescindir de las variables de clase y utilizarlas como
        parámetros del método. Por extensión el método constructor ya no tiene razón de ser y
        prescindimos también de él. Una regla que hay que tener en cuenta es la de que hay que poner
        como final a los parámetros que se utilicen dentro de la clase interna local(final boolean sonido)
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
