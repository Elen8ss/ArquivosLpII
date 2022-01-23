package controls;

import entidade.Producao;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
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
                    novaProducao.add(new Producao(tmp[0], tmp[1], new ArrayList<>(Collections.singleton(tmp[2])), tmp[3]));
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

    public boolean buscarPorData(File arquivo, HashSet<Producao> producoes, String data) {
        EscreverArq escrever = new EscreverArq();
        if(producoes != null) {
            for (Producao p : producoes) {
                if (p.getAno().contains(data)) {
                    String espaco = "\n----------------------\n";
                    String dados = "Id: " + p.getIssn() + "\n" + "Titulo: " + p.getTitulo() + "\n" + "Autores: " + p.getAutor() + "\n" + "Ano: " + p.getAno() + espaco;
                    escrever.exportarProducoes(arquivo, dados);
                }
            }
            return true;
        }
        return false;
    }

    public boolean buscarPorDataTipo(File arquivo, HashSet<Producao> producoes, String tipo, String data) {
        EscreverArq escrever = new EscreverArq();
        if (producoes!=null) {
            for (Producao p : producoes) {
                if (p.getIssn().contains(tipo) && p.getAno().contains(data)) {
                    String espaco = "\n----------------------\n";
                    String dados = "Id: " + p.getIssn() + "\n" + "Titulo: " + p.getTitulo() + "\n" + "Autores: " + p.getAutor() + "\n" + "Ano: " + p.getAno() + espaco;
                    escrever.exportarProducoes(arquivo, dados);
                }
            }
            return true;
        }
        return false;
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
