package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        Scanner keyboard = new Scanner(System.in);

        //variables
        boolean tryCatch;
        int dorsal = 0;
        int[] dorsalesProhibidos = new int[] {1,10,11,12,13,14,15,16,17,18,19,21,31,41,51,61,71,81,91,100};

        System.out.println("Introduzca el dorsal (n) de Kylian Mbappé (1 <= n <= 100)");

        do {
            tryCatch = true;
            try {
                dorsal = keyboard.nextInt();
            }
            catch (Exception e) {
                tryCatch = false;
                keyboard.next();
            }
            if(!tryCatch || dorsal < 1 || dorsal > 100) {
                System.err.println("Introduzca un dorsal válido");
                System.out.println();
            }
        }
        while(!tryCatch || dorsal < 1 || dorsal > 100);

        devolverCantidadMiembros(dorsal,dorsalesProhibidos);
    }

    public static void devolverCantidadMiembros (int dorsal, int dorsalesProhibidos []){

        int producto = 1;
        int numero = 0;

        int cantidadMiembros = 0;
        int match = 0;

        for(int i = 0; i <= 100; i++){
            producto = 1;
            numero = i;
            match = 0;

            //comprobación de si el número está dentro de los dorsales prohibidos
            for(int x = 0; x < dorsalesProhibidos.length; x++){
                if(i == dorsalesProhibidos[x]){
                    match++;
                }
            }

            if(match == 0){

                //cálculo del producto del número
                while(numero > 0) {
                    producto = producto * (numero % 10);
                    numero = numero / 10;
                }

                if(producto == dorsal){
                    cantidadMiembros++;
                }
            }
        }
        System.out.println("Número de miembros del grupo: " + cantidadMiembros);
    }
}
