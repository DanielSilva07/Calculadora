package br.com.danielsilva;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void somarTest(){
        int soma = Calculadora.soma(5,7);
        Assert.assertEquals(12, soma);
    }

    @Test
    public void subtrairTest(){
        int subtrair = Calculadora.subtracao(10,7);
        Assert.assertEquals(3,subtrair );
    }

    @Test
    public void multiplicacaoTest(){
        int multiplicacao = Calculadora.multiplicacao(10,7);
        Assert.assertEquals(70,multiplicacao );
    }

    @Test
    public void divisaoTest(){
        double divisao = Calculadora.divisao(10,5);
        Assert.assertEquals(2.0, divisao, 0 );
    }


}