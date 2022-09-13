package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner keyboard = new Scanner(System.in);

        //variables
        String matricula = "";
        boolean tryCatch;

        System.out.println( "Introduzca una matrícula con formato DDXDDD-DD (D = dígito distinto de 0, X = letra inglesa)" );

        do {
            tryCatch = true;
            try {
                matricula = keyboard.next();

                //comprobación longitud
                if(matricula.length() == 9) {

                    //comprobación dígitos
                    if (Character.isDigit(matricula.charAt(0)) && Character.isDigit(matricula.charAt(1)) && Character.isDigit(matricula.charAt(3))
                            && Character.isDigit(matricula.charAt(4)) && Character.isDigit(matricula.charAt(5))
                            && Character.isDigit(matricula.charAt(7)) && Character.isDigit(matricula.charAt(8))){

                    }
                    else{
                        tryCatch = false;
                    }

                    //comprobación letra
                    if(Character.isLetter(matricula.charAt(2))){

                    }
                    else{
                        tryCatch = false;
                    }

                    //comprobación guión
                    if(matricula.charAt(6) != '-'){
                        tryCatch = false;
                    }
                }
                else {
                    tryCatch = false;
                }
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch) {
                System.err.println("Introduzca un formato válido de matrícula (DDXDDD-DD)");
                System.out.println();
            }
        }
        while(!tryCatch);

        validacionMatrícula(matricula);
    }

    public static void validacionMatrícula (String matricula){

        int error = 0;
        int sumas [] = new int [6];

        //rellenado del array
        sumas[0] = matricula.charAt(0) + matricula.charAt(1);
        sumas[1] = matricula.charAt(1) + matricula.charAt(3);
        sumas[2] = matricula.charAt(3) + matricula.charAt(4);
        sumas[3] = matricula.charAt(4) + matricula.charAt(5);
        sumas[0] = matricula.charAt(5) + matricula.charAt(7);
        sumas[5] = matricula.charAt(7) + matricula.charAt(8);

        for(int i = 0; i < sumas.length; i++){

            if(sumas[i] % 2 != 0){
                error++;
            }

            if(matricula.charAt(2) == 'A' && matricula.charAt(2) == 'E' && matricula.charAt(2) == 'I' &&
                    matricula.charAt(2) == 'O' && matricula.charAt(2) == 'U' && matricula.charAt(2) == 'Y'){
                error++;
            }
        }

        if(error == 0){
            System.err.println("¡La matrícula es válida!");
        }
        else{
            System.err.println("¡La matrícula no es válida!");
        }
    }
}
