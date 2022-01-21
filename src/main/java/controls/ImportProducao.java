package controls;

import entidade.Producao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;

public class ImportProducao {

    public HashSet<Producao> importarProducoes(String arquivo) {
        HashSet<Producao> novaProducao = new HashSet<>();

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

            String linha= leitor.readLine();
            while ((linha = leitor.readLine()) != null) {
                try {
                    String tmp[] = linha.split(";");
                    novaProducao.add(new Producao(tmp[0], tmp[1], tmp[2], tmp[3]));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return novaProducao;
    }

    public void buscarPorData(HashSet<Producao> producoes, String data) {
        for (Producao p : producoes) {
            if (p.getAno().contains(data)) {
                System.out.println("Issn: " + p.getIssn());
                System.out.println("Titulo: " + p.getTitulo());
                System.out.println("Autor: " + p.getAutor());
                System.out.println("Ano: " + p.getAno());
                System.out.println("----------------");
            }
        }
    }

    public void buscarPorDataTipo(HashSet<Producao> producoes, String tipo, String data) {
        for (Producao p: producoes) {
            if (p.getIssn().contains(tipo) && p.getAno().contains(data)){
                System.out.println("Id: "+ p.getIssn());
                System.out.println("Titulo: "+ p.getTitulo());
                System.out.println("Tipo: "+ p.getAutor());
                System.out.println("Ano: "+ p.getAno());
            }
        }
    }

    public int contaProducaoTipoData(HashSet<Producao> producoes, String data, String tipo) {
        int contProducoes=0;
        for (Producao p: producoes) {
            if (p.getAno().contains(data) && p.getIssn().contains(tipo)){
                contProducoes ++;
            }
        }
        return contProducoes;
    }

}
