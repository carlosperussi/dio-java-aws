package br.com.exercicios06.phone.domain;

public record PhoneResult(
        String original,     // Entrada original
        String digits,       // Apenas dígitos extraídos
        boolean valido,      // Se é um número válido
        PhoneType tipo,      // FIXO ou CELULAR (null se inválido)
        boolean comDDD,      // Tem DDD?
        boolean jaFormatado, // Já veio com máscara correta?
        String saida,        // Saída formatada (se válido)
        String mensagem      // Mensagem amigável
) {}
