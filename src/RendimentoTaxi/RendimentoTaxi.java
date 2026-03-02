import java.util.Scanner;

public class RendimentoTaxi {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {

            final double PRECO_COMBUSTIVEL = 4.90; // como o valor não muda, declaro como final

            // variaveis usadas, bom declarar semelhantes na mesma linha para manter o codigo
            // mais limpo
            double odometroInicio, odometroFinal;
            double litrosGastos, valorRecebido;
            double kmRodados, mediaConsumo;
            double gastoCombustivel, lucroLiquido;

            // Calculo do odometro
            System.out.print("Digite o odômetro no início do dia: ");
            odometroInicio = entrada.nextDouble();

            System.out.print("Digite o odômetro no final do dia: ");
            odometroFinal = entrada.nextDouble();

            if (odometroFinal < odometroInicio) {
                System.out.println("Erro: Odômetro final não pode ser menor que o inicial.");
                return;
            }

            // Calculo dos litros
            System.out.print("Digite os litros gastos: ");
            litrosGastos = entrada.nextDouble();

            if (litrosGastos <= 0) {
                System.out.println("Erro: Litros gastos deve ser maior que zero.");
                return;
            }

            // aqui o resultado
            System.out.print("Digite o valor recebido: ");
            valorRecebido = entrada.nextDouble();

            kmRodados = odometroFinal - odometroInicio;
            mediaConsumo = kmRodados / litrosGastos;
            gastoCombustivel = litrosGastos * PRECO_COMBUSTIVEL;
            lucroLiquido = valorRecebido - gastoCombustivel;

            System.out.printf("\nMédia (Km/l): %.2f\n", mediaConsumo);
            System.out.printf("Lucro líquido: R$ %.2f\n", lucroLiquido);

        }

    }

}