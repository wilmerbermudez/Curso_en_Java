package aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //creamos objeto de la clase aritmetica
        Aritmetica a = new Aritmetica();
        //Llamamos  el metodo sumar  y recibimos  el valor devuelto
        int resultado = a.sumar(5, 3);
        System.out.println("Resultado = " + resultado);
    }
}
