package aritmetica;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    //recordar que si agregamos un construtor distinto al vacio
    //ya no se crea este constructor y nososotro debemos crearlos is lo necesitamos
    Aritmetica(){}
    
    //Constructor con 2 argumentos
    Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
    }
    //Este metodo toma los atributos  de la clase
    int sumar(){
        return a + b;
    }
    //Metodo restar
    int restar(){
        return a - b;
    }
    
    //Metodo multiplicar
    int multiplicar (){
        return a * b;
    }
    
    //Metodo dividir
    int dividir(){
        return a / b;
    }
}
