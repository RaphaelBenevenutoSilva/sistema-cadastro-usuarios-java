package projetos.bbbparedao;

import java.util.Locale;
import java.util.Scanner;

public class BbbParedao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        String[] nome = new String[3];
        long[] cpf = new long[3];
        long[] torcida = new long[3];
        double maiorMedia = -1;
        String eliminado = "";

        System.out.println("-".repeat(26));
        System.out.println("      PAREDÃO BBB 26");
        System.out.println("-".repeat(26));

        for (int i = 0; i < 3; i++) {

            System.out.print("NOME DO EMPAREDADO: ");
            nome[i] = teclado.nextLine();

            System.out.print("VOTOS UNICO (POR CPF): ");
            cpf[i] = Long.parseLong(teclado.next().replace(".", ""));

            System.out.print("VOTOS DA TORCIDA: ");
            torcida[i] = Long.parseLong(teclado.next().replace(".", ""));

            teclado.nextLine();
        }

        long totalCpf = cpf[0] + cpf[1] + cpf[2];
        long totalTorcida = torcida[0] + torcida[1] + torcida[2];

        for (int i = 0; i < 3; i++) {
            double pacoteCpf = (cpf[i] * 100.0) / totalCpf;
            double pacoteTorcida = (torcida[i] * 100.0) / totalTorcida;

            double resultadoFinal = (pacoteCpf * 0.7) + (pacoteTorcida * 0.3);

            if (resultadoFinal > maiorMedia) {
                maiorMedia = resultadoFinal;
                eliminado = nome[i];
            }

            System.out.printf("%-15s | VOTO UNICO: %6.2f%% | VOTO DA TORCIDA: %6.2f%% | RESULTADO FINAL:%6.2f%%\n",
                    nome[i], pacoteCpf, pacoteTorcida, resultadoFinal);
        }

        System.out.println("-".repeat(26));
        System.out.printf("Com %.2f%% dos votos, quem deixa o programa hoje é: %s%n", maiorMedia, eliminado);
        System.out.println("-".repeat(26));

    }
    
}
