package LibroJavaEjercicios;

//Escribe un programa en el que se declaren las variables enteras x e y. As�gnales
//los valores 144 y 999 respectivamente. A continuaci�n, muestra por pantalla
//el valor de cada variable, la suma, la resta, la divisi�n y la multiplicaci�n.

public class EjercicioVariables1
{
    public static void main(String[] args)
    {
        int x=144;

        int y=999;

        System.out.println("El valor de x es "+x);

        System.out.println("El valor de y es "+y);

        System.out.println("La suma de ambas variable es= "+(x+y)+"\n La resta es = "+(y-x)+"\n la divisi�n= "+(y/x)+
                "\n y la multiplicaci�n "+(x*y));
    }
}
