package br.com.exercicios06.phone.dao;
import java.util.ArrayList;
import java.util.List;
import br.com.exercicios06.phone.domain.PhoneResult;

public class InMemoryPhoneResultDAO implements PhoneResultDAO {
    private final List<PhoneResult> historico = new ArrayList<>();

    @Override
    public void save(PhoneResult resultado) {
        historico.add(resultado);
    }

    @Override
    public List<PhoneResult> findAll() {
        return List.copyOf(historico);
    }
}