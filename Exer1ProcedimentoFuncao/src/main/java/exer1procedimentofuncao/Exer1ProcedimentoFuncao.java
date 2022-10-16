/*
 1. Faça um programa contendo sub-rotinas que recebam:
 a. Um número inteiro e que retorne o dobro deste número
 b. Dois números inteiros e que retorne o maior entre eles
 c. Três números reais e que retorne a média aritmética desses três números
 d. Um número inteiro e que retorne o valor do fatorial deste número
 e. Um número inteiro e positivo, que retorne a soma dos elementos inteiros existentes entre 1 e o número (inclusive)
 */
package exer1procedimentofuncao;

import java.util.*;

public class Exer1ProcedimentoFuncao {

    public static int CalculaDobro(int n) {
        return n * 2;
    }

    public static int MaiorNumero(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }

    public static double MediaArit(double n1, double n2, double n3) {
        return ((n1 + n2 + n3) / 3);
    }

    public static int Fat(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int SomaElementos(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.printf("O dobro de 8 é %d \n", CalculaDobro(8));
        System.out.printf("O maior número entre 6 e 44 é %d \n", MaiorNumero(6, 44));
        System.out.printf("A média aritmética de 6.5, 8 e 9.5 é %2f \n", MediaArit(6.5, 8, 9.5));
        System.out.printf("O fatorial de 5 é %d \n", Fat(5));
        System.out.printf("A soma dos elementos inteiros existentes entre 1 e 5 é %d \n", SomaElementos(5));
    }
}

