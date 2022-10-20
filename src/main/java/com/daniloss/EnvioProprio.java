package com.daniloss;

public class EnvioProprio implements Frete {

    @Override
    public double calcular(double distancia) {
        return distancia * 2;
    }
    
}
