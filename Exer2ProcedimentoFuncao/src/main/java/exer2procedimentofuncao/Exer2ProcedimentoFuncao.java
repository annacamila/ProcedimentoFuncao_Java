/*
 2. Faça um programa que receba dois números inteiros. Implemente as seguintes sub-rotinas:
 a. soma(int a , int b): retorna a soma de a com b
 b. subtracao(int a, int b): retorna a diferença entre a e b
 c. multiplicacao(int a, int b): retorna a multiplicação de a por b
 d. Todas as sub-rotinas devem usar somente as operações de soma e subtração.
 */

package exer2procedimentofuncao;

import java.util.*;

public class Exer2ProcedimentoFuncao {
    public static int Soma(int a, int b){
        return a + b;
    }
    public static int Subtracao(int a, int b){
        if(a > b) return a - b;
        return b + a;
    }
    public static int Multiplicacao(int a, int b){
        int produto = 0;
        for(int i = 0; i < b; i++){
            produto += a;
        }
        return produto;
    }

    public static void main(String[] args) {
        System.out.printf(" A soma de 8 e 24 é %d \n", Soma(8,24));  
        System.out.printf(" A subtração entre 24 e 8 é %d \n", Subtracao(24,8)); 
        System.out.printf(" A multiplicação de 8 e 24 é %d \n", Multiplicacao(8,24)); 
    }
}
