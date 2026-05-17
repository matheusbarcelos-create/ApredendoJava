import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero inteiro: ");
        int num = sc.nextInt();

        while(num >= 0 ) {
            System.out.println(num);
            num = sc.nextInt();
            num--;

        }
        System.out.println("FIM!");
        sc.close();
    }

}