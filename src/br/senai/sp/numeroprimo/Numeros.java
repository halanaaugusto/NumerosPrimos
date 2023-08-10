package br.senai.sp.numeroprimo;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int numPrimo = 1;

        Scanner teclado = new Scanner(System.in);

        while(numPrimo % 2 != 0){
            System.out.println("Olá, boa tarde!!");
            System.out.println("Digite um número: ");
            if(teclado.hasNextInt()){
                numPrimo = teclado.nextInt();
            } else {
                System.out.println("Digite um número válido!!");
                teclado.next();
            }
        }

    }
}
