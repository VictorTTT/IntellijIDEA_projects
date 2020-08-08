package LibroJava.POO.Ejercicios;

/*Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un n�mero
de cuenta de 10 d�gitos. Para simplificar, el n�mero de cuenta se genera de
forma aleatoria cuando se crea una cuenta nueva. La cuenta se puede crear con
un saldo inicial; en caso de no especificar saldo, se pondr� a cero inicialmente.
En una cuenta se pueden hacer ingresos y gastos. Tambi�n es posible hacer
una transferencia entre una cuenta y otra. Se permite el saldo negativo. En
el siguiente cap�tulo se propone un ejercicio como mejora de �ste, en el que se
pide llevar un registro de los movimientos realizados.*/

public class MainCuentaCorriente {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        cuenta1.ingreso(2000);
        cuenta2.reintegro(600);
        cuenta3.ingreso(75);
        cuenta1.reintegro(55);
        cuenta2.hacerTransferencia(cuenta3, 100);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);

    }
}
