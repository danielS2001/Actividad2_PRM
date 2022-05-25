/*
Concesionaria
 */
package concesionaria;

public class Concesionaria {


    public static void main(String[] args) {
        Cotizacion coti = new Cotizacion();
        coti.introducirDatos();
        coti.sacarPagoInicial();
        coti.sacarTotalFinal();
        coti.sacarPagoMensual();
        coti.imprimirCotizacion();
    }
    
}
