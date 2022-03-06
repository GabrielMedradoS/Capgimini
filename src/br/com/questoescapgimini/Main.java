package br.com.questoescapgimini;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("Digite 1 - para Questao 1 \n" +
                                "Digite 2 - para Questao 2 \n" +
                                "Digite 3 - para Questao 3 \n" +
                                "Digite 0 - para sair do programa");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Questao1.main();
                    break;
                case 2:
                    Questao2.main();
                    break;
                case 3:
                    Questao3.main();
                    break;
                default:
                    System.out.println("Digite os valores corretos: 1, 2 ou 3");
                    break;
            }
        } while (escolha != 0);
    }
}
