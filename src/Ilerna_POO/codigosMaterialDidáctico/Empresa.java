package Ilerna_POO.codigosMaterialDidáctico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {  // clase contenedora

    //atributos de la clase empresa

    Empleado emp;
    int telefono;
    String direccion;

    //Sobrecarga de Constructores cada uno tiene una cantidad distinta de parámetros

    public Empresa() {
        emp=new Empleado();
        telefono=964571416;
        direccion="Calle Mitja Galta 3ºD";
        //este constructor crea una objeto empresa con un empleado en el momento de la creación,
        //también aasigna este teléfono y esta dirección

    }

    public Empresa(Empleado emp) {

        this(emp,964571416,"Calle Mitja Galta 3ºD");
        //Este constructor crea una empresa con el número de teléfono y dirección
        // pero en vez de crear un empleado lo recibe por parametro

    }

    public Empresa(int telefono, String direccion) {
        this(new Empleado(),telefono,direccion);
        //Este constructor crea un empresa y un empledo en el momento de su creación igual que el primero
        // pero en vez de establecer el teléfono y l dirección los recibe por parámetro
    }

    public Empresa(Empleado emp, int telefono, String direccion) {
        this.emp = emp;
        this.telefono = telefono;
        this.direccion = direccion;
        //Este constructor crea una empresa pero recibe todos los atributos por parámetro


    }

    //Método cálculo horas extra Empleado
    public  double horasExtra(double horas){
        emp.horasExtra(horas);
        return horas;
        //Aquí estamos utilizando el método que se ha declarado en la clase empleado

    }

    //Método que da formato a la fecha
    public Date fechaNac(String fecha) throws ParseException{
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        Date data= formato.parse(fecha);
        return data;
    }
}
