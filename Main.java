import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**Creamos el objeto llamado factura*/
     Factura factura = new Factura();
     Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de una factura");
        System.out.print("Ingrese el número de pieza-> ");
        factura.setNumeroPieza(sc.nextLine());
        System.out.print("Ingrese la descripción de la pieza-> ");
        factura.setDescripcionPieza(sc.nextLine());
        System.out.print("Ingrese la cantidad a comprar-> ");
        factura.setCantidadAComprar(sc.nextInt());
        System.out.print("Ingrese el precio del artículo-> ");
        factura.setPrecioArticulo(sc.nextDouble());

        /**LLamar a las funciones*/
       factura.obtenerMontoFactura();
       factura.detalle();
    }
}