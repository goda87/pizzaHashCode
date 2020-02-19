package hub.pizza.team;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int bestResult;
    static int[] pizzas;

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        System.out.println("helloWorld");
        Input input = readFile("test.txt");
        System.out.println(String.format("M is %d", input.M));
        System.out.println(String.format("N is %d", input.N));
        System.out.println(String.format("types is %s", Arrays.toString(input.types)));


    }

    private static void doCalculations() {
        //TODO algoritmo aqui
    }

    private static void writeResult() {
    }

    private static Input readFile(String filename) throws FileNotFoundException {
        Input input = new Input();
        File f = new File(filename);
        FileInputStream is = new FileInputStream(f);
        Scanner sc = new Scanner (is);
        input.M = Integer.parseInt(sc.next());
        input.N = Integer.parseInt(sc.next());
        input.types = new int[input.N];
        for (int i = 0; i < input.N; i++) {
            input.types[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        return input;
    }
}
