package org.example;

import java.util.Scanner;

public class App {
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

        //variables
        boolean tryCatch;
        int numElfos = 0;
        int numEnanos = 0;
        int numPlazas = 0;

        System.out.println("Introduzca el número de elfos (N):");

        do {
            tryCatch = true;
            try {
                numElfos = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || numElfos < 0) {
                System.err.println("Introduzca un número (entero y positivo)");
                System.out.println();
            }
        }
        while(!tryCatch || numElfos < 0);

        System.out.println("Introduzca el número de enanos (M):");

        do {
            tryCatch = true;
            try {
                numEnanos = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || numEnanos < 0) {
                System.err.println("Introduzca un número (entero y positivo)");
                System.out.println();
            }
        }
        while(!tryCatch || numEnanos < 0);

        System.out.println("Introduzca el número de plazas (K) que tiene cada habitación de la posada:");

        do {
            tryCatch = true;
            try {
                numPlazas = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || numPlazas < 1) {
                System.err.println("Introduzca un número (entero y positivo)");
                System.out.println();
            }
        }
        while(!tryCatch || numPlazas < 1);

        delvolverNumeroHabitaciones(numElfos, numEnanos, numPlazas);
    }

    public static void delvolverNumeroHabitaciones (int N, int M, int K) {

        int numHabitacionesElfos = N/K;
        int numHabitacionesEnanos = M/K;

        if(N%K > 0){
            numHabitacionesElfos++;
        }

        if(M%K > 0){
            numHabitacionesEnanos++;
        }

        System.out.println("Número de habitaciones a reservar: " + (numHabitacionesElfos + numHabitacionesEnanos));
    }
    }
