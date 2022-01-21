package view;

import controls.ImportProducao;
import entidade.Producao;

import java.util.HashSet;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args){

        ImportProducao imp = new ImportProducao();

        HashSet<Producao> prod = imp.importarProducoes("Producao.txt");

        imp.buscarPorDataTipo(prod, "01692607", "2020");

    }
}
