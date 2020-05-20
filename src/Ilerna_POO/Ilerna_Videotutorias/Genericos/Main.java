package Ilerna_POO.Ilerna_Videotutorias.Genericos;

public class Main {
    public static void main(String[] args) {
        /*printData( 1);
        printData( "Texto");
        printData( 2.45);*/

        Caja <String>caja=new Caja<>();  //  La clase Caja no sabe qué tipo de dato va a recibir
        //  esto lo decidimos desde el main, en este caso String
        /*
        * hemos decidido que contenga strings
        * dentro de los símbolos <> (que se denominan diamonds)
        * ponemos el nombre del dato, el hecho de ponerlo en los diamonds de la derecha en la parte del new es totalmente voluntario
        * */
        caja.addObjeto("Hola");
        caja.addObjeto("Mundo");
        caja.addObjeto("Entero");
        System.out.println(caja.toString());

        Caja<Integer> enteros= new Caja<>();  //  En los genéricos no podemos utilizar tipos primitivos sino que deberemos utilizar la correspondiente clase envolvente
        enteros.addObjeto(1);
        enteros.addObjeto(2);
        enteros.addObjeto(3);
        enteros.addObjeto(4);
        enteros.addObjeto(5);
        System.out.println(enteros.toString());

        printNumbers(1);
        printNumbers(1.65f);
        printNumbers(1.45);
        printNumbers(1234123451);
        printNumbers(1);
        printNumbers(1);

        printData("Quiero imprimir algo");
        printData("Quiero imprimir algo 2");



    }
    private static <x> void printData (x data){//  De esta forma se declara  un tipo de dato genérico en Java
        System.out.println(data);
        //Si ponemos un debbug point en el print de la línea 12 comprobaremos que
        //en cada llamada que hacemos del parámertro data este se convierte en el tipo de valor necesrio automáticamente
    }
                                                                    //  De esta forma se declaran los comodines en Java
    private static <T extends Number> void printNumbers(T number){  //  Estamos diciendo que que el objeto t almacene
        System.out.println(number);                                 //  Cualquier tipo de dato que herede de Number
                                                                    //  así nos da igual que tipo de dato  numérico nos
    }                                                               //  ofrezca el programa pues lo tendremos cubierto


}

/*
* Aunque se pueden utilizar las letras que el programador elija,
* existen por convención las siguientes preferencias:
* T  ---> Tipo
* K  ---> Key
* V ---> Valor
* */
