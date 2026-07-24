package com.github.vinnirodrigues.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class utilitarios {

    private static final NumberFormat FORMATADOR_REAIS =
            NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public static String paraReais(double valor){
        return FORMATADOR_REAIS.format(valor);
    }

    public static double formatarArea(double areaMaterialUsada){
        return Math.floor((areaMaterialUsada / 1000) * 1000);
    }

}
