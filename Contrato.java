package Prestamos;

public class Contrato {
    //Atributos
    protected double cantidadPrestamo;
    protected int plazoLiquidacion;
    protected Cliente cliente = new Cliente();
    
    
    //metodos SETTER y GETTER
    public void setCantidadPrestamo(double cantidad){
        cantidadPrestamo = cantidad;
    }
    
    public void setPlazoLiquidacion(int plazo){
       plazoLiquidacion = plazo;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
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
    
}
