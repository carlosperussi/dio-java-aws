package br.com.exercicios05;

public record Whatsapp(String mensagemParam, String numeroDeTelefoneParam) implements Mensageiro {

    @Override
    public String enviarMensagem() {
        return "Enviando via WhatsApp (" + numeroDeTelefoneParam + ") a mensagem: " + mensagemParam;
    }

}
