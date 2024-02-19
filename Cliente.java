package Prestamos;

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
}
