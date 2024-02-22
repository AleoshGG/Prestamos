package Prestamos;

import java.util.Scanner;

public class Contrato {
    //Atributos
    protected String nombreContrato;
    protected double cantidadPrestamo;
    protected int plazoLiquidacion;
    protected Cliente cliente = new Cliente();
    
    
    //metodos SETTER y GETTER
    public void setCantidadPrestamo(double cantidad){
        validarCantidadPrestamo(cantidad);
        cantidadPrestamo = cantidad;
    }
    
    public void setPlazoLiquidacion(int plazo){
        validarPlazo(plazo);
        plazoLiquidacion = plazo;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public void setNombreContrato(String nombreContrato){
        this.nombreContrato = nombreContrato;
    }
    
    public String getNombreContrato(){
        return nombreContrato;
    }
    
    public double getCantidadPrestamo(){
        return cantidadPrestamo;
    }
    
    public int getPlazoLiquidacion(){
        return plazoLiquidacion;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    //demas metodos
    public double generarInteres(){
        double interes = cantidadPrestamo * 0.10;
        return interes;
    }
    
    public double generarSubtotal(){
        double subtotal = (generarInteres() + cantidadPrestamo);
        return subtotal;
    }
    
    public double generarCantidadPlazo(){
        double cantidadPlazo = (generarSubtotal()/plazoLiquidacion);
        return cantidadPlazo;
    }
    
    public void realizarContrato(){
    }
    
    public String verContrato(){
        String concatenacion = "";
        return concatenacion;
    }
    
    public void validarPlazo(int plazo){
        Scanner sc = new Scanner(System.in);
        
        while (plazo<1 || plazo>60) {
            System.out.println("No valido, intentalo de nuevo");
            System.out.print("Plazo de liquidacion (Meses): ");
            plazo = sc.nextInt();
        }
    }
    
    public void validarCantidadPrestamo(double monto){
        
    Scanner sc = new Scanner(System.in);
    
        while (monto<1000) {
            System.out.print("Monto no valido\nCantidad requerida (MXN): $");
            monto = sc.nextInt();
        }
    }
}
