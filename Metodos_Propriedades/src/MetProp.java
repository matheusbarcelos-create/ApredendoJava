public class MetProp {
    public static void main(String[] args) {

        Use userA = new Use();
        userA.name = "math";
        userA.lastname = "barc";
        String fullname = userA.getFullname();

        System.out.println(fullname);
    }
}