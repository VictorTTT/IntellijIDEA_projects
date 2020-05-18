package Ilerna_POO.Ilerna_Videotutorias.Genericos;

import java.util.ArrayList;
import java.util.Iterator;

public class Caja <T>{ //  Clase gen�rica que la llamaos T porque el gen�rico ser� un tipo

    ArrayList <T>  listaDeObjetos;  //Creamos un arrayList de tipo objeto T, que a su vez es un gen�rico


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
            stringBuilder.append(iterator.next());         //  A�ade en el stringbuilder la siguiente iteraci�n encontrada
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();                   //  Por �ltimo devuelve toodo el stringBuilder convertido en uno por medio de to string

    }
}
