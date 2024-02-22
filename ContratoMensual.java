package Prestamos;


public class ContratoMensual extends Contrato {
    //Atributos 
    private int frecuenciaPago = 1;
    private String nombrePagos = "Mensuales";
    
    //Metodos
        
    public void setNombreContrato() {
        super.setNombreContrato("Contrato Mensual");
    }
    
    public double generarTotal(){
        double total = (super.generarCantidadPlazo()/frecuenciaPago);
        return total;
    }
    
    public String verContrato(){
        String concatenacion = "\n\tContrato\nCliente: "+cliente.getNombre()+"\nContrato: "+super.getNombreContrato()+"\nCantidad de prestamo: $"+cantidadPrestamo+"\nPlazo de liquidacion "+plazoLiquidacion+" meses"+"\nPagos: "+nombrePagos+"\nMonto de los pagos: $"+generarTotal();
        return concatenacion;
    }
    
    public void realizarContrato(){
        generarInteres();
        generarSubtotal();
        generarCantidadPlazo();
        generarTotal();
    }
}
