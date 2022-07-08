package org.sofka;


import java.util.List;

public class App {

    List<Integer> listUno = List.of(3,2,3,4,5);
    List<Integer> listDos = List.of(6,7,8,9,10);

    public static void main(String[] args) {
        App app = new App();
        app.StartApp();
    }

    private void StartApp(){
        Calculadora calculator = new Calculadora();

        System.out.println("--------- Calculadora ------------");
        System.out.println("--------- Suma ------------");
        List<Integer> suma = calculator.suma(listUno, listDos);
        System.out.println("La suma las listas es: " + suma);

        System.out.println("--------- Resta ------------");
        List<Integer> resta = calculator.resta(listUno, listDos);
        System.out.println("La resta de las listas es: " + resta);

        System.out.println("--------- Multiplicacion ------------");
        List<Integer> multiplicacion = calculator.multiplicacion(listUno, listDos);
        System.out.println("La multiplicacion de las listas es: " + multiplicacion);

        System.out.println("--------- Divicion  ------------");
        List<Integer> division = calculator.division(listDos,listUno);
        System.out.println("La diviion de las listas es: " + division);

        System.out.println("--------- Modulo ------------");
        List<Integer> modulo = calculator.modulo(listUno, listDos);
        System.out.println("El modulo de las listas es: " + modulo);
    }
}
