package hub.pizza.team;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BruteForceAlgortihm implements Algorithm {

    @Override
    public String name() {
        return "BruteForce";
    }

    @Override
    public Output calculate(Input input) {
        Maybe bestSoFar = new Maybe();
        bestSoFar.numberOfSlices = 0;
        bestSoFar.numberOfpizzas = 0;
        bestSoFar.selectedPizzas = new int[0];
        for (int i = 1; i <= input.N; i++) {
            Maybe candidate = bestof(i, input);
            if (candidate.numberOfSlices > bestSoFar.numberOfSlices) {
                bestSoFar = candidate;
                if (bestSoFar.numberOfSlices == input.M) {
                    break;
                }
            }
        }
        return bestSoFar;
    }

    private Maybe bestof(int n, Input input) {
        List<Maybe> combinations = posibleCombinations(n, null);
        Maybe bestSoFar = combinations.get(0);
        for (Maybe c: combinations) {
            if (c.numberOfSlices > bestSoFar.numberOfSlices) {
                bestSoFar = c;
                if (bestSoFar.numberOfSlices == input.M) {
                    break;
                }
            }
        }
        return bestSoFar;
    }

    private List<Maybe> posibleCombinations(int n, List<Pizza> pizzas) {

        return null;
    }

    private List<List<Pizza>> GrupsOfOne(List<Pizza> current, List<Pizza> remainingPizzas) {
        List<List<Pizza>> grups = new ArrayList<>(remainingPizzas.size());

        for (Pizza pizza: remainingPizzas) {
            List<Pizza> clone = clone(current);
            clone.add(pizza);
            grups.add(clone);
        }
        return grups;
    }

    private List<Pizza> clone(List<Pizza> clonable) {
        List<Pizza> clone = new LinkedList<>();
        for (Pizza pizza: clonable) {
            clone.add(pizza);
        }
        return clone;
    }

}

class Maybe extends Output {
    public int numberOfSlices;
}

class Pizza {
    public int position;
    public int slices;
    public Pizza(int position, int slices) {
        this.position = position;
        this.slices = slices;
    }
}