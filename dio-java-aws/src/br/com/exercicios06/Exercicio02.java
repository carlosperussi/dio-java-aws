package br.com.exercicios06;

import java.util.Scanner;

import br.com.exercicios06.phone.dao.InMemoryPhoneResultDAO;
import br.com.exercicios06.phone.dao.PhoneResultDAO;
import br.com.exercicios06.phone.domain.PhoneResult;
import br.com.exercicios06.phone.domain.PhoneType;
import br.com.exercicios06.phone.service.PhoneFormatter;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Formatador BR: 8/9/10/11 dígitos | Comandos: historico, sair");
        PhoneResultDAO repo = new InMemoryPhoneResultDAO();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("> ");
                String in = sc.nextLine();
                if (in == null) continue;

                String cmd = in.trim();
                if (cmd.equalsIgnoreCase("sair")) break;

                if (cmd.equalsIgnoreCase("historico")) {
                    repo.findAll().forEach(r -> {
                        String tipo = r.valido()
                                ? (r.tipo() == PhoneType.FIXO ? "FIXO" : "CELULAR") + (r.comDDD() ? " c/DDD" : " s/DDD")
                                : "-";
                        System.out.println((r.valido() ? "[OK] " : "[X] ") + r.mensagem()
                                + " | Saída: " + (r.saida() == null ? "-" : r.saida())
                                + " | Original: " + r.original()
                                + " | Dígitos: " + r.digits()
                                + " | Tipo: " + tipo);
                    });
                    continue;
                }

                PhoneResult r = PhoneFormatter.process(cmd);
                repo.save(r);
                System.out.println((r.valido() ? "[OK]" : "[X]") + " " + (r.saida() == null ? "-" : r.saida()) + " - " + r.mensagem());
            }
        }
        System.out.println("Tchau!");
    }
}