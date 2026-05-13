public class Escopo {
    public static void main(String[] args) {
        //escopo de variaveis

        int x; //processo de declaraÇão

        if (true){
            int x = 10; // variavel local
                        // essa atribuiÇão funcional somente dentro do bloco de cod{}
        }
        else {
            x = 2; // variavel local
                    //essa atribuiÇão funciona somente neste bloco de cod{}
        }
    }
}