import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) { // estudei e vi que o try abre e fecha o scanner, e que é uma
            // boa pratica usar ele

            // solicita o primeiro numero
            double numero1;
            System.out.println("digite um numero ");
            numero1 = teclado.nextDouble();

            // solicita o segundo numero
            double numero2;
            System.out.println("digite o segundo numero ");
            numero2 = teclado.nextDouble();

            // menu numerico para evitar erro de digitação
            System.out.println("Qual operacao deseja fazer: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            int opcao = teclado.nextInt();

            switch(opcao) {

                case 1:
                    System.out.println("O resultado da soma é " + (numero1 + numero2));
                    break;

                case 2:
                    System.out.println("O resultado da subtracao é " + (numero1 - numero2));
                    break;

                case 3:
                    System.out.println("O resultado da multiplicacao é " + (numero1 * numero2));
                    break;

                case 4:
                    if (numero2 != 0) {
                        System.out.println("O resultado da divisao é " + (numero1 / numero2));
                    }
                    else {
                        System.out.println("Nao e possivel dividir por 0");
                    }
                    break;

                default:
                    System.out.println("Operacao Invalida");
            }
        }
    }
}