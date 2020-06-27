package VictorTTT_Metodos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fechas {

    public Period averiguaEdad(CharSequence fechaNac){ // m�todo que recibe una secuencia de caracteres, para formatearla posteriormente en el cuerpo del mismo)
        //El m�todo devuelve un periodo en formato fecha
        DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("dd/MM/yyyy");  // Esta clase mediante el m�todo ofPattern marca el formato de la fecha para poder trabajar con ella
        LocalDate fechaNacimiento=LocalDate.parse(fechaNac,formatoFecha); // La clase LocalDate recibe la secuencia de caracteres que viene como par�metro en la llamada del m�todo, y la parsea con el objeto de la clase DaetTimeFormatter
        LocalDate fechaActual= LocalDate.now(); // creamos un objeto  de la clase LacalDate y utilizamos el m�todo now para almacenar en �l la fecha actual,

        return Period.between(fechaNacimiento,fechaActual); // Utilizamos la clase Period con el m�todo between, lo que nos va a permitir
        //devolver el periodo comprendido entre la fecha proporcionada y la actual.
    }

    public Period tiempoRestante(Period edadActual, LocalDate esperanzaVida){
        LocalDate fechaActual= LocalDate.now();// recogemos la fecha actual
        return Period.between(fechaActual,esperanzaVida); //el m�todo devuelve el tiempo de vida estimado del animal
        // teniendo en cuenta  la edad que tiene ahora y la esperanza de vida aportada.
    }

}
