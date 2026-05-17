import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Fatorial de : " + num + " = " + result);
        sc.close();

    }
}