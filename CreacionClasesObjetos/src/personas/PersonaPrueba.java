package personas;

public class PersonaPrueba {
    public static void main(String[] args) {
        //Creacion de objetos
        Persona p1 = new Persona();
        //Llamado a metodo  del objeto creado
        System.out.println("Valores por default del objeto Persona");
        p1.desplegarNombre();
        //Modificar los Valores
        p1.nombre = "Juan";
        p1.apellidoPaterno = "Esparza";
        p1.apellidoMaterno = "Lara";
        
        //Volvemos a llamar al metodo 
        System.out.println("\nNuevos valores del objeto persona");
        p1.desplegarNombre();
    }
    
}
