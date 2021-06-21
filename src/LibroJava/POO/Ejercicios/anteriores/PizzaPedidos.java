package LibroJava.POO.Ejercicios;

public class PizzaPedidos {
    public static void main(String[] args) {

        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        System.out.println(p1); //pizza margarita mediana, pedida
        System.out.println(p2); //pizza funghi familiar, servida
        System.out.println(p3); //pizza cuatro quesos mediana, pedida
        p2.sirve();             //esa pizza ya se ha servido
        System.out.println("pedidas: " + Pizza.getTotalPedidas()); //pedidas: 3
        System.out.println("servidas: " + Pizza.getTotalServidas()); //servidas: 1*/
    }

}
