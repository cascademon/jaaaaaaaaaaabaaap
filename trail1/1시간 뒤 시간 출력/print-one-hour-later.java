import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] arr = time.split(":");
        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        h += 1;
        System.out.println(h + ":" + m);
    }
}