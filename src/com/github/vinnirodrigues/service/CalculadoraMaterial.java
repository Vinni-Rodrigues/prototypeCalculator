package com.github.vinnirodrigues.service;

import com.github.vinnirodrigues.model.Material;
import com.github.vinnirodrigues.repository.CatalagoMaterias;

import java.util.ArrayList;

public class CalculadoraMaterial {

    public static double IdentificarLadoMenor(double largura, double comprimento) {
        return Math.min(largura, comprimento);
    }

    public static double IdentificarLadoMaior(double largura, double comprimento) {
        return Math.max(largura, comprimento);
    }

    public static double checarCompatibilidadeTrabalhoMaterial
            (double menorLado, Material materialSelecionado) {


        for (int i = 0; i < materialSelecionado.getLargurasDisponiveis().size(); i++) {

            if (menorLado < materialSelecionado.getLargurasDisponiveis().get(i)) {
                return materialSelecionado.getLargurasDisponiveis().get(i);
            }

        }

        return 0.0;
    }


    public static Material checarValidadeOpcao(int opcao, ArrayList<Material> materiais){

        Material materialSelecionado = new Material("", 0);

        if(opcao > 0 && opcao <= materiais.size()){
            materialSelecionado = CatalagoMaterias.getListaMateriais().get(opcao - 1);
        } else {
            System.err.println("OPÇÃO INVÁLIDA! Tente novamente, com uma opção válida.");
        }

        return materialSelecionado;
    }

}
