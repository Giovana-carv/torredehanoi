package com.torredehanoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de discos: ");
        int n = sc.nextInt();

        TorresDeHanoi h = new TorresDeHanoi();
        long inicio = System.nanoTime();

        h.resolver(n, 'A', 'B', 'C');

        long tempo = System.nanoTime() - inicio;
        System.out.println("Total de movimentos: " + h.movimentos);
        System.out.printf("Tempo: %02d:%02d:%02d:%02d%n",
                tempo / 3600000000000L,
                (tempo / 60000000000L) % 60,
                (tempo / 1000000000L) % 60,
                (tempo / 10000000L) % 100);

        sc.close();
    }
}

