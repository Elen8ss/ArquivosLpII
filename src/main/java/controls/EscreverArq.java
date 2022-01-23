package controls;

import java.io.*;

public class EscreverArq {

    public void exportarProducoes(File arquivo, String producao) {

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

            bw.write(producao);
            bw.newLine();

            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException ex) {
            System.out.println("Error");
        }

    }




}
