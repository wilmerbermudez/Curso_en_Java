package ciclos;

import java.util.Scanner;


public class CicloWhiteV2 {
    public static void main(String[] args) {
        System.out.println("Por favor intriduce  el numero de elementos a iterar");
        int maxElementos;
        Scanner entradaEsacaner = new Scanner(System.in);
        maxElementos = entradaEsacaner.nextInt();
        int contador = 0;
        while (contador < maxElementos) {            
            System.out.println("Contador = " + contador);
            contador++;
        }
    }
}
