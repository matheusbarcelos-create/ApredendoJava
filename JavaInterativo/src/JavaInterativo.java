import java.util.Scanner;
//permite interagir

public class JavaInterativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String name = scanner.nextLine();
        //armazena oque eu escrever

        System.out.println("Hello " + name);


    }
}