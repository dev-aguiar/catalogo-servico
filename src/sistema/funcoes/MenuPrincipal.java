package sistema.funcoes;

import java.util.Scanner;

public class MenuPrincipal {

    ListaProfissional listaProfissional = new ListaProfissional();
    Scanner sc = new Scanner(System.in);

    public void iniciarSistema() {
        System.out.println("\n>>> Catálogo de Serviços:\n");
        System.out.println("\nO que deseja fazer?\n"
                + "\n1 - Adicionar novo profissional\n"
                + "2 - Consultar profissionais cadastrados\n"
                + "3 - Procurar profissional por tipo de serviço\n"
                + "4 - Procurar profissional por cidade\n");
        System.out.println("Digite sua escolha:\n");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                listaProfissional.adicionarProfissional(null, null, null, null, null, 0);
                break;

            case 2:
                listaProfissional.listarProfissionalCadastrado();
                break;

            case 3:
                listaProfissional.procurarProfissionalPorServico(null);
                break;

            case 4:
                listaProfissional.procurarProfissionalCidade(null);
                break;

            default:
                System.out.print("\nOpção inválida! Tente novamente uma opção válida\n");
                break;
        }
        iniciarSistema();
    }
}