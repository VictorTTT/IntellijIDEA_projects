package Udemy_POO.EjerciciosUdemy_POO;

//Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes características:
//• Nombre de clase: CuentaCorriente.
//• Propiedades:
//o saldo (double).
//o nombreTitular (String).
//o numeroCuenta (long).
//• Constructor con dos parámetros:
//o nombreTitular (String)
//o saldo (double)
//o Este constructor se encargará de establecer un nombre de titular para la cuenta
//corriente, un saldo inicial y asignará un nº a la cuenta corriente de tipo long de
//forma aleatoria
//• Métodos:
//o 2 setter: permitirán hacer ingresos y reintegros en un objeto de tipo
//CuentaCorriente.
//o 2 getter: Permitirán obtener saldo de la cuenta y datos generales de una
//CuentaCorriente.
//o 1 método adicional: permitirá realizar transferencias de dinero de una cuenta
//a otra.
//Crea una clase principal con el nombre de UsoCuenta. Crea dos instancias de CuentaCorriente
//con el nombre de Cuenta1 y Cuenta2. Haz una transferencia de Cuenta1 a Cuenta2 por importe
//de 200 €. Imprime los datos de las dos cuentas en consola.

import java.util.Random;

public class CuentaCorriente
{
    private double saldo;
    
    private String nombreTitular;
    
    private long numeroCuenta;
    
    public CuentaCorriente(String nombreTitular, double saldo)
    {
        this.nombreTitular = nombreTitular;
        
        this.saldo = saldo;
        
        Random rnd = new Random();//objeto aleatorio
        
        numeroCuenta = Math.abs(rnd.nextLong());//asignación de número aleatorio por medi de la clase Math
        
        
    }

    public void setIngreso(int cantidadIngresar)
    {
        saldo=saldo+cantidadIngresar;
    }

    public void setReintegro(int cantidadReintegrar)
    {
        saldo=saldo-cantidadReintegrar;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public String dimeDatosGenerales()
    {
        return "La cuenta corriente con número "+numeroCuenta+" corresponde a "+nombreTitular+" y actualmente " +
                " tiene un saldo de "+getSaldo()+" €";
    }

    public  void transferencia(CuentaCorriente cuenta1, CuentaCorriente cuenta2,  double cantidad)
    {
        cuenta1.saldo=cuenta1.saldo-cantidad;

        cuenta2.saldo=cuenta2.saldo+cantidad;
    }//en este método observamos cómo pasar 2 parámetros desde el main, el método recibe dos objetos de la clase CuentaCorriente
    //y una cantidad con la que hacer la transferencia entre ellos)
    
    
    
    
}
