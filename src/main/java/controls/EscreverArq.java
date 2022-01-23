package controls;


import java.io.*;

public class EscreverArq {

    public void exportarProducoes(File arquivo, String producao) {
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(arquivo, true));

            bw.write(producao);
            bw.newLine();

            bw.close();

        } catch (IOException ex) {
            System.out.println("Error");
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
