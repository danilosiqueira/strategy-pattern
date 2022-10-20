package com.daniloss;

public class App 
{
    // Cliente
    public static void main( String[] args )
    {
        // Estratégia
        Frete frete = new EnvioProprio();

        // Contexto
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete(frete);

        double freteTotal = calculadoraFrete.calcular(100);

        System.out.println(String.format("O valor total do frete é %s reais com %s.", freteTotal, frete.getClass().getSimpleName()));

        frete = new EnvioCorreios();
        calculadoraFrete.setFrete(frete);
        freteTotal = calculadoraFrete.calcular(100);

        System.out.println(String.format("O valor total do frete é %s reais com %s.", freteTotal, frete.getClass().getSimpleName()));
    }
}
