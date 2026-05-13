public class ManipulandoStrings {
    public static void main(String[] args) {

        //manipulando
        String x = "gelo Gelado";

        System.out.println(x.length());
        System.out.println(x + " vai se fuder ");
        System.out.println(x.contains("bosta"));
        System.out.println(x.indexOf("gelo"));
        System.out.println(x.lastIndexOf("gelo"));
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.trim());
        System.out.println(x.substring(9));

        System.out.println(x.equals("gelo"));
    }
}