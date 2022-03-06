package br.com.questoescapgimini;
import java.util.Scanner;

public class Questao1 {
    static int N = 5;

   static void SelectionSort(Integer[] array) {
        int menor, troca;

        for (int i = 0; i < array.length - 1; i++) {
            menor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }
            if (i != menor) {
                troca = array[i];
                array[i] = array[menor];
                array[menor] = troca;
            }
        }
    }

    static void Mediana(Integer[] array) {
       int mediana = 0;

       mediana =  Math.round(N / 2);

       System.out.println("Mediana: " + array[mediana]);
    }

    public static void main() {
        Integer[] array = new Integer[N];
        Scanner entry = new Scanner(System.in);

        System.out.println("Questao 1");
        System.out.println("Digite os valores do vetor para encontrar a mediana: ");
        for( int i = 0; i < array.length; i++ ) {
            array[i] = entry.nextInt();
        }

        SelectionSort(array);
        Mediana(array);

            System.out.println("Vetor em ordem crescente: ");
            for(int i=0; i < array.length; i++){
                System.out.printf("%d ", array[i]);
            }
        System.out.println(" ");
        }

    }

