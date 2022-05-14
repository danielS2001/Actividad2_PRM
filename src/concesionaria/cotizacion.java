/*
    Cotización.
 */
package concesionaria;

import java.util.Scanner;

public class cotizacion {
    //Atributos
    private int numeroCotizacion;
    private String descripcionAutomovil;
    private double precio;
    private double porcentajePagoInicial;
    private int plazo;
    
    private double pagoInicial;
    private double pagoFinal;
    private double pagoMensual;
    
    //Constructores
    //Constructor vacio
    cotizacion() {
        this.numeroCotizacion = 0;
        this.descripcionAutomovil = "";
        this.precio = 0.0;
        this.porcentajePagoInicial = 0.0;
        this.plazo = 0;
    }
    
    //Constructor de parametros
    cotizacion(int numeroCotizacion, String descripcionAutomovil, double precio, double porcentajePagoInicial, int plazo) {
        this.numeroCotizacion = numeroCotizacion;
        this.descripcionAutomovil = descripcionAutomovil;
        this.precio = precio;
        this.porcentajePagoInicial = porcentajePagoInicial;
        this.plazo = plazo;
    }
    
    //Constructor de copia
    cotizacion(cotizacion costo) {
        this.numeroCotizacion = costo.numeroCotizacion;
        this.descripcionAutomovil = costo.descripcionAutomovil;
        this.precio = costo.precio;
        this.porcentajePagoInicial = costo.porcentajePagoInicial;
        this.plazo = costo.plazo;
    }

    /**
     * @return the numeroCotizacion
     */
    public int getNumeroCotizacion() {
        return numeroCotizacion;
    }

    /**
     * @param numeroCotizacion the numeroCotizacion to set
     */
    public void setNumeroCotizacion(int numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
    }

    /**
     * @return the descripcionAutomovil
     */
    public String getDescripcionAutomovil() {
        return descripcionAutomovil;
    }

    /**
     * @param descripcionAutomovil the descripcionAutomovil to set
     */
    public void setDescripcionAutomovil(String descripcionAutomovil) {
        this.descripcionAutomovil = descripcionAutomovil;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the porcentajePagoInicial
     */
    public double getPorcentajePagoInicial() {
        return porcentajePagoInicial;
    }

    /**
     * @param porcentajePagoInicial the porcentajePagoInicial to set
     */
    public void setPorcentajePagoInicial(double porcentajePagoInicial) {
        this.porcentajePagoInicial = porcentajePagoInicial;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    //Funciones
    public void sacarPagoInicial() {
        pagoInicial = precio * (porcentajePagoInicial  / 100);
    }
    
    public void sacarTotalFinal() {
        pagoFinal = precio - pagoInicial;
    }
    
    public void sacarPagoMensual() {
        pagoMensual = pagoFinal / plazo;
    }
    
    public void introducirDatos() {
        Scanner b = new Scanner(System.in);
        System.out.print("Introduzca el numero de cotizacion: ");
        numeroCotizacion = b.nextInt(); b.nextLine();
        System.out.print("Introduzca una descripcion del automovil: ");
        descripcionAutomovil = b.nextLine();
        System.out.print("Introduzca el precio del automovil en MXN: ");
        precio = b.nextDouble(); b.nextLine();
        System.out.print("Introduzca el porcentaje de pago inicial en % (1 a 100): ");
        porcentajePagoInicial = b.nextDouble(); b.nextLine();
        System.out.print("Introduzca el plazo en meses: ");
        plazo = b.nextInt(); b.nextLine();
    }

    public void imprimirCotizacion() {
        System.out.println("**********************************************************************");
        System.out.println("El numero de cotizacion es " +numeroCotizacion);
        System.out.println("La descripcion es " +descripcionAutomovil);
        System.out.println("El precio del automovil es de $" +precio);
        System.out.println("El porcentaje de pago inicial es de %" +pagoInicial);
        System.out.println("El plazo es de " +plazo +" meses");
        System.out.println("Pago inicial: $" +pagoInicial);
        System.out.println("Total a fin: $" +pagoFinal);
        System.out.println("Pago mensual: $" +pagoMensual);
        
    }

}
