package org.example;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {

        // ENUNCIADO
        // Un grupo de guerreros van en viaje de exploración hacia Mordor. En total, el grupo está formado por N elfos
        // y M enanos. Durante su viaje, necesitan pasar la noche en varias posadas. Debes calcular el número de
        // habitaciones que necesitas reservar en cada posada, si cada habitación de la possada tiene K plazas,
        // teniendo en cuenta que los elfos no pueden dormir en la misma habitación que los enanos

        // ENTARDA
        // La primera línea especifica el número de casos de pruebas

        // SALIDA
        // Para cada caso de prueba, imprime un número que indique el número de habitaciones que se reservarán en
        // el hotel

        Scanner keyboard = new Scanner(System.in);

        // variables
        int numberElves = 0;
        int numberDwarfs = 0;
        int numberPlaces = 0;
        boolean tryCatch;

        System.out.println("Introduzca el número de elfos (N):");

        do {
            tryCatch = true;
            try {
                numberElves = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || numberElves < 0) {
                System.err.println("Introduzca un número (entero y positivo)");
                System.out.println();
            }
        }
        while(!tryCatch || numberElves < 0);

        System.out.println("Introduzca el número de enanos (M):");

        do {
            tryCatch = true;
            try {
                numberDwarfs = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || numberDwarfs < 0) {
                System.err.println("Introduzca un número (entero y positivo)");
                System.out.println();
            }
        }
        while(!tryCatch || numberDwarfs < 0);

        System.out.println("Introduzca el número de plazas (K) que tiene cada habitación de la posada:");

        do {
            tryCatch = true;
            try {
                numberPlaces = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || numberPlaces < 1) {
                System.err.println("Introduzca un número (entero y positivo)");
                System.out.println();
            }
        }
        while(!tryCatch || numberPlaces < 1);

        delvolverNumeroHabitaciones(numberElves, numberDwarfs, numberPlaces);
    }
    public static void delvolverNumeroHabitaciones (int N, int M, int K) {

        double numRoomsElves = Math.ceil((double) N/K);;
        double numRoomsDwarfs = Math.ceil((double) M/K);;

        //        if(N % K > 0){
        //            numRoomsElves++;
        //        }
        //
        //        if(M % K > 0){
        //            numRoomsDwarfs++;
        //        }

        System.out.println("Número de habitaciones a reservar: " + ((int) (numRoomsElves + numRoomsDwarfs)));
    }
    }
