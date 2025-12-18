import java.util.Scanner;

public class DesafioSalario {
    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        System.out.println("Informe o salário:");
        float valorSalario = leitorDeEntradas.nextFloat();
        System.out.println("Agora, informe o valor dos benefícios:");
        float valorBeneficios = leitorDeEntradas.nextFloat();
        float valorImposto = 0;

        if(valorSalario >= 0 && valorSalario <= 1100) 
            valorImposto = 0.05F * valorSalario;
        else if(valorSalario >= 1100.01 && valorSalario <= 2500) 
            valorImposto = 0.10F * valorSalario;
        else 
            valorImposto = 0.15F * valorSalario;

        float valorFinal = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", valorFinal));

        leitorDeEntradas.close();
    }
}