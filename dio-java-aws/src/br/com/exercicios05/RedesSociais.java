package br.com.exercicios05;

public record RedesSociais(String mensagemParam, String redeSocialParam) implements Mensageiro {

    @Override
    public String enviarMensagem() {
        return "Enviando para \"@" + redeSocialParam + "\" a mensagem: " + mensagemParam;
    }

}
