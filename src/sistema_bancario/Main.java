package sistema_bancario;
import java.util.Scanner;
import sistema_bancario.conta.Conta;


public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta("Henrique", "123456", 4000);

        // Criando uma conta com nome, senha e saldo inicial
        String nome = conta.getNome();
        String senha = conta.getSenha();
        double saldo = conta.getSaldo();
        double chequeEspecial = conta.getChequeEspecial();
        

        System.out.println("Bem vindo ao nosso banco!");
        System.out.println("Aqui você pode criar sua conta e realizar operações bancárias.");

        System.out.println("Digite '1' para continuar o cadastro ou '0' para finalizar");
        int continuar = scanner.nextInt();


        

        if(continuar == 1) {

            System.out.println("Bem vindo " + nome + "!");

            System.out.println("Aqui temos algumas opções que nosso banco pode fazer: ");

            do {

            System.out.println("-----------------");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar um Boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("-----------------");
            System.out.println("Qual delas deseja? (digite o número da opção desejada)");
            String opcao = scanner.next();

            switch (opcao) {
                case "1": {
                    consultarSaldo(saldo);
                    break;
                }
                case "2": 
                    consultarChequeEspecial(chequeEspecial);
                    
                    break;
                
                case "3": 
                    System.out.println("Digite o valor que deseja depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    despositarDinheiro(saldo, valorDeposito);
                    break;
                
                case "4":
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorSaque = scanner.nextDouble();
                    sacarDinheiro(saldo, valorSaque);
                    break;

                case "5":
                    System.out.println("Digite o valor do boleto: ");
                    double valorBoleto = scanner.nextDouble();
                    pagarBoleto(saldo, valorBoleto);
                    break;
                case "6":

                    verificarChequeEspecial(saldo, chequeEspecial);
                    break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("Deseja fazer mais alguma operação? (digite '1' para continuar ou '0' para finalizar)");
            continuar = scanner.nextInt(); 

        } while (continuar == 1);



        }

        else if (continuar == 0)

        System.out.println("Finalizando cadastro!");


        scanner.close();

    }

    public static void consultarSaldo(double saldo) {
        System.out.println("Seu saldo é: " + "R$" + saldo);     
    }

    public static void consultarChequeEspecial(double chequeEspecial) {
        System.out.println("Seu cheque especial é: " + "R$" + chequeEspecial);     
    }

    public static void despositarDinheiro(double saldo, double valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Seu novo saldo é: " + "R$" + saldo);     
    }

    public static void sacarDinheiro(double saldo, double valorSaque) {
        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Seu novo saldo é: " + "R$" + saldo);     
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public static void pagarBoleto(double saldo, double valorBoleto) {
        if (valorBoleto <= saldo) {
            saldo -= valorBoleto;
            System.out.println("Seu novo saldo é: " + "R$" + saldo);     
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public static void verificarChequeEspecial(double saldo, double chequeEspecial) {
        if (saldo > 0) {
            System.out.println("Você está usando o cheque especial!");
        } else {
            System.out.println("Você não está usando o cheque especial!");
        }

}


}
