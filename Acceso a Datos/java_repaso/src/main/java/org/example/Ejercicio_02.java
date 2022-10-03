package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_02 {

    public static void main( String[] args ) {

        // ENUNCIADO
        // Cada vez Kylian Mbappé cambia de un equipo, elige un dorsal n. El grupo de amigos de Mbappé está
        // formado por aquellos jugadores en los que el producto de los dígitos de su dorsal será igual a n, y además
        // en este número no sale presente el dígito 1. Debemos calcular cuenta gente forma el grupo de amigos de
        // Mbappé

        // ENTRADA
        // Contiene un solo entero n (1 <= n <= 100)

        // SALIDA
        // Cantidad de gente que forma el grupos de amigos de Mbappé

        Scanner keyboard = new Scanner(System.in);

        // variables
        int number = 0;
        int[] prohibitedNumbers = new int[] {1,10,11,12,13,14,15,16,17,18,19,21,31,41,51,61,71,81,91,100};
        boolean tryCatch;

        System.out.println("Introduzca el dorsal (n) de Kylian Mbappé (1 <= n <= 100)");

        do {
            tryCatch = true;
            try {
                number = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || number < 1 || number > 100) {
                System.err.println("Introduzca un dorsal válido");
                System.out.println();
            }
        }
        while(!tryCatch || number < 1 || number > 100);

        devolverCantidadMiembros(number,prohibitedNumbers);
    }

    public static void devolverCantidadMiembros (int number, int[] prohibitedNumbers){

        int product;
        int value;
        int numberMembers = 0;
        boolean validNumber;

        for(int i = 0; i <= 100; i++){
            product = 1;
            value = i;
            validNumber = true;

            // comprobación de si el número está dentro de los dorsales prohibidos
            for(int x = 0; x < prohibitedNumbers.length; x++){
                if(value == prohibitedNumbers[x]){
                    validNumber = false;
                }
            }

            if(validNumber){
                // cálculo del producto del número
                do{
                    // fundamental usar la sentencia 'do while' para que el '0' también se someta al proceso
                    product = product * (value % 10);
                    value = value / 10;
                }
                while(value > 0);

                if(product == number){
                    numberMembers++;
                }
            }
        }

        System.out.println("Número de miembros del grupo: " + numberMembers);
    }
}
