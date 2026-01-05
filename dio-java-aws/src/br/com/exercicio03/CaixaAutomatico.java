package br.com.exercicio03;

import java.util.Scanner;

public class CaixaAutomatico {
    private ContaCorrente contaCorrente;
    private static Scanner scanner = new Scanner(System.in);

    public void consultarSaldo(ContaCorrente contaCorrente) {
        System.out.println("======================================================");
        System.out.println("Seu saldo é de: " + contaCorrente.getSaldoContaCorrente());
        System.out.println("======================================================");
    }

    public void consultarChequeEspecial(ContaCorrente contaCorrente) {
        System.out.println("======================================================");
        System.out.println("Seu saldo do cheque especial é de: " + contaCorrente.getSaldoChequeEspecial());
        System.out.println("======================================================");
    }

    public void depositarDinheiro(ContaCorrente contaCorrente) {
        System.out.println("======================================================");
        System.out.println("Quanto você gostaria de depositar?");
        double valorParaDeposito = scanner.nextDouble();
        var saldoContaTemp = contaCorrente.getSaldoContaCorrente();

        if(saldoContaTemp == 0) {
            double valorChequeEspecialTemp = contaCorrente.getValorChequeEspecial();
            double saldoChequeEspecialTemp = contaCorrente.getSaldoChequeEspecial();
            saldoChequeEspecialTemp = valorChequeEspecialTemp - saldoChequeEspecialTemp;

            if(saldoChequeEspecialTemp != valorChequeEspecialTemp) {
                var valorParaDepositoFinal = valorParaDeposito - saldoChequeEspecialTemp;
                saldoChequeEspecialTemp = saldoChequeEspecialTemp + valorParaDepositoFinal;
                contaCorrente.setSaldoChequeEspecial(saldoChequeEspecialTemp);
                valorParaDepositoFinal = (valorParaDeposito - valorParaDepositoFinal) + contaCorrente.getSaldoContaCorrente();
                contaCorrente.setSaldoContaCorrente(valorParaDepositoFinal);
                
            }else {
                saldoContaTemp = saldoContaTemp + valorParaDeposito;
                contaCorrente.setSaldoContaCorrente(saldoContaTemp);
            }
        }

        System.out.println("Seu novo saldo é de: " + contaCorrente.getSaldoContaCorrente());
        System.out.println("======================================================");
    }

    public void sacarDinheiro(ContaCorrente contaCorrente) {
        double saldoContaTemp = 0;
        System.out.println("======================================================");
        System.out.println("Quanto você gostaria de sacar?");
        double valorParaSaque = scanner.nextDouble();

        if(valorParaSaque <= contaCorrente.getSaldoContaCorrente()) {
            saldoContaTemp = contaCorrente.getSaldoContaCorrente() - valorParaSaque;
            contaCorrente.setSaldoContaCorrente(saldoContaTemp);
        }else if(valorParaSaque > contaCorrente.getSaldoContaCorrente()) {
            if(valorParaSaque <= (contaCorrente.getSaldoContaCorrente() + contaCorrente.getSaldoChequeEspecial())) {
                var saldoTemp = contaCorrente.getSaldoContaCorrente() - valorParaSaque;
                contaCorrente.setSaldoContaCorrente(00);
                if(saldoTemp < 0)
                    saldoTemp = Math.abs(saldoTemp);
                
                saldoTemp = contaCorrente.getSaldoChequeEspecial() - saldoTemp;
                contaCorrente.setSaldoChequeEspecial(saldoTemp);
            }else
                System.out.println("Saldo insuficiente!");
        }
        
        System.out.println("A quantia de: " + valorParaSaque + " foi sacada. Seu novo saldo é de: " + contaCorrente.getSaldoContaCorrente());
        System.out.println("======================================================");
    }

    public void pagarBoleto(ContaCorrente contaCorrente) {
        System.out.println("======================================================");
        System.out.println("Informe o valor do boleto à ser pago:");
        double valorBoleto = scanner.nextDouble();
        double saldoContaTemp;
        
        if(valorBoleto <= contaCorrente.getSaldoContaCorrente()) {
            System.out.println("O valor do boleto é menor ou igual ao valor disponivel em conta");
            saldoContaTemp = contaCorrente.getSaldoContaCorrente() - valorBoleto;
            contaCorrente.setSaldoContaCorrente(saldoContaTemp);
        }else if(valorBoleto > contaCorrente.getSaldoContaCorrente()) {
            if(valorBoleto <= (contaCorrente.getSaldoContaCorrente() + contaCorrente.getSaldoChequeEspecial())) {
                var saldoTemp = contaCorrente.getSaldoContaCorrente() - valorBoleto;
                contaCorrente.setSaldoContaCorrente(00);
                if(saldoTemp < 0)
                    saldoTemp = Math.abs(saldoTemp);
                
                saldoTemp = contaCorrente.getSaldoChequeEspecial() - saldoTemp;
                contaCorrente.setSaldoChequeEspecial(saldoTemp);
            }else
                System.out.println("Saldo insuficiente!");
        }

        System.out.println("O boleto foi pago com sucesso. Seu saldo é de: " + contaCorrente.getSaldoContaCorrente());
        System.out.println("======================================================");
    }

    public void verificarUsoChequeEspecial(ContaCorrente contaCorrente) {
        System.out.println("======================================================");
        double saldoChequeEspecial = contaCorrente.getSaldoChequeEspecial();
        double valorChequeEspecial = contaCorrente.getValorChequeEspecial();
        var valorChequeEspecialTemp = valorChequeEspecial - saldoChequeEspecial;
        System.out.println("Você está utilizando R$ " + valorChequeEspecialTemp + " do seu cheque especial. Seu limite é de R$ " + valorChequeEspecial);
        System.out.println("======================================================");
    }

    private void descontarChequeEspecial(ContaCorrente contaCorrente) {
        if(contaCorrente.getSaldoContaCorrente() < 0) {
            double saldoChequeEspecialTemp = contaCorrente.getSaldoChequeEspecial();
            saldoChequeEspecialTemp = saldoChequeEspecialTemp * 20 / 100;
            contaCorrente.setSaldoChequeEspecial(saldoChequeEspecialTemp);
        }
    }
}

