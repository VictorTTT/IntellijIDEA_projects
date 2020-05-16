package Ilerna_POO.Ilerna_Videotutorias.strings;

public class Main {
    public static void main(String[] args){
        String texto = "Hola que tal";
        String texto2 = "Hola que tal";
        String texto3 = new String("Hola que tal");
        System.out.println("Char: "+texto.charAt(3));
        System.out.println(texto.equals(texto3));
        System.out.println("isEmpty()" +texto.isEmpty());
        System.out.println("lenght() "+texto.length());
        String[] arr = texto.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
