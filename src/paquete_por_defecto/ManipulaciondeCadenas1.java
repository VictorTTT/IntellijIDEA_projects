package paquete_por_defecto;

public class ManipulaciondeCadenas1
{
    public static void main(String[] args)
    {
        String nombre ="Victor";//Variable objeto nombre

        System.out.println("Mi nombre es " + nombre);//mostrar nombre

        System.out.println("Mi nombre tiene " +  nombre.length()+ " letras ");//método .length para saber la longitud del objeto

        System.out.println("La primera letra es la "+nombre.charAt(0));// método.chartAt para, con el número entre paréntesis
        //indicar la posición que ocupa un determinado caracter

        int UltimaLetra=nombre.length();//declaración de variable entera  igualándola a la longitud del objeto nombre

        System.out.println("Y la última letra es la "+nombre.charAt(UltimaLetra-1));////aquí estamos uniendo varios métodos,
        //por un lado .charAt nos devolverá un caracter y entre paréntesis ponemos la variable entera con-1 para que sea el último.

        System.out.println();
    }
}
