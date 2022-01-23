package view;

import controls.EscreverArq;
import controls.ImportProducao;
import entidade.Producao;

import java.io.File;
import java.util.HashSet;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args){

        ImportProducao imp = new ImportProducao();
        EscreverArq escreverArq = new EscreverArq();

        HashSet<Producao> prod = imp.importarProducoes("Producao.txt");

        if (imp.buscarPorData(new File("arq.txt"), prod, "2016")){
            System.out.println("\nArquivo construido com sucesso");
        }else{
            System.out.println("Error");
        }


    }
}
