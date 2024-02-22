package Prestamos;

import java.util.Scanner;

public class Cliente {
    //Atributos 
    private String nombre;
    private int edad;
    private String direccion;
    
    //Metodos SETTER y GETTER
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        validarEdad(edad);
        this.edad = edad;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    //Demás Métodos
    public void validarEdad(int edad){
        
    Scanner sc = new Scanner(System.in);
    
        while (edad<18) {
            System.out.print("Tienes que ser mayor de edad\nIntentalo de nuevo: ");
            edad = sc.nextInt();
        }
    }
}
