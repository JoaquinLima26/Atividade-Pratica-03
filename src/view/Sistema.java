package view;

import controller.CadastroFuncionario;
import controller.CalcularSalario;
import model.*;

public class Sistema {
    
    public static void executar() {

        int op;

        do {
            
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);
        
        
    }

    private static void exibirMenu() {

        System.out.println("\nGerenciamento de Funcionários");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Desenvolvedor");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("4) Listar Funcionários");
        System.out.println("5) Buscar Funcionário");
        System.out.println("6) Excluir Funcioário");
        System.out.println("0) Sair");
        System.out.print("Sua opção: ");

    }

    private static void cadastrarGerente() {

        System.out.println("\nCadastro de Gerente:");

        int matricula;
        while (true) {

            System.out.println("Matrícula: ");
            matricula = Console.lerInt();

            if (CadastroFuncionario.buscarFuncionario(matricula) != null) {
                System.out.println("\nGerente " + matricula +
                        " já se encontra cadastrado no sistema!");
            } else {
                break;
            }
        }

        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Valor da Hora: ");
        float valorHora = Console.lerFloat();
        System.out.println("Horas Trabalhadas: ");
        float horasTrab = Console.lerFloat();
        System.out.println("Bonus: ");
        float bonus = Console.lerInt();
        System.out.println("Equipe: ");
        String equipe = Console.lerString();

        Gerente gerente = new Gerente(nome, matricula, valorHora, horasTrab, bonus, equipe);

       CadastroFuncionario.cadastrarFuncionario(gerente);

        System.out.println("\nGerente cadastrado com sucesso!");

    }
    private static void cadastrarDesenvolvedor() {

        System.out.println("\nCadastro de Desenvolvedor:");

        int matricula;
        while (true) {

            System.out.println("Matrícula: ");
            matricula = Console.lerInt();

            if (CadastroFuncionario.buscarFuncionario(matricula) != null) {
                System.out.println("\nDesenvolvedor " + matricula +
                        " já se encontra cadastrado no sistema!");
            } else {
                break;
            }
        }

        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Matrícula: ");
        matricula = Console.lerInt();
        System.out.println("Valor da Hora: ");
        float valorHora = Console.lerFloat();
        System.out.println("Horas Trabalhadas: ");
        float horasTrab = Console.lerFloat();
        System.out.println("Tecnologias: ");
        String tecnologias = Console.lerString();


        Desenvolvedor desenvolvedor = new Desenvolvedor(nome, matricula, valorHora, horasTrab, tecnologias);

       CadastroFuncionario.cadastrarFuncionario(desenvolvedor);

        System.out.println("\nDesenvolvedor cadastrado com sucesso!");

    }
    private static void cadastrarEstagiario() {

        System.out.println("\nCadastro de Estagiário:");

        int matricula;
        while (true) {

            System.out.println("Matrícula: ");
            matricula = Console.lerInt();

            if (CadastroFuncionario.buscarFuncionario(matricula) != null) {
                System.out.println("\nEstagiário " + matricula +
                        " já se encontra cadastrado no sistema!");
            } else {
                break;
            }
        }

        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Matrícula: ");
        matricula = Console.lerInt();
        System.out.println("Valor da Hora: ");
        float valorHora = Console.lerFloat();
        System.out.println("Horas Trabalhadas: ");
        float horasTrab = Console.lerFloat();
        System.out.println("Supervisor: ");
        String supervisor = Console.lerString();

        Estagiario estagiario = new Estagiario(nome, matricula, valorHora, horasTrab, supervisor);

       CadastroFuncionario.cadastrarFuncionario(estagiario);

        System.out.println("\nGerente cadastrado com sucesso!");

    }
    private static void listarFuncionario() {

        System.out.println("\nLista de funcionários cadastrados:");

        if (CadastroFuncionario.listaFuncionariosVazia()) {
            System.out.println("\nNão há funcionários cadastrados...");
            return;
        }

        for (Funcionario tempFuncionario : CadastroFuncionario.getListaFuncionarios()) {
            System.out.println(tempFuncionario);
        }
    }

    private static boolean verificarListaVazia(String msg) {
        if (CadastroFuncionario.listaFuncionariosVazia()) {
            System.out.println(msg);
            return true;
        }

        return false;
    }


    private static void buscarFuncionario() {

        if (verificarListaVazia("\nNão há alunos cadastrados")) {
            return; 
        }

        System.out.println("\nInforme a matrícula do funcionário:");
        int matricula = Console.lerInt();

        Funcionario f = CadastroFuncionario.buscarFuncionario(matricula);

        if (f == null) {
            System.out.println("\nFuncionário " + matricula +
                    " não cadastrado");
            return; 
        }

        System.out.println("\nFuncionário localizado:");
        System.out.println(f.toString());

    }

    public static void excluirFuncionario(){

        System.out.println("\nExcluir Funcionário");
        System.out.print("Informe a matícula do funcionário: ");
        int matricula = Console.lerInt();

        if (CadastroFuncionario.excluir(matricula)){
            System.out.println("\nFuncionário foi rmeovido com sucesso!");
        } else {
            System.out.println("\nFuncionário " + matricula + " não localizado no cadastro");
        }
    
    }
    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                cadastrarGerente();
                break;

            case 2:
                cadastrarDesenvolvedor();
                break;

            case 3:
                cadastrarEstagiario();
                break;

            case 4:
                listarFuncionario();
                break;

            case 5:
                buscarFuncionario();
                break;

            case 6:
                excluirFuncionario();

            case 0:
                System.out.println("\nO sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente");
                break;
        }
    }

}
