import java.util.*;

public class Pessoa {

    private Integer id;

    private String Nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public Pessoa(Integer id, String nome) {
        this.id = id;
        Nome = nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

}
