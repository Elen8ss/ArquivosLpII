package entidade;

import java.util.ArrayList;
import java.util.Hashtable;

public class Curriculo {
    private String id;
    private String nome;
    private Hashtable<String, Producao> producoes;

    public Curriculo(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.producoes = new Hashtable<>();
    }

    public Curriculo() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





}
