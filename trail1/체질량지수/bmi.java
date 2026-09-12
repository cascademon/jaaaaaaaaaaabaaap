import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = h * h;
        int e = 10000 * w;
        if (e / k >= 25) {
            System.out.println((e/k) + "\n" + "Obesity");
        } else {
            System.out.println(e/k);
        }
    }
}