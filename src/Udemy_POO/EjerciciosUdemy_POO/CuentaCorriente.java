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
        
        Random rnd = new Random();
        
        numeroCuenta = Math.abs(rnd.nextLong());
        
        
    }
    
    
    
    
}
