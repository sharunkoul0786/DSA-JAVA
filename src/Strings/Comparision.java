package Strings;

public class Comparision {
    public static void main(String[] args) {
        String  a = "sharun";
        String b = "sharun";
        System.out.println(a==b);
        String x = new String("sharun");
        String y = new String("sharun");
        System.out.println(x==y);
        System.out.println(x.equals(y));
    }
}
