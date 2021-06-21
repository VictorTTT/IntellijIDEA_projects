package pildoras_Udemy_POO_Abstract;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Uso_Personas {

    public static void main(String[] args) {

        /* Ejemplo de error en Java: NO se puede instanciar una clase abstracta
        // Personas Juan=new Personas("Juan");

        // Instanciamos la clase empleados, darse cuenta de que en los parámetros del constructor llamamos
        // a su vez al constructor de la clase date
        Empleados Juan = new Empleados("Juan", 18000, new Date(5465454));

        System.out.println(Juan.getNombre());
        System.out.println(Juan.getDescripcion());

        /*Ahora instaciamos la clase jefes, al ejecutar el programa podremos comoprobar
         * que el método getDescription se comporta de la misma forma en Jefes que en empleados
         * esto es debido a que como jefes desciende de empleados utiliza el mismo metodo abstracto
         * que dicta la clase abstracta persona
        Jefes Ana = new Jefes("Ana", 35000, new Date(654546));
        Jefes David = new Jefes("David", 36000, new Date(1288888889));

        David.setCargo("Director de RRHH");
        System.out.println(David.getNombre());
        System.out.println(David.getDescripcion() + David.getCargo());

        Ana.setCargo("Analista de sistemas");
        System.out.println(Ana.getNombre());
        System.out.println(Ana.getDescripcion() + Ana.getCargo());

        /*Sin embargo, cuando utilizamos getDescription con la clase Alumnos, el resultado es distinto
         * porque el método ha sido implementado de una forma diferente
        Alumnos Maria = new Alumnos("María", "Dibujo", "Aula 5");

        System.out.println(Maria.getNombre());
        System.out.println(Maria.getDescripcion());*/

        Empleados[] losEmpleados = new Empleados[5];

        losEmpleados[0] = new Empleados("Víctor", 2500, new Date(123123123));
        losEmpleados[1] = new Empleados("María", 1500, new Date(123123123));
        losEmpleados[2] = new Empleados("Ana", 3500, new Date(123123123));
        losEmpleados[3] = new Empleados("Sandra", 6000, new Date(123123123));
        losEmpleados[4] = new Empleados("Antonio", 2100, new Date(123123123));

        // Vamos a ordenar el array dado mediante el método sort que proporciona la interfaz Comparable
        // para caulquier duda consultar con la api,
        Arrays.sort(losEmpleados);

        for (Empleados empleado :
                losEmpleados) {
            System.out.println(empleado.getDescripcion());
        }


        Jefes Manuel = new Jefes("Manuel", 5000, new Date(2134123));
        Empleados Sonia = new Empleados("Sonia", 3000, new Date(123123));

        System.out.println("El trabajdor " + Sonia.getNombre()+ " tiene un bonus de " + Sonia.setBonus(500));


    }

}
