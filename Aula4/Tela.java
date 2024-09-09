package org.example;

import java.util.Scanner;

public class Tela {

    public static Calculadora obterCalculadora() {
        System.out.println("Digite um numero:");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        System.out.println("Digite outro numero");

        double y = sc.nextDouble();

        sc.close();

        return new Calculadora(x, y);
    }


    public static void menuCalculadora(Opcao opcao) {

        Calculadora calculadora = obterCalculadora();

                System.out.println("Resultado: ");
        switch (opcao) {
            case ADD:
                System.out.println(calculadora.somar());
                break;

            case SUB:
                System.out.println(calculadora.subtrair());
                break;
            case MUL:
                System.out.println(calculadora.multiplicar());
                break;
            case DIV:
                try {
                    System.out.println(calculadora.dividir());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            case EXIT:
                System.out.println("Tchau");
                break;

            default:
                System.out.println("Tchau");



        }



    }


    public static void TelaInicial() {
        System.out.println(" ------- Calculadora -------");
        System.out.println("digite uma opção");
        System.out.println("1 -- Somar");
        System.out.println("2 -- Subtrair");
        System.out.println("3 -- Multiplicar");
        System.out.println("4 -- Dividir");
        System.out.println("Qualquer outro - Sair");
        Scanner sc = new Scanner(System.in);

        int opc = sc.nextInt();
        sc.close();
        Opcao opcao = Opcao.converter(opc);
        menuCalculadora(opcao);
    }

}
