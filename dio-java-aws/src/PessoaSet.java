import static java.util.Objects.isNull;
import java.util.Objects;

public class PessoaSet {
    private int id;
    private String nome;

    public PessoaSet(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public PessoaSet() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("{'id': %s, 'nome': %s}", id, nome);
    }

    @Override
    public boolean equals(Object object) {
        if(object == this) return true;
        if((isNull(object)) || (!(object instanceof PessoaSet))) return false;
        var pessoa = ((PessoaSet) object);
        return this.id == getId() && Objects.equals(this.nome, pessoa.getNome());
    }
    
}
