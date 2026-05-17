// Leia um valor em Reais e converta para Dólar e Euro
// (use taxas fixas como 1 USD = 5.00 BRL e 1 EUR = 5.50 BRL).
// Conceitos: Scanner, double, operações matemáticas

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double taxaD = 5.00;
        double taxaE = 5.50;

        System.out.println("Digete um valor em REAIS: ");
        double reais = sc.nextDouble();

       double dolar = reais /  taxaD;
       double euro = reais / taxaE;

        System.out.printf("Dólar: U$ %.2f%n", dolar);
        System.out.printf("Euro:  € %.2f%n", euro);

        sc.close();
    }
}