package poo_pildoras;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import java.util.Date;

import java.awt.Toolkit.*;

public class PruebaTemporizador
{
    public static void main(String[] args)
    {/*Vamos a crear un programa que muestre en consola información automaticamente cada cierto tiempo
    para ello utilizaremos  la clase timer del paquete javax. swing. Esta clase tiene un constructor
    al que debemos pasarle 2 parametros.
    el primero de ellos se refiere al tiempo en milisegundos que va a tardar en aparecer dicho mensaje,
     y el segundo es una interfaz*/

        /*en la primera ampliación del programa , le añadimos la clase abstracta Toolkit para conseguir que cada vez que nos muestre la
        hora también suene un sonido propio delSO. La clase toolkit es una especie de puente entre nuestro so y nuestros programas en java
        (resolución de pantalla, sonido del sistema ,etc*/

        //Debido a las reglas de herencia de las interfaces aquí también funcionaría:
        //ActionListener oyente=new DameLaHora();
        DameLaHora oyente=new DameLaHora();//creamos la instancia oyente de la clase DameLaHora
        //que implementa la interfaz action listener


        Timer mitemporizador=new Timer(5000,oyente);//(int delay, ////////Action listener////////)
        /*para utilizar la interfaz action listener como parámetro, siguiendo las instrucciones
         que nos marca la api
        debemos : primero,importar el paquete al que coresponde(java.awt.event). Acto seguido, debido a la regla de
        implementacion de metodos de las
         interfaces debemos crear los mismos métodos en nuestra clase que los que tiene la propia
         interfaz definidos en la api de java.
         Siguiendo con la explicación, la interfaz action listener, implementa el método actionperformed(ActionEvent e)
          que a su vez tiene un parámetro action event e. Si leemos en la definicion de este metodo veremos que nos dice
           que es invocado cuando ocurre una determinada accion.

           ¿Cómo vamos a solucionar esto?, pues creamos una clase que implemente la interfaz action lístener
           en la cual crearemos un método actionPerformed(método de obligada creación por ser de una interfaz), después instanciaremos un objeto (oyente)
           que será de tipo action listener y se lo pasaremos como parámetro a nuestro "mitemporizador"

         */

        mitemporizador.start();//le decimos al programa que comience a ejecutar la instrucción mi temporizador,
        //para ello utilizamos el método start() perteneciente a la clase timer podemos usarlo gracias a que hemos importado paquete

        JOptionPane.showMessageDialog(null,"Pulsa Aceptar para detener");
        //debemos poner esta ventana debido a que de n o hacerlo el programa terminaria repentinamente
        //Entonces gracias a que este tipo de acciones dejan el programa en ejecucion, podemos ver el funcionamiento del
        // mismo durante el periodode tiempo que creamos necesario

        System.exit(0);//esta insturucción sirve para que cuando aceptemos en el panel JOptionPane,
        //el programa termine en la siguiente línea de codigo.

    }
}
class DameLaHora implements ActionListener
{/*Esto nos obliga a implementar a continuación todos los métodos que desarrolla esta interfaz, y allá vamos:*/

    public void actionPerformed(ActionEvent actionEventObjetodeTipoEvento)
    {//Como lo que queremos es que salga por pantalla cada cierto tiempo un mensaje con la hora, crearemos un
        // objeto de la clase date:

        Date ahora=new Date();//dentro de este objeto almacenamos la hora y se la pasaremos como parámetro al mensaje impreso en consola

        System.out.println("Te pongo la hora cada 5 seg: "+ ahora);

        Toolkit.getDefaultToolkit().beep();//método de la clase toolkit que emite sonido cada vez que actua el evento

    }
}