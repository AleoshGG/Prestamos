package Prestamos;

public class Principal {


    public static void main(String[] args) {
        ContratoMensual contrato1 = new ContratoMensual();
        
        contrato1.getCliente().setNombre("Alesis");
        contrato1.setCantidadPrestamo(12000);
        contrato1.setPlazoLiquidacion(6);
        
        //operaciones
        contrato1.generarInteres();
        contrato1.generarSubtotal();
        contrato1.generarCantidadPlazo();
        contrato1.generarTotal();
        
        System.out.println(contrato1.verContrato());
    }
    
}
