package hub.pizza.team;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int M;
    static int N;
    static int[] types;

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here


        System.out.println("helloWorld");
        readFile();

        System.out.println(String.format("M is %d", M));
        System.out.println(String.format("N is %d", N));
        System.out.println(String.format("types is %s", Arrays.toString(types)));





    }

    private static void readFile() throws FileNotFoundException {
        File f = new File("test.txt");
        FileInputStream is = new FileInputStream(f);
        Scanner sc = new Scanner (is);
        M = Integer.parseInt(sc.next());
        N = Integer.parseInt(sc.next());
        types = new int[N];
        for (int i = N-1; i >= 0; i--) {
            types[i] = Integer.parseInt(sc.next());
        }
        sc.close();
    }
}
