
import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.println("digite a nota I: ");
        double n1 = sc.nextInt();
        System.out.println("digite a nota II: ");
        double n2 = sc.nextInt();
        System.out.println("digite a nota III: ");
        double n3 = sc.nextInt();
        System.out.println("digite a nota IV: ");
        double n4 = sc.nextInt();
        System.out.println("digite a nota V: ");
        double n5 = sc.nextInt();

        double media = (n1+n2+n3+n4+n5) / 5;
        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Aprovado!");
        }
        else if (media >= 5) {
            System.out.println("Reprovado!");
        }
            sc.close();
        }


    }
