package Ilerna_POO.Pac_Desarrollo_entregada;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private double saldo;  // variable encapsulada

    private Usuario usuario; //objeto de la clase Usuario

    private List<Gasto> gastos = new ArrayList<>(); //lista de objetos de la clase Gasto

    private List<Ingreso> ingresos = new ArrayList<>(); //lista de obetos de la clase Ingreso

    public Cuenta(Usuario usuario) { // constructor que crea objetos tipo cuenta que recibe por par�metro
        //un objeto de tipo usuario

        this.usuario = usuario;
        saldo = 0;
    }

    public double getSaldo() {// devuelve el saldo de la cuenta
        return saldo;
    }

    public void setSaldo(double saldo) {// establece el saldo en la cuenta
        this.saldo = saldo;
    }

    public Usuario getUsuario() { // devuelve el usuario de la cuenta
        return usuario;
    }

    public void setUsuario(Usuario usuario) {// establece el usuario de la cuenta
        this.usuario = usuario;
    }

    public double addIngresos(String description, double cantidad) {// Opci�n 2 del men�.
        //Este m�todo recibe desde el MainFiles los par�metros de cada ingreso y con ellos crea un objeto(ingresoNuevo).

        Ingreso ingresoNuevo = new Ingreso(cantidad, description);

        ingresos.add(ingresoNuevo);//  a�ade el objeto creado a la lista de ingresos
        setSaldo(saldo + cantidad);// establece el saldo sumando la cantidad  del ingreso al saldo existente
        return saldo;
    }

    public double addGastos(String description, double cantidad) {// Opci�n 1 del men�.
        //Este m�todo recibe desde el MainFiles los par�metros de cada gasto y con ellos crea un objeto(gastoNuevo).

        Gasto gastoNuevo = new Gasto(cantidad, description);

        try {// cubrimos la posiblidad de que el usuario introduzca un gasto mayor al dinero que posee

            if (cantidad > getSaldo()) { //si lo introducido supera al saldo
                throw new GastoException(); // lanzamos la excepci�n
            }


        } catch (GastoException error) { //capturamos la excepci�n
            System.out.println(error.getMessage()); //imprimimos mensaje de error
            return saldo; // devolvemos el saldo para que se sepa de cu�nto dispone y salimos del m�todo
        }

        gastos.add(gastoNuevo); //fuera de la excepci�n se a�ade el gasto a lista
        setSaldo(saldo - cantidad);// se calcula el nuevo saldo
        return saldo;// se devuelve el saldo restante si se ha podido realizar el gasto con �xito
    }

    public List<Ingreso> getIngresos() { //Opci�n 4

        return ingresos;// devuelve todos los ingresos
    }

    public List<Gasto> getGastos() {// Opci�n 3

        return gastos;// devuelve todos los gastos
    }

    @Override
    public String toString() {

        return usuario +
                " actualmente tiene " + saldo + " �";

    }
}
