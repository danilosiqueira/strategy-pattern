package com.daniloss;

public class CalculadoraFrete {

    private Frete frete;

    public CalculadoraFrete(Frete frete) {
        this.frete = frete;
    }

    public double calcular(double distancia) {
        return this.frete.calcular(distancia);
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
