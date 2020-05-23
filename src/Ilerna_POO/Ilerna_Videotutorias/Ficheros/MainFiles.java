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

        // escribir(file);
        // leer(file);
        aleatorio(file);
   }

    //  Ahora vamos aver de qué forma recorrer/acceder a los ficheros, En primer lugar de forma secuencial
    //  para ello vamos a crear un
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
    /*Una vez hecho esto, vamos a ver la forma de acceder a los ficheros de forma aleatoria*/

    public static void aleatorio (File file){
        try {
            RandomAccessFile raf=new RandomAccessFile(file,"rw"); // le pasamos el archivo y el modeo en el que queremos acceder a él (read, write)
            raf.writeBytes("Hola qué tal están ustedes"); // con este método escribiremos en el fichero,
            // También lanza una excepción que tendremos que controlar en el bloque try catch
            String next;
            System.out.println("Iniciando lectura...");
            /*Hay que tener en cuenta una característica muy importante de los  ficheros aleatorios:
            *  la localización del puntero desde el que vamos a leer.
            * Es decir, cuando acabamos de escribir, el puntero se encuentra al final de la "frase", entonces, si inmediatamennte
            * pretendemos leer lo escrito, no nos va a devolver ningun resultado, porque lee desde la posición actual del puntero hasta el final
            * del fichero.
            * En toodo caso lo que debemos hacer es devolver el puntero al inicio del fichero
            * para que empiece a leer desde allí, lo podremos hacer de la siguiente manera:*/
            raf.writeBytes(" Adiós");// Esto se lo estamos añadiendo al fichero , lo que pasa esque hay que controlar que no se machaquen los datos
            raf.setLength(raf.getFilePointer()); //  Nuevamente el secreto está en la situación actual del fichero en este caso debemos saber
            // su ubicación actual con el método getFilePointer y a partir de ahí funcionamos
            raf.seek(0); // devuleve el objeto RandomAccesFile a la posición indicada en el parámtro del método seek
            while((next=raf.readLine())!=null){
                // Para leer, mientras el String declarado sea igual al objeto con el método readline y toodo esto sea  diferente de vacío
                System.out.println(next+ " : Tamaño --->"+ next.length()); // con esta instrucción conseguimos la longitud de caracteres que tiene el fichero
            }
            System.out.println("Finalización de la lectura del fichero");
        } catch (IOException e) {
            System.err.println("No se ha podido acceder o escribir en el fichero mediante el RandsomAccesfile");
        }
        // hay 2 constructores, que reciben 2 parámetros cada uno pero diferentes
        //  El primero recibe un objeto del la clase file y un mode en String, para saber lo que es el mode acudir a la documentación oficial
        //  Esta clase sirve tanto para leer como para escribir en un fichero,
        //  además nos proporciona todos los mecanismos necesarios para hacerlo
    }


}
