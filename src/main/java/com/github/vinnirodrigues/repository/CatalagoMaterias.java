package com.github.vinnirodrigues.repository;

import com.github.vinnirodrigues.model.Material;

import java.util.ArrayList;
import java.util.List;

public class CatalagoMaterias {

    private static final ArrayList<Material> listaMateriais = new ArrayList<>();

    static {

        Material AdesivoRitrama = new Material("Adesivo Vinilico Ritrama",  120);
        AdesivoRitrama.adicionarLargura(1.06);
        AdesivoRitrama.adicionarLargura(1.55);
        listaMateriais.add(AdesivoRitrama);


        Material AdesivoVinil = new Material("Adesivo Vinilico", 100);
        AdesivoVinil.adicionarLargura(1.06);
        AdesivoVinil.adicionarLargura(1.27);
        listaMateriais.add(AdesivoVinil);

        Material AdesivoPerfurado = new Material("Adesivio Vinil Perfurado", 120);
        AdesivoPerfurado.adicionarLargura(1.06);
        AdesivoPerfurado.adicionarLargura(1.37);
        listaMateriais.add(AdesivoPerfurado);

        Material AdesivoAutomotivo = new Material("Adesivo Vinil Automotivo", 150);
        AdesivoAutomotivo.adicionarLargura(1.37);
        listaMateriais.add(AdesivoAutomotivo);


        Material Lona = new Material("Lona", 85);
        Lona.adicionarLargura(0.70);
        Lona.adicionarLargura(1.01);
        Lona.adicionarLargura(1.10);
        Lona.adicionarLargura(1.40);
        Lona.adicionarLargura(1.60);
        Lona.adicionarLargura(1.80);
        listaMateriais.add(Lona);


    }

    public static List<Material> getListaMateriais() {
        return listaMateriais;
    }


}