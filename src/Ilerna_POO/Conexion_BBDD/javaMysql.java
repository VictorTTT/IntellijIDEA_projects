package Ilerna_POO.Conexion_BBDD;

import java.sql.*;

public class javaMysql {

    public static void main(String[] args) {

        //  1. Establecer  la conexión con la base de datos.
        //hay que apuntar que el método getConnection laza una excepción que tendremos que controlar
        //y ya de paso aprovechamos el bloque try para controlar las demás

        try {
            //La conexión se realiza mediante la clase DriverManager por medio de su método get.Connection
            //Si vamos a a la api nos damos cuenta que este método devuelve un objeto de tipo connection.
            //Por lo tanto, tenemos que crear un objeto de tipo connection e igualarlo a la clase driverManager
            //acómpañandolo de los argumentos que se nos pide.
            Connection conec = DriverManager.getConnection("jdbc:mysql://localhost:3306/uf2", "root", "Calibra16v()");

            //2.  Crear objeto Statement (declaración) con su método createStatement
            //que recibirá el objeto connection que hemos creado arriba

            Statement declaracion = conec.createStatement();

            //3.  Crear y ejecutar instrucción SQL haciendo servir
            // el objeto Statement que hemos creado antes, esto dará como resultado
            //la creación de una tabla virtual que posteriormente tendremos que recorer

            ResultSet salida= declaracion.executeQuery("Select * from participantes");

            //4.  Recorrer el resultset usando como condición  el método next()
            //dentro del  bucle while imprimiremos el obj. resultset
            // junto con el método sobrecargado . getstring que podrá recibir el
            // nombre del campo deseado o número que ocupa en la tabla

            while(salida.next()){

                System.out.println(salida.getString(3));

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
