import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite um numero : ");
        int x = scanner.nextInt();

        System.out.println("digite outro numero : ");
        int y = scanner.nextInt();

        System.out.println("Qual operaÇão : somar, subtrair, multiplicar, dividir." );
        String op = scanner.next();


        if(op.equals("somar")){
            sum(x,y);


        }
        else if(op.equals("subtrair")){
            minus(x,y);


        }
        else if(op.equals("multiplicar")){
            multiply(x,y);


        }
        else if(op.equals("dividir")) {
            division(x, y);

        }
        else{
            System.out.println("TUDO ERRADO!");
        }
        scanner.close();
}
    static void sum(int x, int y){
        System.out.println("a soma é : " + (x + y));
 }

    static void minus(int x, int y){
        System.out.println("a subtraÇão é : " + (x - y));
    }

    static void multiply(int x, int y){
        System.out.println("a multiplicaÇão é : " + (x * y));
    }

    static void division(int x, int y){
        System.out.println("a divisão é : " + (x / y) );
    }
}



