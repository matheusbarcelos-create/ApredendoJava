public class Main {
    public static void main(String[] args) {

        User ab = new User("matheus", "415los");
        User cd = new User("almeida", "m124");
        User de = new User("daniel", "4a5los");


        System.out.println(ab.getCount());
        System.out.println(cd.getCount());
    }
}

//quando static é aplicado o "contador" e aplicado
// não é necessário repetir o método em todos.

// ou seja quando static aplicado em uma classe:
// todos os objetos daquela classe receberão o static e seus fundamentos

//geralmente ultilizado para tipos ultilitários.

//classe sempre é um molde para sair multiplos objetos de dentro dele.