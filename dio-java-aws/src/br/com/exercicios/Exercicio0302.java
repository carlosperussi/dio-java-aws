import java.util.Scanner;

public class Exercicio0302 {
    private final static Scanner scanner = new Scanner(System.in);
    private final static CentralCarro centralCarro = new CentralCarro();
    public static void main(String[] args) {
        int option;
        System.out.println("Bem vindo à nossa concessionária. Aqui estão suas chaves!");

        do {
            System.out.println("Selecione a opção desejada:");
            System.out.println("===========================");
            System.out.println("1) Ligar o carro");
            System.out.println("2) Desligar o carro");
            System.out.println("3) Acelerar;");
            System.out.println("4) Reduzir velocidade;");
            System.out.println("5) Virar para esquerda/direita;");
            System.out.println("6) Verificar velocidade;");
            System.out.println("7) Aumentar marcha;");
            System.out.println("8) Reduzir marcha;");
            System.out.println("0) Sair;");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    centralCarro.ligarCarro(true);
                    break;
                case 2:
                    centralCarro.desligarCarro(false);
                    break;
                case 3:
                    centralCarro.aumentarVelocidade();
                    break;
                case 4:
                    centralCarro.reduzirVelocidade();
                    break;
                case 5:
                    centralCarro.mudarDirecao();
                    break;
                case 6:
                    centralCarro.verificarVelocidade();
                    break;
                case 7:
                    centralCarro.aumentarMarcha();
                    break;
                case 8:
                    centralCarro.reduzirMarcha();
                    break;
                default:
                    break;
            }
        }while(option != 0);
    }
}
