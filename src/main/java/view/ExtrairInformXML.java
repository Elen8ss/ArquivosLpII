package view;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExtrairInformXML {

    public static void main(String[] args) throws IOException {

        try {
            File file = new File("curriculo2.xml");

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            try {
                Document document = documentBuilder.parse(file);
                document.getDocumentElement().normalize();

                NodeList curriculo = document.getElementsByTagName("CURRICULO-VITAE");
                NodeList dados = document.getElementsByTagName("DADOS-GERAIS");

                int tamLista = curriculo.getLength();

                for (int i=0; i<tamLista; i++){
                    Node nodeCurriculo = curriculo.item(i);
                    Node nodeDados = dados.item(i);

                    if (nodeCurriculo.getNodeType() == Node.ELEMENT_NODE && nodeDados.getNodeType() == Node.ELEMENT_NODE){
                        Element elementCurriculo = (Element) nodeCurriculo;
                        Element elementDadosGerais = (Element) nodeDados;

                        String id = elementCurriculo.getAttribute("NUMERO-IDENTIFICADOR");
                        String nome = elementDadosGerais.getAttribute("NOME-COMPLETO");
                        System.out.println("Id \tNome ");
                        System.out.println( id + " - " + nome);
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

    private static void printNodeList(NodeList nodeList){
        for (int i=0; i<nodeList.getLength(); i++){
            Node elementNode = nodeList.item(i);

            if (elementNode.getNodeType() == Node.ELEMENT_NODE){

                if(elementNode.hasAttributes()){
                    NamedNodeMap nodeMap = elementNode.getAttributes();
                    for (int j=0; j< nodeMap.getLength(); j++){
                        Element element = (Element) nodeMap.item(j);
                        System.out.println("Autor: " + element.getElementsByTagName("NOME-COMPLETO-DO-AUTOR"));
                    }
                }
            }
        }
    }
}
