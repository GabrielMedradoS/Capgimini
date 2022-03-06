package br.com.questoescapgimini;

import java.util.Scanner;

public class Questao3 {

    public static void main() {
        Scanner entry = new Scanner(System.in);
        char[][] array = new char[10][10];
        String phrase;

        System.out.println("Questao 3");
       System.out.print("Informe sua string para ser encriptada: \n");
        phrase = entry.nextLine();

        String result = phrase.replace(" ", "");

        int NumberOfCharacters = (int)Math.ceil(Math.sqrt(result.length()));

        int x = 0;
        for (int i = 0; i < NumberOfCharacters; i++) {
            for ( int j = 0; j < NumberOfCharacters; j++) {
                if(x < result.length()) {
                    array[i][j] = result.charAt(x++);
                }
            }
        }

        System.out.println("mensagem encriptada: ");
        for (int i = 0; i < NumberOfCharacters; i++) {
            for ( int j = 0; j < NumberOfCharacters; j++) {
                System.out.print(array[j][i]);
            }
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
