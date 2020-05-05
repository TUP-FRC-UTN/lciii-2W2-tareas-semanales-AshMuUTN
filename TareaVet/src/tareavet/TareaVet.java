/*
 *  Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización
 *  de un software para obtener resultados sobre sus clientes y sus respectivas
 *  mascotas. (Suponer que cada cliente posee una sola mascota)
 *  Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente, un
 *  nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y una
 *  Mascota. De la Mascota se dispone los siguientes datos: el nombre y la edad.  
 *  El software requiere cargar un número n de Clientes (este valor deberá ser 
 *  cargado por teclado). Almacenar la información de los clientes en un arreglo.
 *  Se pide:
 *   Mostrar la cantidad de clientes.
 *   Mostrar el promedio de edad de las mascotas.
 *   Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.
 */
package tareavet;

import java.util.Scanner;

public class TareaVet {

  
    public static void main(String[] args) {
        String nombre;
        int antiguedad;
        String nombrePerro;
        int edadPerro;
        Mascota mascota;
        Scanner sc = new Scanner(System.in);
        int accEdad = 0;
        double edadPromedia;
        int clientesConAntiguedad = 0;
        
        
        System.out.println("Ingresar cantidad de clientes");
        int cantidadClientes = sc.nextInt();
        sc.nextLine();
        Cliente[] misClientes = new Cliente[cantidadClientes];
        
        
        
        for(int i = 0; i < cantidadClientes; i++){
            
            System.out.println("Ingresar el nombre del cliente " + (i + 1));
            nombre = sc.nextLine();
            
            System.out.println("Ingresar su antiguedad en años.");
            antiguedad = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Ingresar el nombre de su mascota");
            nombrePerro = sc.nextLine();
            
            System.out.println("Ingresar le edad de su mascota");
            edadPerro = sc.nextInt();
            sc.nextLine();
            
            mascota = new Mascota(edadPerro, nombrePerro);
            misClientes[i] = new Cliente(i+1, nombre, antiguedad, mascota);
            
            accEdad = accEdad + edadPerro;
            
            if(antiguedad >= 5){
                clientesConAntiguedad++;
            }
        }
        
        edadPromedia = accEdad / cantidadClientes;
        
        System.out.println("Actualmente hay " + cantidadClientes + " clientes");
        System.out.println("Sus mascotas tienen un promedio de " + edadPromedia + " años.");
        System.out.println("Y hay " + clientesConAntiguedad + " clientes con una antiguedad 5 o mas años.");
    }
    
}
