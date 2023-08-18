/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiojava;

import java.util.Scanner;

/**
 *
 * @author julio cesar
 */
public class Sentencias {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Utilizar todas las sentencias if,esle if,swich, for, while, do-while. 
        
        Scanner entrada = new Scanner(System.in);
        String cadena = "nibjsandfoiahnsdvuhainuwdvgbasduvb.aksdvba.skudvba.ksdjbv.KSJDBVksdbv.SKJDBVAJL";
        System.out.println("---------------Sentencias-------------");
        int op;
        do {
            System.out.println("cadena: "+cadena);
            System.out.print("Ingresa\n"
                    + "1 Para conocer el tamaño de la cadena\n"
                    + "2 Para conocer cuantas minusculas existen en la cadena\n"
                    + "3 Para conocer cuantos puntos aparecen\n"
                    + "4 Para salir de porgrama\n"
                    + ":");
            op = entrada.nextInt();
            
            switch (op) {
                case 1:
                    //Si la cadena es grande o no 
                    System.out.println("---------------------------------------------------------------");
                    if (cadena.length() < 15) {
                        System.out.println("La cadena es pequeña, cantidad de caracteretes: "+cadena.length());
                    } else if (cadena.length() > 15 && cadena.length() < 50) {
                        System.out.println("La cadena es mediana, cantidad de caracteretes: "+cadena.length());
                    } else {
                        System.out.println("La cadena es grande, cantidad de caracteretes: "+cadena.length());
                    }
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 2:
                    //Contador de minusculas
                    System.out.println("---------------------------------------------------------------");
                    int contador = 0;
                    for (int i = 0; i < cadena.length(); i++) {
                        if ((cadena.charAt(i) >= 97 && cadena.charAt(i) <= 122)) {
                            contador++;
                        }
                    }

                    System.out.println("Numero de minusculas: " + contador);
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 3:
                    // cuenta los puntos que existen en la cadena
                    System.out.println("---------------------------------------------------------------");
                    int k = 0;
                    int c = 0;
                    while (k < cadena.length()) {
                        if (cadena.charAt(k) == 46) {
                            System.out.println("Encontre un punto en la posicion: " + k);
                            c++;
                        }
                        k++;
                    }
                    System.out.println("Total de puntos encontrados: " + c);
                    System.out.println("---------------------------------------------------------------");
                    break;
            }

        } while (op != 4);

    }
    
    
}

