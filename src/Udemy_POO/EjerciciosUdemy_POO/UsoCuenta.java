package Udemy_POO.EjerciciosUdemy_POO;

public class UsoCuenta
{
    public static void main(String[] args)
    {
        CuentaCorriente cuenta1=new CuentaCorriente("Victor Tena Palomares",25514.96);

        CuentaCorriente cuenta2=new CuentaCorriente("Enzo Tena Masip",1500.87);

        cuenta1.transferencia(cuenta1,cuenta2,200);

        System.out.println(cuenta1.dimeDatosGenerales());

        System.out.println(cuenta2.dimeDatosGenerales());











    }
}
