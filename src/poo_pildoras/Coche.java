package poo_pildoras;

public class Coche //aqu� especificamos las caracter�sticas (propiedades) comunes de los objetos 
{
	private int ruedas;//ejemplo de encapsulaci�n para que estas variables no puedan modificarse desde otra clase
	///////
	private int largo;
	///////
	private int ancho;
	///////
	private int motor;
	///////
	private int peso_plataforma; 
	///////


	private String color;//estas variables s� que queremos que se puedan modificar desde otras calses

	private int peso_total;//estas variables s� que queremos que se puedan modificar desde otras calses

	private boolean asientos_cuero,climatiozador;//estas variables s� que queremos que se puedan modificar desde otras calses


	public Coche() //m�todo constructor,encargado de darle un estado inicial al obejeto: public + nombre clase ()
	//el flujo de ejecuci�n viene hasta aqu� a trav�s 
	//de la invocaci�n del constructor en el main.

	{
		ruedas=4;

		largo=2000;

		ancho=300;

		motor=1600;

		peso_plataforma=500;

	}

	public String dime_datos_generales() //funci�n
	{
		return "La plataforma del veh�cuo tiene "+ruedas+" ruedas "+" Mide \n"+largo/1000+
				" mertos con un ancho de  "+ancho+" cm y un peso de plataforma de \n"+ peso_plataforma+" kg ";
	}

	public String dime_largo() //funci�n
	//m�todo Getter(funci�n) que devuelve un string,puede acceder al largo a pesar de que 
	//est� encapsulado porque se encuentra dentro de la misma clase.
	{
		return "El largo del coche es "+largo;
	}

	public int dime_ruedas() //funci�n
	{
		return ruedas;
	}

	public void establece_color(String color_coche) //procedimiento
	//m�todo setter(procedimiento) encargado de modificar el  valor de una propiedad.
	{
		color=color_coche;
	}

	public String dime_color()//funci�n
	{
		return	"El color del coche es "+color;
	}

	public void configura_asientos(String asientos_cuero) // procedimiento SETTER
	{
		//this.asientos_cuero=asientos_cuero;//la palabra reservada this hace referencia a la variable de la clase
		if (asientos_cuero.equalsIgnoreCase("si"))//de esta forma se comparan los string en Java
		{
			this.asientos_cuero=true;
		}
		else
		{
			this.asientos_cuero=false;
		}
	}

	public String dime_asientos()//funci�n
	{
		if (asientos_cuero) 
		{
			return "El coche tiene asientos de cuero";
		}

		else 
		{
			return "El coche tiene asientos de serie";
		}
	}

	public void configura_climatizador(String climatiozador) //procedimiento
	{
		if(climatiozador.equalsIgnoreCase("si"))//de esta forma se comparan los string en Java
		{
			this.climatiozador=true;
		}

		else 
		{
			this.climatiozador=false;
		}
	}

	public String dime_climatizador() //funci�n
	{
		if(climatiozador)
		{
			return "El coche incorpora climatizador";
		}
		else 
		{
			return "El coche lleva aire acondicionado";
		}

	}

	public String dime_peso_coche() //setter  + getter (funci�n +procedimiento)
	{
		int peso_carroceria=500;

		int peso_platafoma=500;

		peso_total=peso_platafoma+peso_carroceria;

		if(asientos_cuero)
		{
			peso_total=peso_total+50;	
		}
		if(climatiozador)
		{
			peso_total=peso_total+20;			
		}

		return"El peso del coche es "+peso_total;
	}

	public int precio_coche() //funci�n
	{
		int precio_final=10000;

		if(asientos_cuero)
		{
			precio_final+=2000;
		}

		if(climatiozador)
		{
			precio_final+=1500;
		}
		return precio_final;
	}

}
