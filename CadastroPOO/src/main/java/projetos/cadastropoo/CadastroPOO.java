package projetos.cadastropoo;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPOO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();
        int opcao;

        do {
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");
            try {
                opcao = sc.nextInt();
                sc.nextLine(); // Limpa o buffer
            } catch (Exception e) {
                System.out.println("Erro: Você deve digitar apenas números!");
                sc.nextLine(); // Limpa o que foi digitado de errado
                opcao = -1;  // Força o loop a continuar
                continue; // Volta para o início do do-while
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite 0 para voltar ao menu anterior");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    if (nome.equals("0")) {
                        break; // Sai do case 1 e volta para o menu
                    }

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    cadastro.adicionar(new Pessoa(nome, idade));
                    System.out.println("Cadastro realizado com sucesso");
                    break;

                case 2:
                    cadastro.listar();
                    break;

                case 3:
                    boolean encontrado = false;

                    while (!encontrado) {

                        System.out.println("\nDigite 0 para voltar ao menu anterior");
                        System.out.print("Buscar Nome: ");
                        String nomeBusca = sc.nextLine();

                        if (nomeBusca.equals("0")) {
                            break; // Sai do case 3 e volta para o menu anterior
                        }
                        encontrado = cadastro.buscar(nomeBusca); // Chama o método atualizado

                        if (!encontrado) {
                            System.out.println("Nome inválido ou não encontrado! Tente novamente");
                        }
                    }
                    break;

                case 4:
                    boolean removido = false;

                    while (!removido) {

                        System.out.println("\nDigite 0 para voltar ao menu anterior");
                        System.out.println("Remover Cadastro: ");
                        String nomeRemover = sc.nextLine();

                        if (nomeRemover.equals("0")) {
                            break; //Sai do case 4 e volta para o menu anterior

                        }
                        removido = cadastro.remover(nomeRemover);

                        if (!removido) {
                            System.out.println("Nome não encontrado! Tente novamente.");
                        } else {
                            System.out.println("Cadastro removido com sucesso! ");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...\n");
                    break;

                default:
                    System.out.println("Opção inválida! Digite novamente a opção correta.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}
