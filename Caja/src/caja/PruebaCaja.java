package caja;

public class PruebaCaja {
    public static void main(String[] args) {
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        
        Caja res = new Caja(ancho, alto, profundo);
        
        System.out.println("Volumen Caja = " + res.calcularVolumen());
    }
}
