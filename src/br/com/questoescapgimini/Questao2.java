package br.com.questoescapgimini;
import java.util.Scanner;

public class Questao2 {
    static int diff = 0;
    static int count = 0;

    static void DiffCount(Integer[] array) {
        for(int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length; j++ ) {
                int result = array[i] - array[j];
                if (diff == result){
                    count++;
                }
            }
        }
    }

    public static void main() {
        Integer[] array = new Integer[5];
        Scanner entry = new Scanner(System.in);

        System.out.println("Questao 2");
        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = entry.nextInt();
        }

        System.out.println("Digite o valor da diferença entre os pares: ");
        diff = entry.nextInt();

        DiffCount(array);

        System.out.println("Numero(s) de pares do vetor: " + count);
        System.out.println(" ");
    }
}
