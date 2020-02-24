package Udemy_POO.EjerciciosUdemy_POO;

import VictorTTT_Metodos.Consola;

import javax.swing.*;
import java.util.Scanner;

public class Uso_Sucursal_y_Paquetes
{
    public static void main(String[] args)
    {
        System.out.println("Bienvenido a la empresa de mensajer�a de los TeMa");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el n� de sucursal");
        
        String numSucursal = entrada.nextLine();
        
        System.out.println("Ahora introduzca la direcci�n");
        
        String direccionEnvio = entrada.nextLine();
        
        System.out.println("Tambi�n necesitamos la ciudad");
        
        String ciudad = entrada.nextLine();
        
        Sucursal miSucursal1 = new Sucursal(numSucursal, direccionEnvio, ciudad);
        
        System.out.println("�cuantos paquetes desea enviar?");
        
        int numeroPaquetes = entrada.nextInt();
        
        
    
        Paquete[] miPaquetes =new Paquete[numeroPaquetes];
        
        String referencia;String  dni;String prioridad;
        
        double peso;
        
        for (int i = 0; i < miPaquetes.length; i++)
        {
            System.out.println("introduzca la referencia de env�o del paquete ");
            
            referencia=entrada.next();
    
            System.out.println("Inroduzca el dni del remitente");
            
            dni=entrada.next();
            
            System.out.println("Ahora introduzca el peso en gramos, los paquetes tienen un coste establecido de 1 � por cada 100 gramos");
            
            peso = entrada.nextDouble();
    
            System.out.println("Por �ltimo, defina la prioridad del envio.\n 0: Normal \n 1: Urgente \n 2: Muy Urgente");
            
            prioridad=entrada.next();
            
            switch (prioridad)
            {
                case "0":
    
                    System.out.println("Ha elegido env�o Normal, este env�o no tiene coste adicional");
                    
                    break;
                    
                case "1":
    
                    System.out.println("Ha elegido env�o urgente, este env�o tiene un coste a�adido de 10 �");
                    
                    break;
                    
                case "2":
    
                    System.out.println("Ha elegido env�o muy urgente, este env�o tiene un coste a�adido de 20 �");
                    
                    break;
                    
                default:
                    
                    System.out.println("La opci�n introducida no es correcta");
                    
                    break;
                    
            }
            
            miPaquetes[i]=new Paquete(referencia,peso,dni,prioridad);
            
           
    
            
            
            
    
    
        }
        
        
        
        System.out.println("Estamos enviando "+numeroPaquetes+" paquetes desde la sucusal n� "+miSucursal1.getNumeroSucursal()+" que est� en "+miSucursal1.getDireccion()+" de "+miSucursal1.getCiudad());
        System.out.println();
        System.out.println();
        System.out.println("La informaci�n de los paquetes es la siguiente: \n");
    
        for (int i = 0; i <numeroPaquetes ; i++)
        {
            System.out.println("Paquete: "+(i+1));
            System.out.println("Precio: "+miSucursal1.calculaPrecio(miPaquetes[i]));
            System.out.println("Peso: "+miPaquetes[i].getPeso());
            System.out.println("-----------------------------------------------------");
        }
        
        
        
        
        
        
        
        
        
    }
    
}
