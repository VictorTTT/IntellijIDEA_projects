package Ilerna_POO.Ilerna_Videotutorias.Excepciones;

public class Main {
    public static void main(String[] args) {
        //throw new AlumnosException("esta vez lo hago desde el MainFiles");

        //  Tambi�n podemos practicar a poner excepciones dentro de  un bloque try caych

        String [] array= new String[5];

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        try{System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException sovaco){  //  El catch solamente se lanza cuando existe una excepci�n en el try
            System.out.println("No seas cenutrio y apr�ndete bien los l�mites de los arrays  \n");
        }finally {  //  Bloque totalmente opcional siempre que lo pongamos aparecer� independientemente de si hay error o no
            System.out.println("Aqu� siempre va a salir todo lo que ponga");
        }

    }


}
