import java.util.Scanner;

public class Exercicio0301 {
    private final static Scanner scanner = new Scanner(System.in);
    private final static CaixaAutomatico caixaAutomatico = new CaixaAutomatico();
    public static void main(String[] args) {
        int option;
        System.out.println("Primeiro vamos criar a sua conta. Por favor, informe o valor do seu depósito inicial:");
        double depositoInicial = scanner.nextDouble();
        ContaCorrente novaContaCorrente = new ContaCorrente(depositoInicial);
        System.out.println("Seu número de conta é: " + novaContaCorrente.getNumeroContaCorrente());
        System.out.println("Seu saldo é de: " + novaContaCorrente.getSaldoContaCorrente());
        System.out.println("Seu limite de conta (cheque especial) é: " + novaContaCorrente.getSaldoChequeEspecial());

        do {
            System.out.println("Selecione a opção desejada:");
            System.out.println("===========================");
            System.out.println("1) Consultar saldo;");
            System.out.println("2) Consultar cheque especial;");
            System.out.println("3) Depositar dinheiro;");
            System.out.println("4) Sacar dinheiro;");
            System.out.println("5) Pagar um boleto;");
            System.out.println("6) Verificar uso do cheque especial;");
            System.out.println("0) Sair;");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    caixaAutomatico.consultarSaldo(novaContaCorrente);
                    break;
                case 2:
                    caixaAutomatico.consultarChequeEspecial(novaContaCorrente);
                    break;
                case 3:
                    caixaAutomatico.depositarDinheiro(novaContaCorrente);
                    break;
                case 4:
                    caixaAutomatico.sacarDinheiro(novaContaCorrente);
                    break;
                case 5:
                    caixaAutomatico.pagarBoleto(novaContaCorrente);
                    break;
                case 6:
                    caixaAutomatico.verificarUsoChequeEspecial(novaContaCorrente);
                    break;
                default:
                    break;
            }
        }while(option != 0);
    }
}
