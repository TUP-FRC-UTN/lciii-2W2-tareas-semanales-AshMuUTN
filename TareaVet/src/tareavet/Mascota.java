
package tareavet;


public class Mascota {
    private int Edad;
    private String Nombre;
    
    public int getEdad(){
        return Edad;
    }
    
    public void setEdad(int edad){
        Edad = edad;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String nombre){
        Nombre = nombre;
    }

    public Mascota(int edad, String nombre){
        Edad = edad;
        Nombre = nombre;
    }
    public Mascota() {
        
    }
    
}
