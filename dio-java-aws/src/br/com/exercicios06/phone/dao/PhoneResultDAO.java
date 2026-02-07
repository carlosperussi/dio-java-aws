package br.com.exercicios06.phone.dao;
import java.util.List;
import br.com.exercicios06.phone.domain.PhoneResult;

public interface PhoneResultDAO {
    void save(PhoneResult resutado);
    List<PhoneResult> findAll();
}