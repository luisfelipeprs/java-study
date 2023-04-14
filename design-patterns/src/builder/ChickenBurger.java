package builder;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public float prince() {
        return 0;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}