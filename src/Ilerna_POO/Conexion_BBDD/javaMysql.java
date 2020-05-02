package Ilerna_POO.Conexion_BBDD;

import java.sql.*;

public class javaMysql {

    public static void main(String[] args) {

        //  1. Establecer  la conexi�n con la base de datos.
        //hay que apuntar que el m�todo getConnection laza una excepci�n que tendremos que controlar
        //y ya de paso aprovechamos el bloque try para controlar las dem�s

        try {
            //La conexi�n se realiza mediante la clase DriverManager por medio de su m�todo get.Connection
            //Si vamos a a la api nos damos cuenta que este m�todo devuelve un objeto de tipo connection.
            //Por lo tanto, tenemos que crear un objeto de tipo connection e igualarlo a la clase driverManager
            //ac�mpa�andolo de los argumentos que se nos pide.
            Connection conec = DriverManager.getConnection("jdbc:mysql://localhost:3306/uf2", "root", "Calibra16v()");

            //2.  Crear objeto Statement (declaraci�n) con su m�todo createStatement
            //que recibir� el objeto connection que hemos creado arriba

            Statement declaracion = conec.createStatement();

            //3.  Crear y ejecutar instrucci�n SQL haciendo servir
            // el objeto Statement que hemos creado antes, esto dar� como resultado
            //la creaci�n de una tabla virtual que posteriormente tendremos que recorer

            ResultSet salida= declaracion.executeQuery("Select * from participantes");

            //4.  Recorrer el resultset usando como condici�n  el m�todo next()
            //dentro del  bucle while imprimiremos el obj. resultset
            // junto con el m�todo sobrecargado . getstring que podr� recibir el
            // nombre del campo deseado o n�mero que ocupa en la tabla

            while(salida.next()){

                System.out.println(salida.getString(3));

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
