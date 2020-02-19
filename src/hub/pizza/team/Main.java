package hub.pizza.team;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Algorithm[] algorithms = {
            new GreedyAlgorithm(),
            new BruteForceAlgortihm()
    };

    static String[] dataSets = {
            "a_example.in",
            "b_small.in",
            "c_medium.in",
            "d_quite_big.in",
            "e_also_big.in"
    };

    public static void main(String[] args) throws IOException {
	// write your code here
        doCalculations();
    }

    private static void doCalculations() throws IOException {

        for (Algorithm algorithm: algorithms) {
            for (String test: dataSets) {
                writeResult(
                    algorithm.calculate(readFile(test)),
                    String.format("results/Result_%s_%s", algorithm.name(), test)
                );
            }
        }
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
        File f = new File("inputs/" + filename);
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
