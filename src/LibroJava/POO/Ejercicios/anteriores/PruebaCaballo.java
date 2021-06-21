package LibroJava.POO.Ejercicios;

import java.util.Scanner;

import static VictorTTT_Metodos.Consola.detenerConsola;

public class PruebaCaballo {

    public static void main(String[] args) {

        System.out.println("Bienvenidos al programa inform�tico que crea caballos y los aparea entre si");
        detenerConsola();

        System.out.println("Elige el nombre del caballo que vamos a crear");
        Scanner entrada=new Scanner(System.in);
        String nombre=entrada.nextLine();
        System.out.println("Elige el nombre de  la llegua  que vamos a crear");
        String nombre2=entrada.nextLine();



        Caballo miCaballo1=new Caballo(nombre, " Espa�ol ", 3," relincha ",321.45," negro ", Caballo.Sexo.MACHO, Caballo.Cola.CORTA);
        System.out.println(miCaballo1.toString());
        Caballo miCaballo2=new Caballo(nombre2," �rabe ",4," relincha ",287.4," marr�n ", Caballo.Sexo.HEMBRA, Caballo.Cola.LARGA);
        System.out.println(miCaballo2.toString());

        System.out.println(miCaballo1.getNombre()+" C�mo est�s hoy campe�n??");
        detenerConsola();
        miCaballo1.relinchar();
        System.out.println("Eso est� genial!!!");
        System.out.println("Ven aqui, que te quiero presentar a una yegua muy guapa");
        detenerConsola();
        System.out.println(miCaballo2.getNombre()+ "Ven bonita, mira qu� caballo m�s apuesto que tenemos aqu�");
        detenerConsola();
        System.out.println("Quereis hacer una carreara a ver qui�n gana de los dos?");

        miCaballo1.relinchar();
        miCaballo2.relinchar();
        detenerConsola();

        System.out.println("Vamos all�, primero t� " +miCaballo2.getNombre());
        System.out.println("Tu velocidad en km/h es de: "+miCaballo2.velocidadGalope(miCaballo2.getEdad()));

        System.out.println("Ahora t� " +miCaballo1.getNombre());
        System.out.println("Tu velocidad en km/h es de: "+miCaballo1.velocidadGalope(miCaballo1.getEdad()));

        detenerConsola();

        System.out.println("Ale, a follar, apa�aros entre vosotros!");

        miCaballo1.aparearse(miCaballo2);

        miCaballo2.aparearse(miCaballo1);






























    }


}
