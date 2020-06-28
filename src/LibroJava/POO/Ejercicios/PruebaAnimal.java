package LibroJava.POO.Ejercicios;

import java.util.Scanner;

import static VictorTTT_Metodos.Consola.detenerConsola;

public class PruebaAnimal {
    public static void main(String[] args) {

        System.out.println("Este programa crea animales utilizando herencia m�ltiple a trav�s de clases e interfaces\n");
        System.out.println("Podemos elegir el nombre de los animales que particicpan y " +
                "muchas sorpresas m�s...\n");
        Scanner entrada = new Scanner(System.in);
        String respuesta;


        Gato gato1 = new Gato(Animal.Sexo.MACHO, 4, "Maullar");
        System.out.println("Vamos a crear un gato , elige su nombre por favor: ");
        gato1.setNombre(entrada.nextLine());
        System.out.println("Perfecto," + gato1.getNombre() + " pres�ntate: ");
        detenerConsola();
        System.out.println(gato1.toString());
        System.out.println();


        Perro perro1 = new Perro(Animal.Sexo.HEMBRA, 4, "Ladrar");
        System.out.println("Ahora vamos a crear una perrita , elige su nombre: ");
        perro1.setNombre(entrada.nextLine());
        System.out.println("Ya est�, "+perro1.getNombre()+" pres�ntate: ");
        detenerConsola();
        System.out.println(perro1.toString());
        System.out.println();


        Canario canario1 = new Canario(Animal.Sexo.MACHO, 2, "Cantar");
        System.out.println("Ahora vamos a hacer lo mismo con un canario, ponle un nombre al canario: ");
        canario1.setNombre(entrada.nextLine());
        System.out.println("�xito, "+canario1.getNombre()+" no tengas verg�enza y dinos qu�en eres");
        detenerConsola();
        System.out.println(canario1.toString());
        detenerConsola();



        Lagarto lagarto1 = new Lagarto(Animal.Sexo.MACHO, 4, "Sisear");
        System.out.println("Tambi�n vamos a crear un lagarto, vamos all�, c�mo quieres que se llame el lagarto?: ");
        lagarto1.setNombre(entrada.nextLine());
        System.out.println("Estup�ndo, buena elecci�n, "+lagarto1.getNombre()+" pres�ntate");
        detenerConsola();
        System.out.println(lagarto1.toString());
        System.out.println();


        Pinguino pinguino1 = new Pinguino(Animal.Sexo.HEMBRA, 2, "Graznar");
        System.out.println("Y por �ltimo, vamos a crear un ping�ino que sea chica . Como quieres que se llame?:");
        pinguino1.setNombre(entrada.nextLine());
        System.out.println("Qu� nombre m�s bonito!!! "+pinguino1.getNombre()+", no tengas verg�enza y cu�ntanos cositas de t�");
        detenerConsola();
        System.out.println(pinguino1.toString());

        System.out.println("De acuerdo, una vez que ya hemos creado todos los animales de este programa, vamos a ver q�e son capaces de hacer");
        System.out.println("Para empezar le vamos a decir a "+gato1.getNombre()+" que le d� de comer a sus hijitos");
        gato1.amamantar();
        System.out.println("Vaya hombre, pues nada. Oye bajate del sof� que lo est�s rompiendo con tus u�as!");
        detenerConsola();
        gato1.araniar();
        System.out.println(gato1.getNombre()+" tienes hambre? ");
        respuesta=entrada.nextLine();
        if (respuesta.equals("si")){
            System.out.println("Voy a buscar algo para darte ");
            respuesta=entrada.nextLine();
            gato1.depredador(canario1);
        }

    }
}
