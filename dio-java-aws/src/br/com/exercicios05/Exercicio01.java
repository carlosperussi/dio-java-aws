package br.com.exercicios05;
import java.util.Scanner;

public class Exercicio01 {
    private static Scanner scanner = new java.util.Scanner(System.in);
    private static Mensageiro mensageiro = null;
    
    public static void main(String[] args) {
        int opcao;

        while(true) {
            System.out.println("==============");
            System.out.println("Escolha opção desejada:");
            System.out.println("1) Enviar mensagem via WhatsApp");
            System.out.println("2) Enviar mensagem via SMS");
            System.out.println("3) Enviar mensagem via Email");
            System.out.println("4) Enviar mensagem via Redes Sociais");
            System.out.println("5) Sair.");
            System.out.print("Informe a opção: ");
            
            String linha = scanner.nextLine().trim();
            if (linha.isEmpty()) {
                System.out.println("Entrada vazia.");
                continue;
            }
            try {
                opcao = Integer.parseInt(linha);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Informe um número.");
                continue;
            }

            if(opcao == 1) 
                mensageiro = enviarWhatsapp();
            else if(opcao == 2) {
                mensageiro = enviarSMS();
            }
            else if(opcao == 3) {
                mensageiro = enviarEmail();
            }
            else if(opcao == 4) {
                mensageiro = enviarDirect();
            }
            else if(opcao == 5)
                break;
            else {
                System.out.println("Opcao invalida. Tente novamente...");
            }
        }

        if (mensageiro != null) 
            System.out.println(mensageiro.enviarMensagem());
        else
            System.out.println("Nenhuma mensagem enviada.");

        scanner.close();
    }

    private static Mensageiro enviarWhatsapp() {
        System.out.print("Informe o numero de telefone: ");
        String numeroDeTelefoneParam = scanner.nextLine().trim(); // ler como String para números grandes/formatados
        System.out.print("Informe a mensagem: ");
        String mensagemParam = scanner.nextLine();

        return new Whatsapp(mensagemParam, numeroDeTelefoneParam);
    }

    private static Mensageiro enviarSMS() {
        System.out.print("Informe o numero de telefone: ");
        String numeroDeTelefoneParam = scanner.nextLine().trim(); // ler como String para números grandes/formatados
        System.out.print("Informe a mensagem: ");
        String mensagemParam = scanner.nextLine();

        return new SMS(mensagemParam, numeroDeTelefoneParam);
    }

    private static Mensageiro enviarEmail() {
        System.out.print("Informe o e-mail: ");
        String emailParam = scanner.nextLine();
        System.out.print("Informe a mensagem: ");
        String mensagemParam = scanner.nextLine();

        return new Email(mensagemParam, emailParam);
    }

    private static Mensageiro enviarDirect() {
        System.out.print("Informe @: ");
        String redeSocialParam = scanner.nextLine();
        System.out.print("Informe a mensagem: ");
        String mensagemParam = scanner.nextLine();

        return new RedesSociais(mensagemParam, redeSocialParam);
    }
}