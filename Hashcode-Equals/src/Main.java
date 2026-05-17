public class Main {
    public static void main(String[] args) {

        User user1 = new User("math", "123");
        User user2 = new User("math", "123");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));
    }

}