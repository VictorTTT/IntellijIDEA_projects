package LibroJava.POO.Explicaciones.Explicaciones2;

import java.util.ArrayList;

public class EjemploArrayList02 {
    public static void main(String[] args) {

        // En la declaración se utiliza la clase envolvente
        ArrayList<Integer> a = new ArrayList<>();

        a.add(18);
        a.add(22);
        a.add(-30);

        System.out.println("El número de datos que hay en este arrayList es de " + a.size());

    }
}
