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
                NodeList projetos = document.getElementsByTagName("PROJETO-DE-PESQUISA");

                int tamLista = curriculo.getLength();

                for (int i=0; i<tamLista; i++){
                    Node nodeCurriculo = curriculo.item(i);
                    Node nodeDados = dados.item(i);
                    Node nodeProjetos = projetos.item(i);
                    if (nodeCurriculo.getNodeType() == Node.ELEMENT_NODE && nodeDados.getNodeType() == Node.ELEMENT_NODE && nodeProjetos.getNodeType() == Node.ELEMENT_NODE){
                        Element elementCurriculo = (Element) nodeCurriculo;
                        Element elementDadosGerais = (Element) nodeDados;
                        Element elementProjeto = (Element) nodeProjetos;
                        String id = elementCurriculo.getAttribute("NUMERO-IDENTIFICADOR");
                        String nome = elementDadosGerais.getAttribute("NOME-COMPLETO");
                        String projetoInicio = elementProjeto.getAttribute("ANO-INICIO");
                        String projetoFim = elementProjeto.getAttribute("ANO-FIM");
                        String projetoNome = elementProjeto.getAttribute("NOME-DO-PROJETO");
                        System.out.println("Id \tNome ");
                        System.out.println( id + " - " + nome);
                        System.out.println("\nAno_Inicio \tAno_Fim \tProjeto ");
                        System.out.println(projetoInicio + " - " + projetoFim + " - " + projetoNome);
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
