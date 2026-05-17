import java.util.Arrays;

public class PreenchendoArrays {
    public static void main(String[] args) {

        String nomes[] = new String[10];
        System.out.println(Arrays.toString(nomes)); //<- cria o espaço necessário
        Arrays.fill(nomes,"TESTE");
        System.out.println(Arrays.toString(nomes)); //<- coloca valores (padrões) sem necessidade de preenchimento.
    }
}