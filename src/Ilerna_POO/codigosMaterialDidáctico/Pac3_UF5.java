package Ilerna_POO.codigosMaterialDidáctico;

public class Pac3_UF5 {

    public static void main(String[] args) {
        try {
            System.out.println("Se Intenta ejecutar el bloque de instrucciones:");
            System.out.println("Salida 1.");
            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecución.
            System.out.println("Salida 2.");//me doy cuenta de que cuando el bloque try encuentra el error sale del mismo y no ejecuta las líneas que hay a continuación
            System.out.println("Salida 3, etc.");
        } catch (Exception e) {
            System.out.println("Instrucción a ejecutar cuando se produce un error");
        } finally {
            System.out.println("Instrucciones a ejecutar final ya se produzcan errores como si no.");
        }
    }
}

