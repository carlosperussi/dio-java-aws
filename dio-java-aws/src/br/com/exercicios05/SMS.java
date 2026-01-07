package br.com.exercicios05;

public record SMS(String mensagemParam, String numeroDeTelefoneParam) implements Mensageiro {

    @Override
    public String enviarMensagem() {
        return "Enviando via SMS (" + numeroDeTelefoneParam + ") a mensagem: " + mensagemParam;
    }

}
