package projetos.bbbparedaoprogramalimpo;

import java.util.Locale;
import java.util.Scanner;

public class BbbParedaoProgramaLimpo {
          
       // Constantes
    static final double PESO_CPF = 0.7;
    static final double PESO_TORCIDA = 0.3;
    static final int TOTAL_PARTICIPANTES = 3;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        String[] nomes = new String[TOTAL_PARTICIPANTES];
        long[] cpf = new long[TOTAL_PARTICIPANTES];
        long[] torcida = new long[TOTAL_PARTICIPANTES];

        double maiorMedia = -1;
        String eliminado = "";

        linha();
        System.out.println("             PAREDÃO BBB 26");
        linha();

        // Entrada de dados
        for (int i = 0; i < TOTAL_PARTICIPANTES; i++) {

            System.out.print("Nome do emparedado: ");
            nomes[i] = teclado.nextLine();

            System.out.print("Votos únicos (CPF): ");
            cpf[i] = Long.parseLong(teclado.next().replace(".", ""));

            System.out.print("Votos da torcida: ");
            torcida[i] = Long.parseLong(teclado.next().replace(".", ""));

            teclado.nextLine(); // limpa buffer
        }

        long totalCpf = somar(cpf);
        long totalTorcida = somar(torcida);

        linha();

        // Processamento
        for (int i = 0; i < TOTAL_PARTICIPANTES; i++) {

            double percentualCpf = calcularPercentual(cpf[i], totalCpf);
            double percentualTorcida = calcularPercentual(torcida[i], totalTorcida);
            double mediaFinal = calcularMedia(percentualCpf, percentualTorcida);

            if (mediaFinal > maiorMedia) {
                maiorMedia = mediaFinal;
                eliminado = nomes[i];
            }

            System.out.printf(
                "%-15s | CPF: %6.2f%% | TORCIDA: %6.2f%% | FINAL: %6.2f%%\n",
                nomes[i], percentualCpf, percentualTorcida, mediaFinal
            );
        }

        linha();

        System.out.printf(
            "Com %.2f%% dos votos, quem sai é: %s\n",
            maiorMedia, eliminado
        );

        linha();

        teclado.close();
    }

    // ================= MÉTODOS =================

    public static void linha() {
        System.out.println("-".repeat(40));
    }

    public static long somar(long[] valores) {
        long soma = 0;
        for (long v : valores) {
            soma += v;
        }
        return soma;
    }

    public static double calcularPercentual(long valor, long total) {
        return (valor * 100.0) / total;
    }

    public static double calcularMedia(double cpf, double torcida) {
        return (cpf * PESO_CPF) + (torcida * PESO_TORCIDA);
    }
}
