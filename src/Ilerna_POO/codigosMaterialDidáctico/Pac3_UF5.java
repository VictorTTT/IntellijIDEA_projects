package Ilerna_POO.codigosMaterialDid�ctico;

public class Pac3_UF5 {

    public static void main(String[] args) {
        try {
            System.out.println("Se Intenta ejecutar el bloque de instrucciones:");
            System.out.println("Salida 1.");
            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecuci�n.
            System.out.println("Salida 2.");//me doy cuenta de que cuando el bloque try encuentra el error sale del mismo y no ejecuta las l�neas que hay a continuaci�n
            System.out.println("Salida 3, etc.");
        } catch (Exception e) {
            System.out.println("Instrucci�n a ejecutar cuando se produce un error");
        } finally {
            System.out.println("Instrucciones a ejecutar final ya se produzcan errores como si no.");
        }
    }
}

