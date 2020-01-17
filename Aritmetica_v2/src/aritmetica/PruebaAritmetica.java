package aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //creamos objeto de la clase aritmetica con el constructor vacio
        Aritmetica obj1 = new Aritmetica();
        //Llamamos  el metodo sumar  y recibimos  el valor devuelto
        int resultado = obj1.sumar(5, 4);
        System.out.println("Resultado suma directa obj1 = " + resultado);
        
        //si llamamos directamente el metodo sumar sin argumentos 
        // el valor es cero, ya que los atributos del objeto nunca se inicializaron
        //ya que no se  uso el contructor con argumentos, sino el contructor vacio
        System.out.println("Resultado suma de atributos obj1 = " + obj1.sumar());
        
        //Ahora creamos un objeto con el constructor con 2 argurmentos
        Aritmetica obj2 = new Aritmetica(2, 1);
        
        //Imprimimos directamente el resultado.
        //Al llamar directamente el metodo suma, nos regresa el valor de la suma
        System.out.println("\nResultado suma de atributos onj2 = " + obj2.sumar());
    }
}
