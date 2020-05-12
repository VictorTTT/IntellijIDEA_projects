package Ilerna_POO.codigosMaterialDidáctico;

public class Jefe extends Cualificados {

    int total_trabajadores; // un jefe tiene una determinada cifra de trabajadores a su cargo
    String [] proyectos; //Array de string para almacenar los nombres de los diferentes proyectos
    double extra; //la extra que cobra el jefe por el cargo que ocupa
    /*Un jefe es un empleado y además está cualificado, hereda de ambas clases
    * tendrá acceso a  todos los atributos y métodos de empleado y de cualificados,
    * y añadirá los suyos propios*/
}
