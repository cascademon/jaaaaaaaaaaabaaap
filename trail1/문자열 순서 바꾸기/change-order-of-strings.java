import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + "\n" + b);
    }
}