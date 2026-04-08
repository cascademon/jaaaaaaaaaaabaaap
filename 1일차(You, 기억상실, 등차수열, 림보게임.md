## 목차: 1.You 2.기억상실 3.등차수열 4.림보게임


1. ### You
'''java
import java.io.*;

import java.util.*; 

public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        String a = scanner.nextLine();
        
        if (a.equals(\"You\")) {
            System.out.println(\"Me\");
        } else {
            System.out.println(\"No\");
        }
    }
}
'''

// 기억상실

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> heights = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            heights.add(scanner.nextInt());
        }

        boolean success = true;
        for (int i = 0; i < n; i++) {
            int h = heights.get(i);
            if (h <= 160) {
                System.out.println(\"I \" + h);
                success = false;
                break;
            }
        }

        if (success) {
            System.out.println(\"P\");
        }
    }
}

----------------------------------------------------------------------------
// 등차수열

import java.io.*;

import java.util.*; 

public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
        int n = scanner.nextInt();
        int count=1;
        
        while (true) {
            a=a+b;
            count++;
            if (count==n) {
                break;
            }
        }
        
        System.out.println(a); 

    }
}

----------------------------------------------------------------------------
//림보게임

import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> heights = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            heights.add(scanner.nextInt());
        }

        boolean success = true;
        for (int i = 0; i < n; i++) {
            int h = heights.get(i);
            if (h <= 160) {
                System.out.println("I " + h);
                success = false;
                break;
            }
        }

        if (success) {
            System.out.println("P");
        }
    }
}
