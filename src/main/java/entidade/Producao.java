package entidade;

import java.util.ArrayList;
import java.util.Collection;

public class Producao {
    private String issn;
    private String titulo;
    private ArrayList autor = new ArrayList<>();
    private String ano;


    public Producao(String issn, String titulo, ArrayList autor, String ano){
        this.issn = issn;
        this.titulo = titulo;
        this.autor = new ArrayList<>();
        this.ano = ano;
    }

    public Producao() {

    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList getAutor() {
        return autor;
    }

    public void setAutor(ArrayList autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }


}
