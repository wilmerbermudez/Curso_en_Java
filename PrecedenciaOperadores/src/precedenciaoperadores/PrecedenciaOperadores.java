package precedenciaoperadores;

public class PrecedenciaOperadores {

    public static void main(String[] args) {
        System.out.println("Primer Ejemplo Precedencia Operadores");
        
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        System.out.println("\nEjemplos Evaluacion");
        System.out.println(4 + 5 * 6 / 3);
        System.out.println((4 + 5) * (6 / 3));
        
        System.out.println("\nOtro ejemplo de Evaluacion");
        System.out.println(1 + 2 - 3 * 4 / 5);
        System.out.println(1 + 2 - (3 * (4 / 5)));
        
        System.out.println("\nOtro Ejemplo de Evaluacion");
        System.out.println("1 + 2 = " + 1 + 2); //Concatenacion resultado 12
        System.out.println("(1 + 2) = " + (1 + 2)); // Sumas resultado 3
        
        System.out.println("\nOtro Ejemplo");
        System.out.println(1 + 2 + "abc"); //Detecta una operacion primero
        System.out.println("abc" + 1 + 2); //Detecta una cadena primero
    }
    
}
