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
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }




}
