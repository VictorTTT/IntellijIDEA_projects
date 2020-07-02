package VictorTTT_Metodos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fechas {

    public Period averiguaEdad(CharSequence fechaNac){ // método que recibe una secuencia de caracteres (puede ser un String, preferiblemente en el formato dd/mm/yyyy)
        //El método devuelve un periodo en formato fecha
        DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("dd/MM/yyyy");  // Esta clase mediante el método ofPattern marca el formato de la fecha para poder trabajar con ella
        LocalDate fechaNacimiento=LocalDate.parse(fechaNac,formatoFecha); // La clase LocalDate recibe la secuencia de caracteres que viene como parámetro en la llamada del método, y la parsea con el objeto de la clase DaetTimeFormatter
        LocalDate fechaActual= LocalDate.now(); // creamos un objeto  de la clase LacalDate y utilizamos el método now para almacenar en él la fecha actual,

        return Period.between(fechaNacimiento,fechaActual); // Utilizamos la clase Period con el método between, lo que nos va a permitir
        //devolver el periodo comprendido entre la fecha proporcionada y la actual.
        // Para ofrecer el resultado obtenido al usuario es interesante formatear la impresión en pantalla con un mensaje entendible, toddo esto ya en el main.
        /*System.out.println(String.format("Tienes %d años, %d meses y %d días."
                ,perro1.averiguaEdad(fechaNacimiento).getYears(),perro1.averiguaEdad(fechaNacimiento).getMonths(),perro1.averiguaEdad(fechaNacimiento).getDays()));*/
    }



}
