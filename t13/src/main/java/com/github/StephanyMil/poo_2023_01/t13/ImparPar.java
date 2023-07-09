package com.github.StephanyMil.poo_2023_01.t13;

public class ImparPar {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Números Pares:");
        imprimirPares(numeros);

        System.out.println("\nNúmeros Ímpares:");
        imprimirImpares(numeros);
    }

    public static void imprimirPares(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void imprimirImpares(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
