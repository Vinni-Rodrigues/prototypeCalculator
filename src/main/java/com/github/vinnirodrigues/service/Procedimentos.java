package com.github.vinnirodrigues.service;

import com.github.vinnirodrigues.model.Material;
import com.github.vinnirodrigues.repository.CatalagoMaterias;

public class Procedimentos {


    public static void novaLinha(){
        System.out.println();
    }

    public static void textoCabecalho(){

        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("    Calculo Orçamentario    ");
        System.out.println("----------------------------");
        System.out.println("----------------------------");

    }


    public static void cabecalhoMenuInserirDimensoes(){
        System.out.println("Insira as dimensões do trabalho:");
    }

    public static void informarLargura(){
        System.out.println("Digite a largura(metros):");
    }

    public static void informarComprimento(){
        System.out.println("Digite o comprimento(metros):");
    }

    public static void separarMenus(){
        System.out.println("=======================");
    }

    public static void menuSelecaoOpcao(){

        for (int i = 0; i < CatalagoMaterias.getListaMateriais().size(); i++){
            System.out.println("[" + (i + 1) + "] " +
                    CatalagoMaterias.getListaMateriais().get(i).getTipoMaterial());
        }

        System.out.print("Opção: ");
    }

    public static void nomeOpcaoSelecionada(Material materialSelecionado){
        System.out.println("Você escolheu: " + materialSelecionado.getTipoMaterial());
    }


    public static void apresentarInformacoesFinais(double area, double larguraIdealMaterial, String orcamento){
        System.out.printf("A área total de material usado foi: %.3f", area, "m");
        System.out.println("\nA largura do material foi de: " + larguraIdealMaterial + "m");
        System.out.println("O orçamento ficou em: R$ " + orcamento);
    }


}
