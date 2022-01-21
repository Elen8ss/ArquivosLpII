package view;

import controls.ImportProducao;
import entidade.Curriculo;
import entidade.Producao;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args){

        ImportProducao imp = new ImportProducao();

        Hashtable<String, Producao> prod = imp.importarProducoes("Producao.txt");
        imp.buscarPorData(prod, "2014");

    }
}
