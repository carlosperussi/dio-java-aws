package br.com.exercicios06.phone.service;
import java.util.Optional;
import java.util.regex.Pattern;
import br.com.exercicios06.phone.domain.PhoneResult;
import br.com.exercicios06.phone.domain.PhoneType;

public class PhoneFormatter {
    private static final Pattern FIXO_SEM_DDD = Pattern.compile("^\\d{4}-\\d{4}$");
    private static final Pattern FIXO_COM_DDD = Pattern.compile("^\\(\\d{2}\\)\\d{4}-\\d{4}$");
    private static final Pattern CEL_SEM_DDD  = Pattern.compile("^\\d{5}-\\d{4}$");
    private static final Pattern CEL_COM_DDD  = Pattern.compile("^\\(\\d{2}\\)\\d{5}-\\d{4}$");

    public static PhoneResult process(String telefoneParam) {
        if(telefoneParam == null || telefoneParam.isBlank())
            return invalid(telefoneParam, "", "Entrada vazia.");

        Optional<PhoneResult> tempTelefone = detectIfMasked(telefoneParam);
        
        if(tempTelefone.isPresent()) 
            return tempTelefone.get();

        String digits = telefoneParam.replaceAll("\\D", "");
        int len = digits.length();
        if (len != 8 && len != 9 && len != 10 && len != 11)
            return invalid(telefoneParam, digits, "Qtd. de dígitos inválida (" + len + ").");

        PhoneType tipo = (len == 8 || len == 10) ? PhoneType.FIXO : PhoneType.CELULAR;
        boolean comDDD = (len == 10 || len == 11);
        String saida = format(digits, tipo, comDDD);
        String msg = "Válido: " + desc(tipo, comDDD) + " (máscara aplicada).";
        return new PhoneResult(telefoneParam, digits, true, tipo, comDDD, false, saida, msg);
    }

    private static Optional<PhoneResult> detectIfMasked(String telefoneParam) {
        if(FIXO_SEM_DDD.matcher(telefoneParam).matches())
            return ok(telefoneParam, PhoneType.FIXO, false);

        if(FIXO_COM_DDD.matcher(telefoneParam).matches())
            return ok(telefoneParam, PhoneType.FIXO, true);

        if(CEL_SEM_DDD.matcher(telefoneParam).matches())
            return ok(telefoneParam, PhoneType.CELULAR, false);

        if(CEL_COM_DDD.matcher(telefoneParam).matches())
            return ok(telefoneParam, PhoneType.CELULAR, true);

        return Optional.empty();
    }

    private static Optional<PhoneResult> ok(String in, PhoneType t, boolean comDDD) {
        String d = in.replaceAll("\\D", "");
        String msg = "Válido: " + desc(t, comDDD) + " (já formatado).";
        return Optional.of(new PhoneResult(in, d, true, t, comDDD, true, in, msg));
    }

    private static String format(String d, PhoneType t, boolean comDDD) {
        if (!comDDD) {
            return (t == PhoneType.FIXO)
                    ? d.substring(0, 4) + "-" + d.substring(4)
                    : d.substring(0, 5) + "-" + d.substring(5);
        }
        String dd = d.substring(0, 2), line = d.substring(2);
        return (t == PhoneType.FIXO)
                ? "(" + dd + ")" + line.substring(0, 4) + "-" + line.substring(4)
                : "(" + dd + ")" + line.substring(0, 5) + "-" + line.substring(5);
    }

    private static PhoneResult invalid(String original, String digits, String motivo) {
        return new PhoneResult(original, digits, false, null, false, false, null, "Inválido: " + motivo);
    }

    private static String desc(PhoneType t, boolean comDDD) {
        return (t == PhoneType.FIXO ? "Fixo" : "Celular") + (comDDD ? " com DDD" : " sem DDD");
    }
}
