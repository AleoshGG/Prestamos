package Prestamos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Contrato> listaContratos = new ArrayList();
        
        //Hacer un contrato
        generarContrato(listaContratos);
        //Buscar contrato
        //Ver contratos existentes
        
        
        
    }
    
    public void verMenu(ArrayList listaContratos){
        Scanner sc = new Scanner (System.in);
        int opcion= 0;
        
        do{
            System.out.println("¿Què desea realizar");
            System.out.println("1. Hacer contrato\n2. Buscar contrato \n3. Imprimir contratos existentes");
            opcion = sc.nextInt();
        } while(opcion<1 || opcion>3);
        
        switch(opcion){
            case 1:
                generarContrato(listaContratos);
            break;
            
            case 2:
                buscarCliente(listaContratos);
                
            break;
            
            case 3:
            break;
            
            default:
                System.out.println("No valido");
            break;
        }
    }
    
    
    
    
    public static void generarContrato(ArrayList listaContratos){
        //Elejir el tipo de contrato
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("\n\tContratos");
            System.out.println("Elija el tipo de contrato de su interes: ");
            System.out.println("1. Contratos Mensuales\n2. Contratos Quincenales\n3. Contratos Semanales\n");
            opcion = sc.nextInt();
        } while (opcion<1 || opcion>3);
        
        switch(opcion){
            case 1:
                //Inicializacion de objetos
                ContratoMensual contrato = new ContratoMensual();
                contrato.setNombreContrato();
                
                System.out.println("\t"+contrato.getNombreContrato());
                
                //Operaciones con los objetos
                registrarCliente(contrato);
                llenarContrato(contrato);
                contrato.realizarContrato();
                
                //Añadiendo a la lista
                listaContratos.add(contrato);
            break;
            case 2:
                //Inicializacion de objetos
                ContratoQuincenal contrato1 = new ContratoQuincenal();
                contrato1.setNombreContrato();
               
                System.out.println("\t"+contrato1.getNombreContrato());
                
                //Operaciones con los objetos
                registrarCliente(contrato1);
                llenarContrato(contrato1);
                contrato1.realizarContrato();
                
                //Añadiendo a la lista
                listaContratos.add(contrato1);
            break;
            case 3:
                //Inicializacion de objetos
                ContratoSemanal contrato2 = new ContratoSemanal();
                contrato2.setNombreContrato();
               
                System.out.println("\t"+contrato2.getNombreContrato());
                
                //Operaciones con los objetos
                registrarCliente(contrato2);
                llenarContrato(contrato2);
                contrato2.realizarContrato();
                
                //Añadiendo a la lista
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
    
    public static void buscarCliente(ArrayList listaContratos){
        //Obtener nombre del cliente 
        
        //Buscar en la lista
        //Imprimir resultado cliente encontrado
    }
}
