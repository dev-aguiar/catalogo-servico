package sistema.funcoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaProfissional {

    private List<Profissional> profissionalList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void adicionarProfissional(String nome, String cidade, String estado, String servico, String instagram, long contato) {
        System.out.println("\nPara adicionar um novo profissional preencha as informações abaixo:");
        System.out.println("\nDigite o nome do profissional:");
        nome = sc.nextLine();

        System.out.println("\nDigite a cidade:");
        cidade = sc.nextLine();

        System.out.println("\nDigite o Estado:");
        estado = sc.nextLine();

        System.out.println("\nDigite o serviço:");
        servico = sc.nextLine();

        System.out.println("\nDigite o user do instagram:"
                + "\nuserprofissional (sem o @)");
        instagram = sc.nextLine();

        System.out.println("\nDigite o contato:"
                + "\n11912345678 (com o DDD e sem traço)");
        contato = sc.nextLong();
        sc.nextLine();

        profissionalList.add(new Profissional(nome, cidade, estado, servico, instagram, contato));
    }

    public void listarProfissionalCadastrado() {
        if (profissionalList.isEmpty() || profissionalList.equals(null)) {
            System.out.println("\nNenhum profissional cadastrado!");
            return;
        }
        System.out.println("\nExibindo profissionais cadastrados:");
        for (int i = 0; i < profissionalList.size(); i++) {
            Profissional profissional = profissionalList.get(i);
            System.out.println("\nCódigo: " + (i + 1)
                    + "\nNome: " + profissional.getNome()
                    + "\nCidade: " + profissional.getCidade()
                    + "\nEstado: " + profissional.getEstado()
                    + "\nServiço: " + profissional.getServico()
                    + "\nContato: " + profissional.getContato()
                    + "\nInstagram: " + profissional.getInstagram());
        }
    }

    public void procurarProfissionalCidade(String cidade) {
        System.out.println("\nDigite a cidade que deseja procurar um profissional:");
        cidade = sc.nextLine();
        List<Profissional> profissionalPorCidade = new ArrayList<>();
        for (Profissional p : profissionalList) {
            if (p.getCidade().equalsIgnoreCase(cidade)) {
                profissionalPorCidade.add(p);
            }
        }
        if (profissionalPorCidade.isEmpty()) {
            System.out.println("\nNenhum profissional cadastrado em " + cidade);
        } else {
            System.out.println("\nExibindo os profissionais disponíveis na cidade de " + cidade);
            for (Profissional profissional : profissionalPorCidade) {
                System.out.println(profissional);
            }
        }
    }

    public void procurarProfissionalPorServico(String servico) {
        System.out.println("\nDigite o serviço que deseja procurar um profissional:");
        servico = sc.nextLine();
        List<Profissional> profissionalPorServico = new ArrayList<>();
        for (Profissional p : profissionalList) {
            if (p.getServico().equalsIgnoreCase(servico)) {
                profissionalPorServico.add(p);
            }
        }
        if (profissionalPorServico.isEmpty()) {
            System.out.println("\nNenhum profissional cadastrado para o serviço " + servico);
        } else {
            System.out.println("\nExibindo os profissionais que trabalham com " + servico);
            for (Profissional profissional : profissionalPorServico) {
                System.out.println(profissional);
            }
        }
    }
}
