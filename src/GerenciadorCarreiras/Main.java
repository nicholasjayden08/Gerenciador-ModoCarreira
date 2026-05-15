package GerenciadorCarreiras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorCarreira gerenciador = new GerenciadorCarreira();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== GERENCIADOR DE CARREIRA =====");
            System.out.println("1. Adicionar Clube");
            System.out.println("2. Contratar Jogador");
            System.out.println("3. Listar Elenco");
            System.out.println("4. Ver clube");
            System.out.println("0. Sair");
            System.out.println("Selecione uma Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do Clube: ");
                    String nome = scanner.nextLine();

                    System.out.println("Orçamento inicial: ");
                    double orcamento = scanner.nextDouble();
                    scanner.nextLine();

                    gerenciador.criarClube(nome, orcamento);
                    break;

                case 2 :
                    if (!gerenciador.clubeExiste()) {
                        System.out.println("Adicione um clube primeiro!");
                        break;
                    }

                    System.out.println("Nome do Jogador: ");
                    String nomeJogador = scanner.nextLine();

                    System.out.println("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Posição: ");
                    String posicao = scanner.nextLine();

                    System.out.println("Overall: ");
                    int overall = scanner.nextInt();

                    System.out.println("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    Jogador jogador = new Jogador(nomeJogador, idade, posicao, overall, valor);

                    boolean sucesso = gerenciador.contratarJogador(jogador);

                    if (sucesso) {
                        System.out.println("Jogador contratado com sucesso!");
                    }
                    break;

                case 3:
                    gerenciador.listarElenco();
                    break;

                case 4:
                    if (gerenciador.clubeExiste()) {
                        System.out.println("Clube: " + gerenciador.getClube().getNome());
                        System.out.println("Orçamento: " + gerenciador.getClube().getOrcamento());
                    }
                    else {
                        System.out.println("Nenhum clube registrado!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida!!");
            }
        }
        scanner.close();
    }
}
