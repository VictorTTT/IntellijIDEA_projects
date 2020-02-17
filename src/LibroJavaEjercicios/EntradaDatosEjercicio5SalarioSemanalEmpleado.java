package LibroJavaEjercicios;

//Escribe un programa que calcule el salario semanal de un empleado en base a
//las horas trabajadas, a razón de 12 euros la hora.


//Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
//las horas extras. Escribe un programa que calcule el salario semanal de un
//trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
//trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
//la hora.
//Ejemplo 1:
//Por favor, introduzca el número de horas trabajadas durante la semana: 36
//El sueldo semanal que le corresponde es de 432 euros
//Ejemplo 2:
//Por favor, introduzca el número de horas trabajadas durante la semana: 40
//El sueldo semanal que le corresponde es de 480 euros
//Ejemplo 3:
//Por favor, introduzca el número de horas trabajadas durante la semana: 55
//El sueldo semanal que le corresponde es de 720 euros

import java.util.Scanner;

public class EntradaDatosEjercicio5SalarioSemanalEmpleado
{
    public static void main(String[] args)
    {
        System.out.println("Bienvenido, este programa te permitirá calcular tu salario semanal, debes introducir los datos " +
                "que vamos a pedirte a contnuación\n");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce las horas que has tabajado esta semana");

        int horasSemanales = entrada.nextInt();

        int precioHora = 12;

        int precioExtra=16;

        int sueldoSemanal=horasSemanales*precioHora;




        if (horasSemanales <= 40)
        {
            System.out.println("El sueldo semanal que te corresponde es de "+sueldoSemanal);
        }
        if (horasSemanales>40)
        {

            int horasExtra=horasSemanales-40;

            int sueldoExtra=horasExtra*precioExtra;

            horasSemanales=horasSemanales-horasExtra;

            sueldoSemanal=horasSemanales*precioHora;



            System.out.println("El sueldo que semanal te corresponde es de ");

            System.out.println(sueldoSemanal+sueldoExtra);
        }









        



    }
}
