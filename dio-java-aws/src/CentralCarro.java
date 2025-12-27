import java.util.Scanner;

public class CentralCarro {
    private static Carro carro = new Carro();
    private static Scanner scanner = new Scanner(System.in);

    public static void ligarCarro(boolean estadoDoMotorParam) {
        System.out.println("======================================================");

        if(!carro.getEstadoDoMotor()) {
            carro.setEstadoDoMotor(true);
            System.out.println("O motor do seu carro está ligado.");
        }else
            System.out.println("O motor do seu carro já está ligado!");

        System.out.println("======================================================");
    }

    public void desligarCarro(boolean estadoDoMotorParam) {
        System.out.println("======================================================");

        if(carro.getEstadoDoMotor()) {
            if(carro.getVelocidadeAtual() == 0) {
                carro.setEstadoDoMotor(false);
                System.out.println("O motor do seu carro foi desligado.");
            }else
                System.out.println("Você precisa reduzir sua velocidade antes de desligar o carro!");
        }else
            System.out.println("O motor do seu carro já está desligado!");

        System.out.println("======================================================");
    }

    public void aumentarMarcha() {
        System.out.println("======================================================");
        var marchaAtualTemp = carro.getMarcha();

        if(carro.getEstadoDoMotor()) {
            if(marchaAtualTemp < 6) {
                carro.setMarcha(marchaAtualTemp + 1);
                System.out.println("Você engatou a " + carro.getMarcha() + " marcha!");
            }else
                System.out.println("Você já engatou a última marcha!");
        }else
            System.out.println("Seu carro precisa estar ligado para que possa engatar uma marcha!");

        System.out.println("======================================================");
    }

    public void reduzirMarcha() {
        System.out.println("======================================================");
        var marchaAtualTemp = carro.getMarcha();

        if(carro.getEstadoDoMotor()) {
            if(marchaAtualTemp > 0 && marchaAtualTemp <= 6) {
                carro.setMarcha(marchaAtualTemp - 1);
                System.out.println("Você reduziu para a " + carro.getMarcha() + " marcha!");
            }else
                System.out.println("Você está em ponto-morto!");
        }else
            System.out.println("Seu carro precisa estar ligado para que possa engatar uma marcha!");

        System.out.println("======================================================");
    }

    public void aumentarVelocidade() {
        System.out.println("======================================================");
        float velocidadeAtualTemp = 0;
        velocidadeAtualTemp = carro.getVelocidadeAtual() + 1f;
        var marchaAtualTemp = carro.getMarcha();

        if(carro.getEstadoDoMotor()) {
            if(marchaAtualTemp == 0) {
                System.out.println("Você deve ao menos engatar a primeira marcha para movimentar o carro!");
            }else if(marchaAtualTemp == 1) {
                if(velocidadeAtualTemp >= 0 && velocidadeAtualTemp <= 20) {
                    carro.setVelocidadeAtual(velocidadeAtualTemp);
                    System.out.println("Seu carro agora está andando à " + carro.getVelocidadeAtual() + " km/H!");
                }else
                    System.out.println("Você precisa engatar a próxima marcha!");
            }else if(marchaAtualTemp == 2) {
                if(velocidadeAtualTemp >= 21 && velocidadeAtualTemp <= 40) {
                    carro.setVelocidadeAtual(velocidadeAtualTemp);
                    System.out.println("Seu carro agora está andando à " + carro.getVelocidadeAtual() + " km/H!");
                }else
                    System.out.println("Você precisa engatar a próxima marcha!");
            }else if(marchaAtualTemp == 3) {
                if(velocidadeAtualTemp >= 41 && velocidadeAtualTemp <= 60) {
                    carro.setVelocidadeAtual(velocidadeAtualTemp);
                    System.out.println("Seu carro agora está andando à " + carro.getVelocidadeAtual() + " km/H!");
                }else
                    System.out.println("Você precisa engatar a próxima marcha!");
            }else if(marchaAtualTemp == 4) {
                if(velocidadeAtualTemp >= 61 && velocidadeAtualTemp <= 80) {
                    carro.setVelocidadeAtual(velocidadeAtualTemp);
                    System.out.println("Seu carro agora está andando à " + carro.getVelocidadeAtual() + " km/H!");
                }else
                    System.out.println("Você precisa engatar a próxima marcha!");
            }else if(marchaAtualTemp == 5) {
                if(velocidadeAtualTemp >= 81 && velocidadeAtualTemp <= 100) {
                    carro.setVelocidadeAtual(velocidadeAtualTemp);
                    System.out.println("Seu carro agora está andando à " + carro.getVelocidadeAtual() + " km/H!");
                }else
                    System.out.println("Você precisa engatar a próxima marcha!");
            }else if(marchaAtualTemp == 6) {
                if(velocidadeAtualTemp >= 101 && velocidadeAtualTemp <= 120) {
                    if(velocidadeAtualTemp > 120)
                        velocidadeAtualTemp = 120;
                    
                    carro.setVelocidadeAtual(velocidadeAtualTemp);
                    System.out.println("Seu carro agora está andando à " + carro.getVelocidadeAtual() + " km/H!");
                }else
                    System.out.println("Você precisa engatar a próxima marcha!");
            }
        }else
            System.out.println("Você não pode acelerar o carro desligado!");

        System.out.println("======================================================");
    }

    public void reduzirVelocidade() {
        System.out.println("======================================================");
        float velocidadeAtualTemp = 0;
        velocidadeAtualTemp = carro.getVelocidadeAtual() - 1f;
        
        if(carro.getEstadoDoMotor()) {
            if(velocidadeAtualTemp < 0)
                velocidadeAtualTemp = 0;

            carro.setVelocidadeAtual(velocidadeAtualTemp);
            
            if(velocidadeAtualTemp >= 101)
                carro.setMarcha(6);
            else if(velocidadeAtualTemp >= 81 && velocidadeAtualTemp <= 100)
                carro.setMarcha(5);
            else if(velocidadeAtualTemp >= 61 && velocidadeAtualTemp <= 80)
                carro.setMarcha(4);
            else if(velocidadeAtualTemp >= 41 && velocidadeAtualTemp <= 60)
                carro.setMarcha(3);
            else if(velocidadeAtualTemp >= 21 && velocidadeAtualTemp <= 40)
                carro.setMarcha(2);
            else if(velocidadeAtualTemp >= 1 && velocidadeAtualTemp <= 20)
                carro.setMarcha(1);
            else
                carro.setMarcha(0);

            System.out.println("Sua velocidade atual é de " + carro.getVelocidadeAtual() + " Km/H e está na " + carro.getMarcha() + " marcha!");
        }else
            System.out.println("Você não pode desacelerar o carro desligado!");

        System.out.println("======================================================");
    }

    public void mudarDirecao() {
        System.out.println("======================================================");
        String direcaoTemp;
        float velocidadeAtualTemp = carro.getVelocidadeAtual();
        boolean validadorTemp = false;

        if(carro.getEstadoDoMotor()) {
            if(velocidadeAtualTemp > 0 && velocidadeAtualTemp <= 40) {
                while (!validadorTemp) {
                    System.out.println("Para qual direção você gostaria de virar o carro? (Esquerda/Direita)");
                    direcaoTemp = scanner.next();
                    
                    if(direcaoTemp.equalsIgnoreCase("direita") || direcaoTemp.equalsIgnoreCase("esquerda")) {
                        carro.setDirecaoAtual(direcaoTemp);
                        System.out.println("Seu carro agora está virando para a " + direcaoTemp);
                        break;
                    }else
                        System.out.println("Por favor, informe corretamente a direção para a qual gostaria de virar o carro!");
                }
            }else if(velocidadeAtualTemp == 0)
                System.out.println("O carro parado não pode virar para qualquer direção.");
            else
                System.out.println("Você precisa reduzir a velocidade antes de virar o carro para alguma direção!");
        }else
            System.out.println("Você precisa ligar o carro para executar qualquer ação.");
        System.out.println("======================================================");
    }

    public void verificarVelocidade() {
        System.out.println("======================================================");
        System.out.println("Sua velocidade atual é de " + carro.getVelocidadeAtual() + " Km/H!");
        System.out.println("======================================================");
    }
}
