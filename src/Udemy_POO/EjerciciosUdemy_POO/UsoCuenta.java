package Udemy_POO.EjerciciosUdemy_POO;

import VictorTTT_Metodos.Consola;

import javax.swing.*;
import java.util.Scanner;

public class UsoCuenta
{
    public static void main(String[] args)
    {
        
        CuentaCorriente cuenta1 = new CuentaCorriente("Victor Tena Palomares", 25514.96);
        
        CuentaCorriente cuenta2 = new CuentaCorriente("Enzo Tena Masip", 1500.87);
        
        CuentaCorriente cuenta3 = new CuentaCorriente("Corinne Masip Escudero", 456.76);
        
        System.out.println("Bienvenido al cajero autom�tico de los TeMA\n");
        
        Consola.detenerConsola();
        
        System.out.println("Introduce tu nombre para operar desde tu cuenta");
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre = entrada.nextLine(),respuesta,opcion;
        
        
        if (nombre.equalsIgnoreCase("victor"))
        {
            System.out.println(cuenta1.dimeDatosGenerales());
            
            System.out.println("Deseas hacer alguna operaci�n???");
            
            respuesta=entrada.nextLine();
            
            if (respuesta.equalsIgnoreCase("si"))
            {
                System.out.println("Estupendo, elige una opci�n:\n 1=Ingresar dinero\n 2=Sacar dinero\n 3=Hacer una transferencia");
    
                opcion = entrada.nextLine();
                
                switch (opcion)
                {
                    case "1":
                    {
                        cuenta1.setIngreso(Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad que vas a ingresar")));
                        
                        System.out.println("La operaci�n ha sido realizada con �xito, pulsa enter para ver c�mo ha quedado tu cuenta");
                        
                        Consola.detenerConsola();
                        
                        System.out.println(cuenta1.dimeDatosGenerales());
                        
                        System.out.println("Hasta Pronto!");
                        
                        break;
                    }
                    
                    case "2":
                    {
                        cuenta1.setReintegro(Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad que quieres sacar")));
                        
                        System.out.println("La operaci�n ha sido realizada con �xito, pulsa enter para ver c�mo ha quedado tu cuenta");
                        
                        Consola.detenerConsola();
                        
                        System.out.println(cuenta1.dimeDatosGenerales());
                        
                        System.out.println("Hasta Pronto!");
                        
                        break;
                        
                        
                    }
                    case "3":
                    {
                        System.out.println("De acuerdo, �a qui�n quieres hacerle la transferencia  a Enzo o a Corinne?");
                        
                        nombre = entrada.nextLine();
                        
                        if (nombre.equalsIgnoreCase("corinne"))
                        {
                            cuenta1.transferencia(cuenta1, cuenta3, Double.parseDouble(JOptionPane.showInputDialog("introduce la cantidad a transferir")));
    
                            System.out.println("La transferencia se ha realizado con �xito, a continua ci�n se muestra c�mo han quedado las cuentas");
    
                            System.out.println(cuenta1.dimeDatosGenerales());
    
                            System.out.println(cuenta3.dimeDatosGenerales());
                        }
                        else if (nombre.equalsIgnoreCase("enzo"))
                        {
                            cuenta1.transferencia(cuenta1,cuenta2, Double.parseDouble(JOptionPane.showInputDialog("introduce la cantidad a transferir")));
    
                            System.out.println("La transferencia se ha realizado con �xito, a continuaci�n se muestra c�mo han quedado las cuentas");
    
    
                            System.out.println(cuenta1.dimeDatosGenerales());
    
                            System.out.println(cuenta2.dimeDatosGenerales());
                            
                            
                        }else
                        {
                            System.out.println("Opci�n incorrecta");
                        }
                        
                        
                    }
                    
                    
                }
            }else System.out.println("De acuerdo que tengas un buen d�a");
            
        }
        if (nombre.equalsIgnoreCase("enzo"))
        {
            System.out.println(cuenta2 .dimeDatosGenerales());
    
            System.out.println("Deseas hacer alguna operaci�n???");
    
            respuesta=entrada.nextLine();
            
            if (respuesta.equalsIgnoreCase("si"))
            {
                System.out.println("Estupendo, elige una opci�n: \n 1=Ingresar dinero\n 2=Sacar dinero\n 3=Hacer una transferencia");
    
                opcion = entrada.nextLine();
                
                switch (opcion)
                {
                    case "1":
                    {
                        cuenta2.setIngreso(Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad que vas a ingresar")));
                
                        System.out.println("La operaci�n ha sido realizada con �xito, pulsa enter para ver c�mo ha quedado tu cuenta");
                
                        Consola.detenerConsola();
                
                        System.out.println(cuenta2.dimeDatosGenerales());
                
                        System.out.println("Hasta Pronto!");
                
                        break;
                    }
            
                    case "2":
                    {
                        cuenta2.setReintegro(Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad que quieres sacar")));
                
                        System.out.println("La operaci�n ha sido realizada con �xito, pulsa enter para ver c�mo ha quedado tu cuenta");
                
                        Consola.detenerConsola();
                
                        System.out.println(cuenta2.dimeDatosGenerales());
                
                        System.out.println("Hasta Pronto!");
                
                        break;
                
                
                    }
                    case "3":
                    {
                        System.out.println("De acuerdo, �a qui�n quieres hacerle la transferencia  a Corinne o a Victor?");
                
                        nombre = entrada.nextLine();
                
                        if (nombre.equalsIgnoreCase("corinne"))
                        {
                            cuenta2.transferencia(cuenta2, cuenta3, Double.parseDouble(JOptionPane.showInputDialog("introduce la cantidad a transferir")));
                    
                            System.out.println("La transferencia se ha realizado con �xito, a continua ci�n se muestra c�mo han quedado las cuentas");
    
                            System.out.println(cuenta2.dimeDatosGenerales());
    
                            System.out.println(cuenta3.dimeDatosGenerales());
                        }
                        else if (nombre.equalsIgnoreCase("victor"))
                        {
                            cuenta2.transferencia(cuenta2,cuenta1, Double.parseDouble(JOptionPane.showInputDialog("introduce la cantidad a transferir")));
                    
                            System.out.println("La transferencia se ha realizado con �xito, a continua ci�n se muestra c�mo han quedado las cuentas");
    
                            System.out.println(cuenta2.dimeDatosGenerales());
    
                            System.out.println(cuenta1.dimeDatosGenerales());
                    
                        }else
                        {
                            System.out.println("Opci�n incorrecta");
                        }
                
                
                    }
            
            
                }
            }else System.out.println("De acuerdo que tengas un buen d�a");
        }
        if (nombre.equalsIgnoreCase("corinne"))
        {
            System.out.println(cuenta3.dimeDatosGenerales());
        
            System.out.println("Deseas hacer alguna operaci�n???");
            
            respuesta=entrada.nextLine();
        
            if (respuesta.equalsIgnoreCase("si"))
            {
                System.out.println("Estupendo, elige una opci�n: \n 1=Ingresar dinero\n 2=Sacar dinero\n 3=Hacer una transferencia");
    
                opcion = entrada.nextLine();
                
                switch (opcion)
                {
                    case "1":
                    {
                        cuenta3.setIngreso(Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad que vas a ingresar")));
                    
                        System.out.println("La operaci�n ha sido realizada con �xito, pulsa enter para ver c�mo ha quedado tu cuenta");
                    
                        Consola.detenerConsola();
                    
                        System.out.println(cuenta3.dimeDatosGenerales());
                    
                        System.out.println("Hasta Pronto!");
                    
                        break;
                    }
                
                    case "2":
                    {
                        cuenta3.setReintegro(Integer.parseInt(JOptionPane.showInputDialog("introduce la cantidad que quieres sacar")));
                    
                        System.out.println("La operaci�n ha sido realizada con �xito, pulsa enter para ver c�mo ha quedado tu cuenta");
                    
                        Consola.detenerConsola();
                    
                        System.out.println(cuenta3.dimeDatosGenerales());
                    
                        System.out.println("Hasta Pronto!");
                    
                        break;
                    
                    
                    }
                    case "3":
                    {
                        System.out.println("De acuerdo, �a qui�n quieres hacerle la transferencia  a Enzo o a V�ctor?");
                    
                        nombre = entrada.nextLine();
                    
                        if (nombre.equalsIgnoreCase("victor"))
                        {
                            cuenta3.transferencia(cuenta3, cuenta1, Double.parseDouble(JOptionPane.showInputDialog("introduce la cantidad a transferir")));
                        
                            System.out.println("La transferencia se ha realizado con �xito, a continua ci�n se muestra c�mo han quedado las cuentas");
    
                            System.out.println(cuenta3.dimeDatosGenerales());
    
                            System.out.println(cuenta1.dimeDatosGenerales());
                        }
                        else if (nombre.equalsIgnoreCase("enzo"))
                        {
                            cuenta3.transferencia(cuenta3,cuenta2, Double.parseDouble(JOptionPane.showInputDialog("introduce la cantidad a transferir")));
                        
                            System.out.println("La transferencia se ha realizado con �xito, a continua ci�n se muestra c�mo han quedado las cuentas");
    
                            System.out.println(cuenta2.dimeDatosGenerales());
    
                            System.out.println(cuenta3.dimeDatosGenerales());
                        
                        }else
                        {
                            System.out.println("Opci�n incorrecta");
                        }
                    
                    
                    }
                
                
                }
            }else System.out.println("De acuerdo que tengas un buen d�a");
        
        }
        
        
        
        
    }
}
