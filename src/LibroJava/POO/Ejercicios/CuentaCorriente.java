package LibroJava.POO.Ejercicios;

/*Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número
de cuenta de 10 dígitos. Para simplificar, el número de cuenta se genera de
forma aleatoria cuando se crea una cuenta nueva. La cuenta se puede crear con
un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente.
En una cuenta se pueden hacer ingresos y gastos. También es posible hacer
una transferencia entre una cuenta y otra. Se permite el saldo negativo. En
el siguiente capítulo se propone un ejercicio como mejora de éste, en el que se
pide llevar un registro de los movimientos realizados.*/

public class CuentaCorriente {

    //Atributos

    private int numeroCuenta;
    private int saldo;

    //Constructores

    public CuentaCorriente(int saldo) {
        this.saldo = saldo;
        this.numeroCuenta = (int) (Math.random() * 1000000000);
    }

    public CuentaCorriente() {
        this.saldo = 0;
        this.numeroCuenta = (int) (Math.random() * 1000000000);

    }

    //Métodos del programa

    public int ingreso(int cantidadIngresada) {
        this.saldo += cantidadIngresada;
        return saldo;
    }

    public int reintegro(int cantidadRetirada) {
        this.saldo -= cantidadRetirada;
        return saldo;
    }

    public void hacerTransferencia(CuentaCorriente otraCuenta, int cantidadTransferida){
        this.saldo-=cantidadTransferida;
        otraCuenta.saldo+=cantidadTransferida;
    }



    //Getters y Setters


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "La cuenta corriente nº "+numeroCuenta+" tiene "+saldo+" €";
    }
}
