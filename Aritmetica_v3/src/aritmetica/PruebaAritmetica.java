package aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //creamos 2 variables locales
        int operandoA = 6;
        int operandoB = 2;
        
        //creamos el objeto de la clase Aritmetica envianod argumentos
        Aritmetica obj1 = new Aritmetica(operandoA, operandoB);
        
        //Imprimir operandos
        System.out.println("Operando A: " + operandoA + " y " + operandoB);
        
        //resultado de la suma
        System.out.println("\nResultado suma = " + obj1.sumar());
        
        //resultado resta
        System.out.println("\nResultado resta = " + obj1.restar());
        
        //resultado multiplicacion
        System.out.println("\nresultado multiplicacion = " + obj1.multiplicar());
        
        //resultado division
        System.out.println("\nResultado division = " + obj1.dividir());
    }
}
