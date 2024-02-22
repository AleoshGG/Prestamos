package Prestamos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        /*ContratoQuincenal contrato1 = new ContratoQuincenal();
        
        contrato1.getCliente().setNombre("Alesis");
        contrato1.setCantidadPrestamo(12000);
        contrato1.setPlazoLiquidacion(3);
        
        //operaciones
        contrato1.generarInteres();
        contrato1.generarSubtotal();
        contrato1.generarCantidadPlazo();
        contrato1.setNombreContrato();
        
        
        
        System.out.println(contrato1.verContrato());*/
        
        ArrayList<Contrato> listaContratos = new ArrayList();
        
        //Hacer un contrato
        generarContrato(listaContratos);
        //Buscar contrato
        //Ver contratos existentes
        
    }
    
    public static void generarContrato(ArrayList listaContratos){
        //Elejir el tipo de contrato
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("\n\tContratos");
            System.out.println("Elija el tipo de contrato de su interes: ");
            System.out.println("1. Contratos Mensuales\n2. Contratos Quincenales\n1. Contratos Semanales\n");
            opcion = sc.nextInt();
        } while (opcion<1 || opcion>3);
        
        switch(opcion){
            case 1:
                System.out.println("\tContrato Mensual");
                ContratoMensual contrato = new ContratoMensual();
                registrarCliente(contrato);
                llenarContrato(contrato);
                listaContratos.add(contrato);
            break;
            case 2:
                System.out.println("\tContrato Quincenal");
                ContratoQuincenal contrato1 = new ContratoQuincenal();
                registrarCliente(contrato1);
                llenarContrato(contrato1);
                listaContratos.add(contrato1);
            break;
            case 3:
                System.out.println("\tContrato Semanal");
                ContratoSemanal contrato2 = new ContratoSemanal();
                registrarCliente(contrato2);
                llenarContrato(contrato2);
                listaContratos.add(contrato2);
            break;
            default:System.out.println("No valido");
            break;
        }
    }
    
    public static void registrarCliente(Contrato contrato){
        
        Scanner sc = new Scanner(System.in);
        String nombre,direccion;
        int edad;
        
        //Captura de datos
        System.out.println("\tRegistro del cliente");
        
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        
        System.out.print("Edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Direccion: ");
        direccion = sc.nextLine();
        
        //Asignacion de datos
        contrato.getCliente().setNombre(nombre);
        contrato.getCliente().setEdad(edad);
        contrato.getCliente().setDireccion(direccion);
       
    }
    
    public static void llenarContrato(Contrato contrato){
        
        Scanner sc = new Scanner(System.in);
        double monto;
        int plazo;
        
        //Captura de datos
        System.out.println("\tAcerca del prestamo");
        
        System.out.print("Cantidad requerida (MXN): $");
        monto = sc.nextDouble();
        
        System.out.print("Plazo de liquidacion (Meses): ");
        plazo = sc.nextInt();
        
        //Asignacion de datos
        contrato.setCantidadPrestamo(monto);
        contrato.setPlazoLiquidacion(plazo);
        
    }
    
}
