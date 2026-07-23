package com.github.vinnirodrigues.model;

import java.util.ArrayList;
import java.util.Collections;

public class Material {

    private String tipoMaterial;
    private static double valorMetroQuadrado;
    private ArrayList<Double> largurasDisponiveis;


    public Material(String tipoMaterial, double valorMetroQuadrado) {
        this.valorMetroQuadrado = valorMetroQuadrado;
        this.largurasDisponiveis = new ArrayList<>();
        this.tipoMaterial = tipoMaterial;
    }


    public void adicionarLargura(double largura){
        this.largurasDisponiveis.add(largura);
        Collections.sort(this.largurasDisponiveis);
    }


    public double getValorMetroQuadrado() {
        return valorMetroQuadrado;
    }

    public void setValorMetroQuadrado(double valorMetroQuadrado) {
        Material.valorMetroQuadrado = valorMetroQuadrado;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        tipoMaterial = tipoMaterial;
    }


    public ArrayList<Double> getLargurasDisponiveis() {
        return largurasDisponiveis;
    }

    public void setLargurasDisponiveis(ArrayList<Double> largurasDisponiveis) {
        this.largurasDisponiveis = largurasDisponiveis;
    }




}
