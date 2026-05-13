import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {

        Random generate = new Random();
         //biblioteca para números aleatórios



        //for(tipo da variavel e sua atribuiÇão EXP: int i = 0 ;
            // condiÇão para o looping EXP: i < 3 ;
                //para acrescentar +1 no valor da variável até chegar no ponto da condiÇão = i++)


        //int i = 0 tipo da variável e atribuiÇão para a variável
            //while ( condiÇão para o looping EXP: i < 9)
                // i++ para acrescentar +1 no valor da variavél até chegar na condiÇão


       //int i = 0;
       //while (i < 5) {
            //int number = generate.nextInt(60);
            //System.out.println(number);
            //i++;
        //}

        for(int i = 0; i < 5; i++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }

    }
}