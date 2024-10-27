package classeEobjeto;

import java.util.Scanner;

public class ContaMain {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Conta usuario = new Conta();
        char opcao;

        do {
            System.out.println(" 1 - Cadastrar uma conta de cliente\n" +
                    "2 - Mostrar saldo da conta\n" +
                    "3 - Sacar dinheiro da conta\n" +
                    "4 - Depositar dinheiro na conta\n" +
                    "5 - Finalizar operações");
            opcao = scan.next().charAt(0);
            switch (opcao) {
                case '1':
                    System.out.println("Iniciando o cadastramento...");
                    cadastroDeUsuatio(usuario);
                    break;
                case '2':
                    System.out.println("Saldo atual: " + usuario.getSaldo());
                    break;
                case '3':
                    double valorSaque;
                    boolean saqueRealizado;
                    System.out.println("Digite o valor do saque");
                    valorSaque = scan.nextDouble();
                    saqueRealizado = usuario.sacarDinheiro(valorSaque);
                    if (saqueRealizado == false) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("Saque realizado com sucesso");
                    }
                    break;
                case '4':
                    System.out.println("Inciando deposito..");
                    System.out.print("Insira o valor: ");
                    usuario.depositarDinheiro(scan.nextDouble());
                    break;
                case '5':
                    System.out.println("Finalisando a operação...");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (opcao != '5');
    }

    static void cadastroDeUsuatio(Conta usuario) {
        System.out.println("Digite o número da conta");
        usuario.setNumeroConta(scan.nextInt());
        System.out.println("Insira o Titular da conta");
        usuario.setTitular(scan.next());
        System.out.println("Insira o saldo disponivel");
        usuario.setSaldo(scan.nextDouble());
    }
}
