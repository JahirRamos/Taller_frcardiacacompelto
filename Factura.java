public class Factura {
    /**ponemos los atributos*/
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidadAComprar;
    private double precioArticulo;

    /**Creamos el constructor con todos los atributos*/

    public Factura() {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidadAComprar = cantidadAComprar;
        this.precioArticulo = precioArticulo;
    }
/**Métodos propios de Java*/
    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidadAComprar() {
        return cantidadAComprar;
    }

    public void setCantidadAComprar(int cantidadAComprar) {
        this.cantidadAComprar = cantidadAComprar;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }

    /**Método para obtener el monto de la factura*/

    public double obtenerMontoFactura(){
     return cantidadAComprar*precioArticulo;
    }

    /**Metodo para imprimir el resumen de todo*/
    public void detalle(){
        System.out.println("El número de pieza es: "+this.numeroPieza);
        System.out.println("La descripción de la pieza es: "+this.descripcionPieza);
        System.out.println("La cantidad de productos a comprar es: "+this.cantidadAComprar);
        System.out.println("El precio del artículo es: "+this.precioArticulo);
        System.out.println("El monto total de la factura es: "+cantidadAComprar*precioArticulo);
    }
}
