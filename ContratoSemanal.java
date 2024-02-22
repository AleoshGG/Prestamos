package Prestamos;


public class ContratoSemanal extends Contrato {
    //Atributos 
    private int frecuenciaPago = 4;
    private String nombrePagos = "Semanales";
    
    //Metodos
    public void setNombreContrato() {
        super.setNombreContrato("Contrato Semanal");
    }
    
    public double generarTotal(){
        double total = (super.generarCantidadPlazo()/frecuenciaPago);
        return total;
    }
    
    public String verContrato(){
        String concatenacion = "\n\tContrato\nCliente: "+cliente.getNombre()+"\nContrato: "+nombreContrato+"\nCantidad de prestamo: $"+cantidadPrestamo+"\nPlazo de liquidacion "+plazoLiquidacion+" meses"+"\nPagos: "+nombrePagos+"\nMonto de los pagos: $"+generarTotal();
        return concatenacion;
    }
}

