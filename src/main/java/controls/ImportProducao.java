package controls;

import entidade.Producao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class ImportProducao {

    public Hashtable<String, Producao> importarProducoes(String arquivo) {
        Hashtable<String, Producao> novaProducao = new Hashtable<>();

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

            String linha = leitor.readLine();
            while ((linha = leitor.readLine()) != null) {
                try {
                    String tmp[] = linha.split(";");
                    novaProducao.put(tmp[0], new Producao(tmp[0], tmp[1], tmp[2], tmp[3]));
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

    public void buscarPorData(Hashtable<String, Producao> producoes, String data) {
        for (Producao p: producoes.values()) {
            if (p.getAno().contains(data)) {
                System.out.println("Id: "+ p.getId());
                System.out.println("Titulo: "+ p.getTitulo());
                System.out.println("Tipo: "+ p.getTipo());
                System.out.println("Ano: "+ p.getAno());
            }
        }
    }

    public void buscarPorDataTipo(Hashtable<String, Producao> producoes, String data, String tipo) {
        for (Producao p: producoes.values()) {
            if (p.getAno().contains(data) && p.getTipo().contains(tipo)){
                System.out.println("Id: "+ p.getId());
                System.out.println("Titulo: "+ p.getTitulo());
                System.out.println("Tipo: "+ p.getTipo());
                System.out.println("Ano: "+ p.getAno());
            }
        }
    }

    public int contaProducaoTipoData(Hashtable<String, Producao> producoes, String data, String tipo) {
        int contProducoes=0;
        for (Producao p: producoes.values()) {
            if (p.getAno().contains(data) && p.getTipo().contains(tipo)){
                contProducoes ++;
            }
        }
        return contProducoes;
    }

}
