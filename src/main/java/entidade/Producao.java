package entidade;

public class Producao {
    private String issn;
    private String titulo;
    private String autor;
    private String ano;


    public Producao(String issn, String titulo, String autor, String ano){
        this.issn = issn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }


}
