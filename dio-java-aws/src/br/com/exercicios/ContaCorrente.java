import java.util.concurrent.ThreadLocalRandom;

public class ContaCorrente {
    private int numeroDaConta = 0;
    private double saldoDaConta;
    private double valorChequeEspecial;
    private double saldoChequeEspecial;

    public ContaCorrente(double saldoDaContaParam) {
        this.numeroDaConta = ThreadLocalRandom.current().nextInt(10000, 100000);
        this.saldoDaConta = saldoDaContaParam;

        if(saldoDaContaParam <= 500) {
            saldoChequeEspecial = 50.00;
            valorChequeEspecial = 50.00;
        }else {
            saldoChequeEspecial = saldoDaContaParam / 2;
            valorChequeEspecial = saldoDaContaParam / 2;
        }
    }

    public double getSaldoContaCorrente() {
        return this.saldoDaConta;
    }

    public void setSaldoContaCorrente(double saldoParam) {
        this.saldoDaConta = saldoParam;
    }

    public double getSaldoChequeEspecial() {
        return this.saldoChequeEspecial;
    }

    public double getValorChequeEspecial() {
        return this.valorChequeEspecial;
    }

    public void setSaldoChequeEspecial(double saldoChequeEspecialParam) {
        this.saldoChequeEspecial = saldoChequeEspecialParam;
    }

    public int getNumeroContaCorrente() {
        return this.numeroDaConta;
    }
}
