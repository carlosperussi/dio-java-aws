import java.util.Scanner;

public class DesafioStringAws {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String solicitacao = scanner.nextLine();
        String servicoDisponivel = "Serviço desconhecido";

        String texto = solicitacao.toLowerCase();
        String[] requisicao = texto.split(" ");

        for(int i = 0; i < requisicao.length; i++) {
            if(requisicao[i].contains("aplicacoes") || requisicao[i].contains("aplicações") || requisicao[i].contains("aplicacao") || requisicao[i].contains("aplicação"))
                servicoDisponivel = "EC2";
            else if(requisicao[i].contains("imagens") || requisicao[i].contains("imagem") || requisicao[i].contains("video") || requisicao[i].contains("videos") || requisicao[i].contains("vídeos") || requisicao[i].contains("vídeos"))
                servicoDisponivel = "S3";
            else if(requisicao[i].contains("banco") || requisicao[i].contains("dados") || requisicao[i].contains("relacional"))
                servicoDisponivel = "RDS";
            else if(requisicao[i].contains("executar") || requisicao[i].contains("funcoes") || requisicao[i].contains("funções") || requisicao[i].contains("funcao") || requisicao[i].contains("função") || requisicao[i].contains("servidor") || requisicao[i].contains("serverless"))
                servicoDisponivel = "Lambda";
            else
                servicoDisponivel = "Serviço desconhecido";
        }

        System.out.println(servicoDisponivel);

        scanner.close();
    }
}
