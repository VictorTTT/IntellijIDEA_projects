package poo_pildoras;

public interface Trabajadores
{
     double establece_bonus(double gratificacion);

     double bonus_base=1500;//las instancias declaradas dentro de las interfaces son de tipo final por defecto

        //los métodos de las interfaaces tan solo se definen,
        //no se codifica nada en su interior
}
