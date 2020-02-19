package hub.pizza.team;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int bestResult;
    static int[] pizzas;

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("helloWorld");
        Input input = readFile("test.txt");
        System.out.println(input.toString());

        Algorithm greedy = new GreedyAlgorithm();
        Output output = greedy.calculate(input);
        writeResult(output, greedy.name());

    }

    private static void doCalculations() {
        //TODO algoritmo aqui
    }

    private static void writeResult(Output output, String fileName) throws IOException {

        System.out.printf("Writing to %s\n", fileName);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < output.numberOfpizzas; i++) {
            sb.append(String.format("%d ", output.selectedPizzas[i]));
        }
        String firstLine = String.format("%d", output.numberOfpizzas);
        String secondLine = sb.toString();

        // Console output
        System.out.println(firstLine);
        System.out.println(secondLine);

        // file output
        FileWriter fileWriter = new FileWriter(fileName);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(firstLine);
        printWriter.println(secondLine);
        printWriter.close();
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
