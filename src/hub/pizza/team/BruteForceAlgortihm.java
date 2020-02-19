package hub.pizza.team;

import java.util.ArrayList;
import java.util.List;

public class BruteForceAlgortihm implements Algorithm {

    @Override
    public String name() {
        return "BruteForce";
    }

    @Override
    public Output calculate(Input input) {
        int remaining = input.M;
        int number = 0;
        List<Integer> positions = new ArrayList<>();

        for (int i = input.N -1; i >= 0; i--) {
            if (input.types[i] <= remaining) {
                number++;
                positions.add(i);
                remaining -= input.types[i];
            }
        }

        Output output = new Output();
        output.numberOfpizzas = number;
        output.selectedPizzas = new int[positions.size()];

        for (int i = 0; i < positions.size(); i++) {
            output.selectedPizzas[i] = positions.get(i);
        }
        return output;
    }
}
