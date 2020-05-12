package Ilerna_POO.codigosMaterialDid�ctico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {  // clase contenedora

    //atributos de la clase empresa

    Empleado emp;
    int telefono;
    String direccion;

    //Sobrecarga de Constructores cada uno tiene una cantidad distinta de par�metros

    public Empresa() {
        emp=new Empleado();
        telefono=964571416;
        direccion="Calle Mitja Galta 3�D";
        //este constructor crea una objeto empresa con un empleado en el momento de la creaci�n,
        //tambi�n aasigna este tel�fono y esta direcci�n

    }

    public Empresa(Empleado emp) {

        this(emp,964571416,"Calle Mitja Galta 3�D");
        //Este constructor crea una empresa con el n�mero de tel�fono y direcci�n
        // pero en vez de crear un empleado lo recibe por parametro

    }

    public Empresa(int telefono, String direccion) {
        this(new Empleado(),telefono,direccion);
        //Este constructor crea un empresa y un empledo en el momento de su creaci�n igual que el primero
        // pero en vez de establecer el tel�fono y l direcci�n los recibe por par�metro
    }

    public Empresa(Empleado emp, int telefono, String direccion) {
        this.emp = emp;
        this.telefono = telefono;
        this.direccion = direccion;
        //Este constructor crea una empresa pero recibe todos los atributos por par�metro


    }

    //M�todo c�lculo horas extra Empleado
    public  double horasExtra(double horas){
        emp.horasExtra(horas);
        return horas;
        //Aqu� estamos utilizando el m�todo que se ha declarado en la clase empleado

    }

    //M�todo que da formato a la fecha
    public Date fechaNac(String fecha) throws ParseException{
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        Date data= formato.parse(fecha);
        return data;
    }
}
