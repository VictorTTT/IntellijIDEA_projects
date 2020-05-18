package pidoras_Udemy_POO.EjerciciosUdemy_POO;

public class Paquete
{
    private String referencia;

    private double peso;

    private String dniRemitente;

    private String prioridad;

    public Paquete(String  referencia,double peso,String dniRemitente,String prioridad)
    {
        this.referencia=referencia;

        this.peso=peso;

        this.dniRemitente=dniRemitente;

        this.prioridad=prioridad;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public void setPrioridad(String prioridad)
    {
        this.prioridad = prioridad;
    }

    public double getPeso()
    {
        return peso;
    }

    public String getPrioridad()
    {
        return prioridad;
    }
}
