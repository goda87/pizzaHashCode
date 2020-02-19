package hub.pizza.team;

import java.util.Arrays;

class Input {
    public int M;
    public int N;
    public int[] types;

    @Override
    public String toString() {
        return "Input{" +
                "M=" + M +
                ", N=" + N +
                ", types=" + Arrays.toString(types) +
                '}';
    }
}

class Output {
    public int numberOfpizzas;
    public int[] selectedPizzas;

    @Override
    public String toString() {
        return "Output{" +
                "numberOfpizzas=" + numberOfpizzas +
                ", selectedPizzas=" + Arrays.toString(selectedPizzas) +
                '}';
    }
}
