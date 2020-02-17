package LibroJavaEjercicios;

//Escribe un programa que calcule el salario semanal de un empleado en base a
//las horas trabajadas, a razón de 12 euros la hora.

import java.util.Scanner;

public class EntradaDatosEjercicio5SalarioSemanalEmpleado
{
    public static void main(String[] args)
    {
        System.out.println("Bienvenido, este programa te permitirá calcular tu salario semanal, debes introducir los datos " +
                "que vamos a pedirte a contnuación\n");
    
        Scanner entrada=new Scanner(System.in);
    
        System.out.println("Introduce las horas que has tabajado esta semana");
        
        int horasSemanales=entrada.nextInt();
    
        System.out.println("Introduce el precio al que las cobras ");
        
        int precioHora=entrada.nextInt();
        
        int sueldoSemanal=horasSemanales*precioHora;
    
        System.out.println("Tu salario semanal es de: "+sueldoSemanal +" euros");
        
        
    }
}
