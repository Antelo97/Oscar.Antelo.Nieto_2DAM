package org.example;

import java.util.Scanner;

public class Ejercicio_01 {

    public static void main( String[] args ) {

        // ENUNCIADO
        // Un camión entra en la ciudad de Albuquerque. Mike es uno de los vigilantes de un laboratorio de dudosa
        // legalidad de la ciudad. Un camiñon se acerca a la posición de Mike y solicita entrar en las instalaciones
        // Mike sabe que una matrícula se valida si la suma de cada dos dígitos consecutivos de la misma es par y su
        // letra no es vocal. Crea un programa que ayude a determinar si la matrícula del camión es válida o no

        // Nota: Se consideran las letras "A", "E", "I", "O", "U", "Y" como vocales

        // ENTRADA
        // La primera línea contiene una cadena de longitud 9. El formato es "DDXDDD-DD", donde D representa un
        // dígito (distinto de cero) y X una letra inglesa mayúscula

        // SALIDA
        // Imprima "valid" (sin comillas) si la etiqueta es válida, imprima "invalid" de lo contrario (sin comillas)

        Scanner keyboard = new Scanner(System.in);

        // variables
        String registration = "";
        boolean tryCatch;

        System.out.println( "Introduzca una matrícula con formato DDXDDD-DD (D = dígito distinto de 0, X = letra inglesa)" );

        do {
            tryCatch = true;
            try {
                registration = keyboard.next().toUpperCase();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || !validacionFormato(registration)) {
                System.err.println("Introduzca un formato válido de matrícula (DDXDDD-DD)");
                System.out.println();
            }
        }
        while(!tryCatch || !validacionFormato(registration));

        validacionMatrícula(registration);
    }
    public static boolean validacionFormato (String registration){

        boolean validFormat = true;

        // comprobación longitud
        if(registration.length() != 9){
            validFormat = false;
        }
        // comprobación dígitos
        else if (!Character.isDigit(registration.charAt(0)) || !Character.isDigit(registration.charAt(1)) || !Character.isDigit(registration.charAt(3))
                || !Character.isDigit(registration.charAt(4)) || !Character.isDigit(registration.charAt(5))
                || !Character.isDigit(registration.charAt(7)) || !Character.isDigit(registration.charAt(8))) {
            validFormat = false;
        }
        // comprobación letra
        else if(!Character.isLetter(registration.charAt(2))){
            validFormat = false;
        }
        // comprobación guión
        else if(registration.charAt(6) != '-'){
            validFormat = false;
        }

        return validFormat;
    }
    public static void validacionMatrícula (String registration){

        boolean validRegistrarion = true;
        int sums [] = new int [4];

        // rellenado del array
        sums[0] = registration.charAt(0) + registration.charAt(1);
        sums[1] = registration.charAt(3) + registration.charAt(4);
        sums[2] = registration.charAt(4) + registration.charAt(5);
        sums[3] = registration.charAt(7) + registration.charAt(8);

        // comprobación letra vocal
        if(registration.charAt(2) == 'A' || registration.charAt(2) == 'E' || registration.charAt(2) == 'I' ||
                registration.charAt(2) == 'O' || registration.charAt(2) == 'U' || registration.charAt(2) == 'Y'){
            validRegistrarion = false;
        }
        // comprobación sumas pares
        else{
            for(int i = 0; i < sums.length; i++) {

                if (sums[i] % 2 != 0) {
                    validRegistrarion = false;
                }
            }
        }

        if(validRegistrarion){
            System.out.println("¡La matrícula " + registration + " es válida!");
        }
        else{
            System.err.println("¡La matrícula " + registration + " no es válida!");
        }
    }
}
