package Ilerna_POO.Ilerna_Videotutorias.Ficheros;

import java.io.*;

public class MainFiles {
    public static void main(String[] args) throws IOException {

        /*Vamos a ver en acción la clase File*/

        String path="D:\\IntellijIDEA_projects\\src\\Ilerna_POO\\Ilerna_Videotutorias\\Ficheros\\fichero.txt";
        //  Podemos almacenar en una variable la ruta absoluta para trabajar cómodamente.

        String pathRelativa="fichero.txt";
        //  De esta forma accedemos al fichero desde la ruta relativa, pero no funciona :(

        File file= new File(path) ;
        //  únicamente tenemos que pasar la ruta, absoluta o relativa.

        if(file.exists()){
            System.out.println("El fichero.txt existe en la ruta "+file.getAbsolutePath());
            //  Para comprobar si el fichero está vinculado de forma correcta
            //  podemos hacerlo a través de este método (exists) disponible en la clase files
        }else{
            System.out.println("El fichero no existe");
        }

        escribir(file);
        leer(file);

   }

    //  Ahora vamos aver de qué forma recorrer/acceder a los ficheros, para ello vamos a crear un
    //  conjunto de funciones que nos perimitan hacerlo.

    public static void escribir(File file )  { // creamos un procedimiento que reciba nuestro objeto de la clase file
        try{
            FileWriter writer= new FileWriter(file);  // (si el fichero no existe la clase filewriter lo vuelve a crear)
            // Dentro del procedimiento utilizamos la clase FileWriter que nos permite
            //  crear un objeto que utilizaremos para escribir en  el fichero que le pasamos por parámetro
            writer.write("Esto es lo que quiero escribir dentro del fichero que estoy creando");
            //  después usamos el método que nos permite escribir un string en el fichero
            writer.flush();
            writer.close();
            //  y para que lea ram nos mande la información al fichero deberemos o bien hacer un close si no vamos a escribir más
            //  o bien un flush si queremos enviar la información este punto pero queremos seguir escribiendo. Se puedenponer juntos.


        }catch (IOException ex){

            System.err.println("No se puede escribir en este fichero");
        }

        //  Esta clase lanza una excepción y debemos capturarla.

    }

    public static void leer(File file){
        try {
            FileReader reader=new FileReader(file);
            /*A diferencia de la escritura, para la lectura , debemos usar el método read junto con un bucle while
            * porque únicamente nos devuelve un caracter en cada llamada. Además de esto , ese caracter nos lo ofrece en unicode por lo que
            * deberemos castearlo para obtener su representación escrita*/
            int unicode;// en esta variable almacenamos el caracter obtenido
            while(( unicode=reader.read())!=-1){  //  esto es lo mismo que decirle que mientras hayan caracteres que vaya leyendo,
                //  cuando acabe de leer nos devolverá -1 y saldrá del bucle (consultar tabla ascII en :
                //  http://lsi.vc.ehu.es/asignaturas/Inf_Bas/Castellano/Tablas%20ascii/Ascii%20Table%20-%20ASCII%20character%20codes%20and%20html,%20octal,%20hex%20and%20decimal%20charts.htm)
                System.out.print((char)unicode);  //  momento de imprimir sin salto de línea y de hacer un casting en el print
            }

        } catch (FileNotFoundException e) {
            System.err.println("No se ha podido realizar la escritura del fichero seleccionado ");
        }catch (IOException e){
            System.out.println("Otra excepción que hay que capturar");
        }
    }



}
