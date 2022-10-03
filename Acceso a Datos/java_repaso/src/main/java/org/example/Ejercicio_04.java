package org.example;

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main( String[] args ) {

        // ENUNCIADO
        // Riot ha lanzado un nuevo campeón de LOL. Dicho campeón puede utilizar una habilidad especial cuando su
        // carga se encuentra entre L y R. Cada golpe que recibe le proporciona una carga de S unidades. Determina el
        // número mínimo y máximo de golpes que permiten utilizar la habilidad en el rango proporcionado

        // ENTRADA
        // La primera línea especifica el número de casos de pruebas

        // SALIDA
        // Para cado caso de prueba, imprime el mínimo y máximo de golpes que permiten utilizar la habilidad en ek
        // rango proporcionado. Si el resultado no es válido imprimir -1 y 1

        Scanner keyboard = new Scanner(System.in);

        //variables
        int minValue = 0;
        int maxValue = 0;
        int charge = 0;
        boolean tryCatch;

        System.out.println( "Introduzca el valor mínimo del rango (L):" );

        do {
            tryCatch = true;
            try {
                minValue = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || minValue < 0) {
                System.err.println("Introduzca un número (entero y no negativo)");
                System.out.println();
            }
        }
        while(!tryCatch || minValue < 0);

        System.out.println( "Introduzca el valor máximo del rango (R):" );

        do {
            tryCatch = true;
            try {
                maxValue = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || maxValue < minValue) {
                System.err.println("Introduzca un número (entero e igual o superior a L)");
                System.out.println();
            }
        }
        while(!tryCatch || maxValue < minValue);

        System.out.println( "Introduzca la carga que proporciona cada golpe (S):" );

        do {
            tryCatch = true;
            try {
                charge = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || charge < 0) {
                System.err.println("Introduzca un número (entero y positivo)");
                System.out.println();
            }
        }
        while(!tryCatch || charge < 1);

        devolverNúmeroMaxMinGolpes(minValue, maxValue, charge);
    }
    public static void devolverNúmeroMaxMinGolpes (int L, int R, int S){

        int currentHits = 0;
        int minHits = 0;
        int maxHits = 0;
        boolean outRange = true;

        for(int currentCharge = S; currentCharge <= R; currentCharge = currentCharge + S){
            currentHits++;

            if(L <= currentCharge && currentCharge <= R){
                outRange = false;

                if(L <= currentCharge && currentCharge < L+S){
                    minHits = currentHits;
                }
                if (R-S < currentCharge && currentCharge <= R) {
                    maxHits = currentHits;
                }
            }
        }

        System.out.println("NÚMERO MÍNIMO Y MÁXIMO DE GOLPES QUE PERMITEN USAR LA HABILIDAD:");
        if(!outRange){
            System.out.println("a) Número mínimo de golpes: " + minHits);
            System.out.println("b) Número máximo de golpes: " + maxHits);
        }
        else{
            System.out.println("a) Número mínimo de golpes: ---");
            System.out.println("b) Número máximo de golpes: ---");
        }
    }
}
