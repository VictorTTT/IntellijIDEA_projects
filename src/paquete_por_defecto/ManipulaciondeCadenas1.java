package paquete_por_defecto;

public class ManipulaciondeCadenas1
{
    public static void main(String[] args)
    {
        String nombre ="Victor";//Variable objeto nombre

        System.out.println("Mi nombre es " + nombre);//mostrar nombre

        System.out.println("Mi nombre tiene " +  nombre.length()+ " letras ");//m�todo .length para saber la longitud del objeto

        System.out.println("La primera letra es la "+nombre.charAt(0));// m�todo.chartAt para, con el n�mero entre par�ntesis
        //indicar la posici�n que ocupa un determinado caracter

        int UltimaLetra=nombre.length();//declaraci�n de variable entera  igual�ndola a la longitud del objeto nombre

        System.out.println("Y la �ltima letra es la "+nombre.charAt(UltimaLetra-1));////aqu� estamos uniendo varios m�todos,
        //por un lado .charAt nos devolver� un caracter y entre par�ntesis ponemos la variable entera con-1 para que sea el �ltimo.

        System.out.println();
    }
}
