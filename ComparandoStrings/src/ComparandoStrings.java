import java.util.Scanner;

public class ComparandoStrings {
    public static void main(String[] args) {
        //comparando

        String pass = "123123";

        System.out.println("Digite sua senha: ");

        Scanner sc = new Scanner(System.in);
        String senha = sc.nextLine();

        System.out.println(pass.equals(senha));
        //equals usado na maioria das vezes para verificar o conteudo digitado.
    }
}