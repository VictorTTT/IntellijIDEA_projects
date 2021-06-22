package pidoras_Udemy_POO.pildoras_Udemy_POO_Abstract;


import org.jetbrains.annotations.NotNull;

import java.util.Date;

public abstract class Personas {

    private String nombre;

    public Personas(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    // Este método se declara como abstracto para obligar a todas las clases que hereden de Personas a implementarlo y
    // a que lo desarrollen. Al declarar un método como abstracto, la clase a la que pertenece también debe de serlo
    public abstract String getDescripcion();
}


class Empleados extends Personas implements Comparable, ParaTrabajadores {

    private double sueldo;
    private Date fechaAlta;


    public Empleados(String nom, double sueldo, Date fechaAlta) {
        super(nom);// Una clase que hereda debe tener un constructor que a su vez llame al constructor de las clase padre
        this.fechaAlta = fechaAlta;
        this.sueldo = sueldo;
    }

    // Como esta clase hereda de una clase abstracta con un método abstracto debe implementar este metodo
    // OBLIGATIORIAMENTE
    @Override
    public String getDescripcion() {
        return "El empleado " + this.getNombre() + " tiene un sueldo de " +
                sueldo + " € " + " y entró a trabajar en " + fechaAlta;
    }


    @Override
    public int compareTo(@NotNull Object o) {
        // Convertimos el objeto que se recibe por parámetro a un objeto de nuestra clase mediante un casting de objetos
        Empleados otroEmpleado = (Empleados) o;

        // Esta intefaz
        if (this.sueldo < otroEmpleado.sueldo) {
            return -1;
        } else if (this.sueldo > otroEmpleado.sueldo) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public double setBonus(double gratificacion) {

        return ParaTrabajadores.bonus + gratificacion;
    }
}

// Esta clase es la última en la cadena de herencia que tiene como primera clase
// a la clase abstracta "Persona", pero no tenemos la obligación de desarrollar
// el método getDescripcion porque ya se ha hecho en la clase que hereda directamente de persona

class Jefes extends Empleados implements ParaJefes {

    private double incentivo;
    private String cargo;

    public Jefes(String nom, double sueldo, Date fechaAlta) {
        super(nom, sueldo, fechaAlta);
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getCargo() {
        return "\n Además tiene el cargo de " + this.cargo;
    }

    @Override
    public double setBonus(double gratificacion) {

        double prima = 2000;
        return prima + gratificacion + ParaTrabajadores.bonus;

    }
}

// Esta clase como hereda directamente de la clase abstracta tiene que implementar
// obligatoriamente el método abstracto de la clase padre
class Alumnos extends Personas {

    private String a_optativas;
    private String aula;

    public Alumnos(String nom, String optativas, String aula) {
        super(nom);
        a_optativas = optativas;
        this.aula = aula;
    }

    @Override
    public String getDescripcion() {
        return "El almuno " + this.getNombre() + " Está en el aula " + aula +
                " ha escogido la asignatura " + a_optativas;
    }
}