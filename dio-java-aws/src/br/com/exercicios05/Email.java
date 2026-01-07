package br.com.exercicios05;

public record Email(String mensagemParam, String emailParam) implements Mensageiro {

    @Override
    public String enviarMensagem() {
        return "Enviando para o e-mail \"" + emailParam + "\" a mensagem: " + mensagemParam;
    }

}
