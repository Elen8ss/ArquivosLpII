package view;

import controls.EscreverArq;
import controls.ImportProducao;
import entidade.Producao;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        ImportProducao imp = new ImportProducao();

        HashSet<Producao> prod = imp.importarProducoes("Producao.txt");


        if (imp.buscarPorData(new File("arq.txt"), prod, "2020")){
            System.out.println("\nArquivo construido com sucesso");
        }else{
            System.out.println("Error");
        }


        if (imp.buscarPorDataTipo(new File("arq2.txt"), prod, "01692607", "2019")){
            System.out.println("\nArquivo construido com sucesso");
        }else{
            System.out.println("Error");
        }




    }
}
