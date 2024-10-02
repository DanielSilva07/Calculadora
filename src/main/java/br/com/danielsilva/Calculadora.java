package br.com.danielsilva;

//metodo soma , faz operacao matematica de somar dois numeros
//metodo subtracao ,faz operacao matematica de subtrair dois numeros
//metodo multiplicacao , faz operacao matematica de multiplicaçao dois numeros
//metodo divisao ,faz operacao matematica de dividir dois numeros

public class Calculadora {
    public static void main(String[] args) {


        System.out.println( soma(8,5 ));
        System.out.println( subtracao(7,5 ));
        System.out.println( multiplicacao(3,5 ));
        System.out.println( divisao(10,0 ));

    }


    public static int soma(int a ,  int b){
        return a + b ;
    }
    public static int subtracao(int a ,  int b){
        return a - b ;
    }
    public static int multiplicacao(int a ,  int b){
        return a * b ;
    }
    public static double divisao(double a ,  double b){
        return a / b ;
    }








}






