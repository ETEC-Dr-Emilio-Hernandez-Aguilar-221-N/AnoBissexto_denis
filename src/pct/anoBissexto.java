/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class anoBissexto {
    public static void main(String[] args) {
        //variaveis
        int ano;
        //entrada
        Scanner entrada = new Scanner(System.in);
        //aprensentação
        System.out.println("Bem vindo!!!");
        System.out.println("Digite o ano para saber se ele é bissexto: ");
        ano = entrada.nextInt();
        //condicionais
        if ((ano%4)==0){
            System.out.printf("O ano %d é bissexto!!", ano);
        }else{
            System.out.printf("O ano %d não é bissexto!!!", ano);
        }
        
    }
    
}
