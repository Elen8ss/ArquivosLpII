package view;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;

public class ExtrairInformXML {

    public static void main1(String[] args) throws IOException {

        try {
            File file = new File("curriculo2.xml");

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            try {
                Document document = documentBuilder.parse(file);
                NodeList curriculo = document.getElementsByTagName("CURRICULO-VITAE");
                NodeList dados = document.getElementsByTagName("DADOS-GERAIS");

                NodeList producao = document.getElementsByTagName("PRODUCAO-BIBLIOGRAFICA");
                NodeList autores = document.getElementsByTagName("AUTORES");

                int tamLista = curriculo.getLength();

                for (int i=0; i<tamLista; i++){
                    Node nodeCurriculo = curriculo.item(i);
                    Node nodeDados = dados.item(i);
                    Node nodeProducao = producao.item(i);
                    Node nodeAutores =autores.item(i);
                    if (nodeCurriculo.getNodeType() == Node.ELEMENT_NODE && nodeDados.getNodeType() == Node.ELEMENT_NODE && nodeProducao.getNodeType() == Node.ELEMENT_NODE ){
                        Element elementCurriculo = (Element) nodeCurriculo;
                        Element elementDadosGerais = (Element) nodeDados;
                        Element elementProducao = (Element) nodeProducao;
                        Element elementAutores = (Element) nodeAutores;

                        String id = elementCurriculo.getAttribute("NUMERO-IDENTIFICADOR");
                        String nome = elementDadosGerais.getAttribute("NOME-COMPLETO");
                        String anoInicio = elementProducao.getAttribute("ANO-DO-TRABALHO");
                        String autor = elementAutores.getAttribute("NOME-COMPLETO-DO-AUTOR");

                        System.out.println("Id \tNome ");
                        System.out.println( id + " - " + nome);
                        //System.out.println("\nAno_Inicio \tAno_Fim \tProjeto ");

                        System.out.println(anoInicio + " - " +autor);
                    }
                }

            }catch (SAXException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
