package LibroJava.POO.Ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static VictorTTT_Metodos.Consola.detenerConsola;

public class PruebaAnimal {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>();
        List<Perro> perros = new ArrayList<>();
        List<Canario> canarios = new ArrayList<>();  //Creamos una lista que nos permitirá almacenar varias instancias de cada clase
        List<Pinguino> pinguinos = new ArrayList<>();
        List<Lagarto> lagartos = new ArrayList<>();
        List<Animal> animales = new ArrayList<>();

        System.out.println("Este programa permite crear animalitos y muchas  sorpresas más");
        System.out.println();
        System.out.println("Estás preparad@ para la diversión?");
        detenerConsola();
        Scanner entrada = new Scanner(System.in);
        int seleccion;
        String sexo;


        do {
            System.out.println("Elige el animal que quieres crear: \n\n" +
                    "1------> Quiero crear un gato\n" +
                    "2------> Ver todos los gatos que se han creado\n" +
                    "3------> Quiero crear un perro\n" +
                    "4------> Ver todos los perros que sen han creado\n" +
                    "5------> Quiero crear un canario\n" +
                    "6------> Ver todos los canarios que se han creado\n" +
                    "7------> Quiero crear un pinguino\n" +
                    "8------> Ver todos los pinguinos que se han creado\n" +
                    "9------> Quiero crear un lagarto\n" +
                    "10-----> Ver todos los lagartos que se han creado\n" +
                    "11------> Ver todos los animales que se han creado\n" +
                    "12------> Pasar a la siguiente parte del programa");

            seleccion = entrada.nextInt();
            entrada.nextLine();


            switch (seleccion) {

                case 1:

                    Gato nuevoGato = new Gato();
                    gatos.add(nuevoGato);
                    animales.add(nuevoGato);
                    System.out.println("Has elegido crear un gatito, perfecto!");

                    System.out.println("Elige su nombre: ");
                    nuevoGato.setNombre(entrada.nextLine());

                    System.out.println("Elige su sexo (Macho o hembra)");
                    sexo = entrada.nextLine();
                    if (sexo.equalsIgnoreCase("macho")) {
                        nuevoGato.setSexo(Animal.Sexo.MACHO);
                    } else nuevoGato.setSexo(Animal.Sexo.HEMBRA);

                    System.out.println("Cuantas patas tiene?");
                    nuevoGato.setPatas(entrada.nextInt());
                    entrada.nextLine();

                    System.out.println("Cual es el sonido que hace?");
                    nuevoGato.setSonido(entrada.nextLine());

                    System.out.println("Cuál es su fecha de nacimiento?");
                    nuevoGato.setFechaNacimiento(entrada.nextLine());


                    System.out.println("El gato ha sido creado ");


                    break;

                case 2:

                    System.out.println("La lista completa de los gatos es la siguiente: ");

                    Iterator<Gato> iterator = gatos.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;

                case 3:

                    Perro nuevoPerro = new Perro();
                    perros.add(nuevoPerro);
                    animales.add(nuevoPerro);

                    System.out.println("Has elegido crear un perrete, perfecto!");

                    System.out.println("Elige su nombre: ");
                    nuevoPerro.setNombre(entrada.nextLine());

                    System.out.println("Elige su sexo (Macho o hembra)");
                    sexo = entrada.nextLine();
                    if (sexo.equalsIgnoreCase("macho")) {
                        nuevoPerro.setSexo(Animal.Sexo.MACHO);
                    } else nuevoPerro.setSexo(Animal.Sexo.HEMBRA);

                    System.out.println("Cuantas patas tiene?");
                    nuevoPerro.setPatas(entrada.nextInt());
                    entrada.nextLine();

                    System.out.println("Cual es el sonido que hace?");
                    nuevoPerro.setSonido(entrada.nextLine());

                    System.out.println("Cuál es su fecha de nacimiento?");
                    nuevoPerro.setFechaNacimiento(entrada.nextLine());


                    System.out.println("El perro ha sido creado");


                    break;

                case 4:

                    System.out.println("La lista completa de los perros es la siguiente: ");

                    Iterator<Perro> iteratorPerro = perros.iterator();
                    while (iteratorPerro.hasNext()) {
                        System.out.println(iteratorPerro.next());
                    }

                    break;

                case 5:

                    Canario nuevoCanario = new Canario();
                    canarios.add(nuevoCanario);
                    animales.add(nuevoCanario);

                    System.out.println("Has elegido crear un canario, perfecto!");

                    System.out.println("Elige su nombre: ");
                    nuevoCanario.setNombre(entrada.nextLine());

                    System.out.println("Elige su sexo (Macho o hembra)");
                    sexo = entrada.nextLine();
                    if (sexo.equalsIgnoreCase("macho")) {
                        nuevoCanario.setSexo(Animal.Sexo.MACHO);
                    } else nuevoCanario.setSexo(Animal.Sexo.HEMBRA);

                    System.out.println("Cuantas patas tiene?");
                    nuevoCanario.setPatas(entrada.nextInt());
                    entrada.nextLine();

                    System.out.println("Cual es el sonido que hace?");
                    nuevoCanario.setSonido(entrada.nextLine());

                    System.out.println("Cuál es su fecha de nacimiento?");
                    nuevoCanario.setFechaNacimiento(entrada.nextLine());


                    System.out.println("El canario ha sido creado ");


                    break;

                case 6:

                    System.out.println("La lista completa de los canarios es la siguiente: ");

                    Iterator<Canario> iteratorCanario = canarios.iterator();
                    while (iteratorCanario.hasNext()) {
                        System.out.println(iteratorCanario.next());
                    }

                    break;

                case 7:

                    Pinguino nuevoPinguino = new Pinguino();
                    pinguinos.add(nuevoPinguino);
                    animales.add(nuevoPinguino);

                    System.out.println("Has elegido crear un pingüino, perfecto!");

                    System.out.println("Elige su nombre: ");
                    nuevoPinguino.setNombre(entrada.nextLine());

                    System.out.println("Elige su sexo (Macho o hembra)");
                    sexo = entrada.nextLine();
                    if (sexo.equalsIgnoreCase("macho")) {
                        nuevoPinguino.setSexo(Animal.Sexo.MACHO);
                    } else nuevoPinguino.setSexo(Animal.Sexo.HEMBRA);

                    System.out.println("Cuantas patas tiene?");
                    nuevoPinguino.setPatas(entrada.nextInt());
                    entrada.nextLine();

                    System.out.println("Cual es el sonido que hace?");
                    nuevoPinguino.setSonido(entrada.nextLine());

                    System.out.println("Cuál es su fecha de nacimiento?");
                    nuevoPinguino.setFechaNacimiento(entrada.nextLine());


                    System.out.println("El pingüino ha sido creado ");


                    break;

                case 8:

                    System.out.println("La lista completa de los pingüinos es la siguiente: ");

                    Iterator<Pinguino> iteratorPinguino = pinguinos.iterator();
                    while (iteratorPinguino.hasNext()) {
                        System.out.println(iteratorPinguino.next());
                    }

                    break;

                case 9:

                    Lagarto nuevoLagarto = new Lagarto();
                    lagartos.add(nuevoLagarto);
                    animales.add(nuevoLagarto);

                    System.out.println("Has elegido crear un lagarto, perfecto!");

                    System.out.println("Elige su nombre: ");
                    nuevoLagarto.setNombre(entrada.nextLine());

                    System.out.println("Elige su sexo (Macho o hembra)");
                    sexo = entrada.nextLine();
                    if (sexo.equalsIgnoreCase("macho")) {
                        nuevoLagarto.setSexo(Animal.Sexo.MACHO);
                    } else nuevoLagarto.setSexo(Animal.Sexo.HEMBRA);

                    System.out.println("Cuantas patas tiene?");
                    nuevoLagarto.setPatas(entrada.nextInt());
                    entrada.nextLine();

                    System.out.println("Cual es el sonido que hace?");
                    nuevoLagarto.setSonido(entrada.nextLine());

                    System.out.println("Cuál es su fecha de nacimiento?");
                    nuevoLagarto.setFechaNacimiento(entrada.nextLine());


                    System.out.println("El lagarto ha sido creado ");


                    break;

                case 10:

                    System.out.println("La lista completa de los lagartos es la siguiente: ");

                    Iterator<Lagarto> iteratorLagarto = lagartos.iterator();
                    while (iteratorLagarto.hasNext()) {
                        System.out.println(iteratorLagarto.next());
                    }

                    break;

                case 11:

                    Iterator<Animal> iteratorAnimales = animales.iterator();
                    while (iteratorAnimales.hasNext()) {
                        System.out.println(iteratorAnimales.next());
                    }

                    break;


            }
        } while (seleccion != 12);


        System.out.println("De acuerdo, ahora que ya tenemos todos los animalitos creados, vamos a hacer alguans cosas con ellos\n\n");
        detenerConsola();

        System.out.println("Como ya sabemos, cada animal pertenece a una especie distinta y su alimentación y " +
                "comportamiento cambiara según la especie a la que pertenzca");

        detenerConsola();


        //do {

        Iterator<Animal> iteratorAnimales = animales.iterator();
        while (iteratorAnimales.hasNext()) {
            System.out.println(iteratorAnimales.next());
        }

        System.out.println("Haz la prueba, coge un animal de los que has creado y dile que haga una acción de la lista");
        System.out.println(
                "1---> Dormir\n" +
                        "2---> Comer\n" +
                        "3---> Nacer\n" +
                        "4---> Morir\n" +
                        "5---> Reproducirse\n" +
                        "6---> Averiguar su edad exacta\n\n\n");

        System.out.println("Escribe el nombre exacto que le has puesto al  animal :");
        String nombre = entrada.nextLine();
        for (int i = 0; i <animales.size() ; i++) {

            System.out.println("El animal que has elegido es: "+ nombre+(i)+animales.get(i));




        }

    }





}





