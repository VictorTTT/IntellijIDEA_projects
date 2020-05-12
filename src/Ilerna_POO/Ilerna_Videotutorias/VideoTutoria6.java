package Ilerna_POO.Ilerna_Videotutorias;

import java.util.ArrayList;
import java.util.Iterator;

public class VideoTutoria6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros= new ArrayList<>();//Entre los símbolos<>podemos poner el tipo de dato que queramos
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(2, 0);
        numeros.set(2,7);
        numeros.remove(2);
        System.out.println("tamaño de lisa: "+numeros.size());

        Iterator<Integer>iterator=numeros.iterator();

        while (iterator.hasNext())

        {
            System.out.println(iterator.next());
        }

        System.out.println("Linkedlist");


    }
}
