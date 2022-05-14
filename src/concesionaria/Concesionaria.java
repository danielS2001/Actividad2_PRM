/*
Concesionaria
 */
package concesionaria;

public class Concesionaria {


    public static void main(String[] args) {
        cotizacion coti = new cotizacion();
        coti.introducirDatos();
        coti.sacarPagoInicial();
        coti.sacarTotalFinal();
        coti.sacarPagoMensual();
        coti.imprimirCotizacion();
    }
    
}
