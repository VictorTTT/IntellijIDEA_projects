package Ilerna_POO.Ilerna_Videotutorias.Genericos;

import java.util.ArrayList;
import java.util.Iterator;

public class Caja <T>{ //  Clase genérica que la llamaos T porque el genérico será un tipo

    ArrayList <T>  listaDeObjetos;  //Creamos un arrayList de tipo objeto T, que a su vez es un genérico


    public ArrayList<T> getObjeto() {
        return listaDeObjetos;
    }

    public void setObjeto(ArrayList<T> listaDeObjetos) {
        this.listaDeObjetos = listaDeObjetos;
    }

    public void addObjeto(T listaDeObjetos){
        if(this.listaDeObjetos==null){

            this.listaDeObjetos=new ArrayList<>();
        }
                this.listaDeObjetos.add(listaDeObjetos);

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder= new StringBuilder();  //Clase especial para concatenar Strings de forma sencilla

        Iterator <T> iterator= listaDeObjetos.iterator();  //  Declaramos un iterador de tipo objeto T
        while(iterator.hasNext()){                         //  Mientras l lista de objetos tenga posiciones siguientes
            stringBuilder.append(iterator.next());         //  Añade en el stringbuilder la siguiente iteración encontrada
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();                   //  Por último devuelve toodo el stringBuilder convertido en uno por medio de to string

    }
}
