package com.loiane.cursojava;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);

        result = result  - 1;
        System.out.println(result);

        result = result * 2;
        System.out.println(result);

        result = result / 2;
        System.out.println(result);

        result = result + 8;
        System.out.println(result);

        result = result % 7;
        System.out.println(result);

        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        result++;
        System.out.println(result); //4

        System.out.println(result++); //4
        //mesma coisa que:
        //System.out.println(result);
        //result = result + 1

        System.out.println(result); //5
        System.out.println(++result);
        //mesma coisa que:
        //result = result + 1;
        //System.out.println(result);



    }
}
