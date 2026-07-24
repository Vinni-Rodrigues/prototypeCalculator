package com.github.vinnirodrigues.service;

import com.github.vinnirodrigues.model.Material;



public class CalculadoraOrcamento {

    public static double valorMetroQuadrado(Material materialSelecionado){
        return materialSelecionado.getValorMetroQuadrado();
    }

    public static double areaMaterialTotal(double maiorLado, double larguraIdealMaterial){
        return maiorLado * larguraIdealMaterial;
    }


    public static double calcularPreviaOrcamento(double areaFormatada, double valorM2){
        return  areaFormatada * valorM2;
    }

}
