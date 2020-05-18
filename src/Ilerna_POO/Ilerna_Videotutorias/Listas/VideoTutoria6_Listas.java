package Ilerna_POO.Ilerna_Videotutorias.Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*Podemos ampliar lo prendido viendo las diferencias de rendimiento entre ambos en el siguiente enlace: https://dzone.com/articles/arraylist-vs-linkedlist-vs*/

public class VideoTutoria6_Listas {
    public static void main(String[] args) {
        System.out.println("Vamos a ver un ejemplo de array list: \n");
        ArrayList<Integer> numeros= new ArrayList<>();//Entre los símbolos<>podemos poner el tipo de dato que queramos
        numeros.add(1); //para añadir números a la lista utilizaams el nombre que le hemos dado (números) con el operador punto y vamos viendo en este caso es add.
        numeros.add(2);// pero todas las demás funcionalidades que nos ofrecen los arraylist los podemos descubrir con el . y leyendo lo que pone
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(2, 0);// este es otro método add que tiene diferentes parármetros pòrque está sobrecargado
        numeros.set(2,7);
        numeros.remove(2);
        System.out.println("tamaño de lisa: "+numeros.size()); //  Mostramos el tamaño de la lista con el métod size, que tb nos puede srvir como siustituto del length en un for

        System.out.println("Iterando con for");
        for (int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }   //de esta forma podemos mostrar el contenido de la lista con un  bucle for

        System.out.println("Iterando con foreach");
        for (Integer numero : numeros) {
            System.out.println(numero);//  de esta forma podemos mostrar el contenido de la lista con un bucle foreach
        }

        System.out.println("Iterando con la clase Iterator");
        Iterator<Integer>iterator=numeros.iterator(); //  De esta forma podemos mostrar el contenido de la lista con la clase iterator
        //Tenemos que instanciar la clase iterator con la misma clase envolvente que hemos declarado la lista

        while (iterator.hasNext()) //  mientras el iterador  tenga una posición siguiente

        {
            System.out.println(iterator.next()); //devuelve el siguiente elemento en la iteración
        }



        System.out.println("Ahora vamos a ver un ejemplo de LinkedListLinkedlist");
        LinkedList <Integer> lnumero= new LinkedList<>();
        lnumero.add(2);
        lnumero.addLast(3);
        lnumero.addFirst(1);
        lnumero.add(5);
        lnumero.add(3,4);
        System.out.println("Con bucle for");
        for(int i=0;i< lnumero.size();i++){
            System.out.println(lnumero.get(i));

        }
        System.out.println("Con Iterador");
        Iterator<Integer> iteradorLinkedList= lnumero.iterator();

        while (iteradorLinkedList.hasNext()){
            System.out.println(iteradorLinkedList.next());
        }


    }
}
