package Udemy_POO.EjerciciosUdemy_POO;

public class Sucursal
{
    private String numeroSucursal;

    private String direccion;

    private String ciudad;


    public Sucursal(String numeroSucursal, String direccion, String ciudad)
    {
        this.numeroSucursal = numeroSucursal;

        this.direccion = direccion;

        this.ciudad = ciudad;

    }

    public String getNumeroSucursal()
    {
        return numeroSucursal;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public String getCiudad()
    {
        return ciudad;
    }

    public void calculaPrecio(Paquete miPaquete)
    {

        double precio = miPaquete.getPeso() / 10;

        if (miPaquete.getPrioridad().equalsIgnoreCase("1"))
        {
            precio+=10;
        }
        else if (miPaquete.getPrioridad().equalsIgnoreCase("2"))
        {
            precio+=20;
        }
    }
}