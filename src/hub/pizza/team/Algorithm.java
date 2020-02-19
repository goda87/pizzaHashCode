package hub.pizza.team;

public interface Algorithm {
    default String name() {
        return "Not named yet";
    }
    Output calculate(Input input);
}
