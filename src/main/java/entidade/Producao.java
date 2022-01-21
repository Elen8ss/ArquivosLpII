package entidade;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Producao {
    private String id;
    private String titulo;
    private String tipo;
    private String ano;

    public Producao(String id, String titulo, String tipo, String ano){
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.ano = ano;
    }

    public Producao() {

    }

    public String getId() {
        return id;
    }

    public void setId(String issn) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }


}
