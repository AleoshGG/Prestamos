package Prestamos;


public class ContratoQuincenal extends Contrato {
    //Atributos 
    private int frecuenciaPago = 2;
    private String nombrePagos = "Quincenales";
    
    //Metodos 
    public void setNombreContrato() {
        super.setNombreContrato("Contrato Quincenal");
    }
    public double generarTotal(){
        double total = (super.generarCantidadPlazo()/frecuenciaPago);
        return total;
    }
    
    public String verContrato(){
        String concatenacion = "\n\tContrato\nCliente: "+cliente.getNombre()+"\nContrato: "+nombreContrato+"\nCantidad de prestamo: $"+cantidadPrestamo+"\nPlazo de liquidacion "+plazoLiquidacion+" meses"+"\nPagos: "+nombrePagos+"\nMonto de los pagos: $"+generarTotal();
        return concatenacion;
    }
    
    public void realizarContrato(){
        generarInteres();
        generarSubtotal();
        generarCantidadPlazo();
        generarTotal();
    }
}
