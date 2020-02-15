package pidoras_poo;

public class Uso_vehículo
{

	public static void main(String[] args) 
	{
		/*Coche Renault=new Coche();//INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
		//clase objeto=operador nombre del método constructor

		System.out.println(Renault.dime_largo());


		System.out.println("Este coche tiene "+ Renault.dime_ruedas()+" ruedas");
		//                                       objeto.propiedad

		Coche micoche=new Coche();

		micoche.establece_color(JOptionPane.showInputDialog("introduce color"));

		System.out.println(micoche.dime_datos_generales());

		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("¿tiene asientos de cuero?"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿tiene climatizador?"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio del coche es "+micoche.precio_coche());*/

        Coche micoche1=new Coche();

		micoche1.establece_color("Rojo");

		Furgoneta miFurgoneta1=new Furgoneta(7,580);

		miFurgoneta1.establece_color("Azul");

		miFurgoneta1.configura_asientos("si");

		miFurgoneta1.configura_climatizador("si");

		System.out.println(micoche1.dime_datos_generales()+micoche1.dime_color());

		System.out.println(miFurgoneta1.dime_datos_generales()+miFurgoneta1.dimeDatosFurgoneta());
	}


}