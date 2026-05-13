import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int []{1,5,33,45,57,60,72,13,69,110};
        Arrays.sort(numeros);
        System.out.println(numeros); // <-- hashcode (identificador).

        System.out.println(Arrays.toString(numeros)); // <-- puxa o conteúdo direto;
    }
}