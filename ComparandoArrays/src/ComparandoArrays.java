import java.util.Arrays;

public class ComparandoArrays {
    public static void main(String[] args) {
            int[] numerosA = new int[]{1, 2, 3}; //<- são espaços diferentes alocados na memório
            int[] numerosB = new int[]{1, 2, 3}; //<- são espaços diferentes alocados na memório

            System.out.println(numerosA == numerosB);
            System.out.println(numerosA.equals(numerosB));
            System.out.println(numerosA + " " + numerosB); //<- mostra hashcode(código de indentificação)
            System.out.println(Arrays.equals(numerosA, numerosB)); //<- compara se o conteúdo e igual
    }
}