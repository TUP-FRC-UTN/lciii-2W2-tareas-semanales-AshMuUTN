
package tareavet;

public class Cliente {
    
    private int NroCliente;
    private String Nombre;
    private int Antiguedad;
    private Mascota Mascota;
    
    public int getNroCliente(){
        return NroCliente;
    }
    
    public void setNroCliente(int nroCliente){
        NroCliente = nroCliente;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    
    public int getAntiguedad(){
        return Antiguedad;
    }
    
    public void setAntiguedad(int antiguedad){
        Antiguedad = antiguedad;
    }
    
    public Mascota getMascota(){
        return Mascota;
    }
    
    public void setMascota(Mascota mascota){
        Mascota = mascota;
    }
    
    public Cliente(int nroCliente, String nombre, int antiguedad, Mascota mascota){
        NroCliente = nroCliente;
        Nombre = nombre;
        Antiguedad = antiguedad;
        Mascota = mascota; 
    }

    public Cliente() {
    }
    
}
